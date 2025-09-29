SELECT route,
        CONCAT(ROUND(SUM(d_between_dist), 1),'km') as total_distance,
        CONCAT(ROUND(AVG(d_between_dist), 2), 'km') as average_distance
FROM subway_distance
GROUP BY route
ORDER BY ROUND(SUM(d_between_dist), 1) DESC;