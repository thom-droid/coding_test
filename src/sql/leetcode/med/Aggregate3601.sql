SELECT a.driver_id,
       b.driver_name,
       ROUND(first_half_avg, 2)                   AS first_half_avg,
       ROUND(second_half_avg, 2)                  AS second_half_avg,
       ROUND(second_half_avg - first_half_avg, 2) AS efficiency_improvement
FROM ( SELECT driver_id,
              AVG(CASE WHEN MONTH(trip_date) <= 6 THEN distance_km / fuel_consumed END) AS first_half_avg,
              AVG(CASE WHEN MONTH(trip_date) >= 7 THEN distance_km / fuel_consumed END) AS second_half_avg
       FROM trips3601
       GROUP BY driver_id
       HAVING SUM(CASE WHEN MONTH(trip_date) <= 6 THEN 1 ELSE 0 END) > 0
          AND SUM(CASE WHEN MONTH(trip_date) >= 7 THEN 1 ELSE 0 END) > 0 ) a
JOIN drivers3601                                                           b ON a.driver_id = b.driver_id
WHERE first_half_avg < second_half_avg
ORDER BY efficiency_improvement DESC,
         b.driver_name;

WITH drivers AS ( SELECT a.driver_id,
                         c.driver_name,
                         ROUND(AVG(a.distance_km / a.fuel_consumed), 2)                                        AS first_half_avg,
                         ROUND(AVG(b.distance_km / b.fuel_consumed), 2)                                        AS second_half_avg,
                         ROUND(AVG(b.distance_km / b.fuel_consumed) - AVG(a.distance_km / a.fuel_consumed),2)  AS efficiency_improvement
                  FROM trips3601   a
                  JOIN trips3601   b ON a.driver_id = b.driver_id
                      AND EXTRACT(MONTH FROM a.trip_date) BETWEEN 1 AND 6
                      AND EXTRACT(MONTH FROM b.trip_date) BETWEEN 7 AND 12
                  JOIN drivers3601 c ON a.driver_id = c.driver_id
                  GROUP BY a.driver_id, c.driver_name
                  ORDER BY efficiency_improvement DESC,
                           c.driver_name )
SELECT *
FROM drivers
WHERE efficiency_improvement > 0;



