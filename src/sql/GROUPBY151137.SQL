WITH tmp AS (
    select *
    FROM car_rental_company_car
    WHERE options LIKE '%통풍시트%'
       OR options LIKE '%열선시트%'
       OR options LIKE '%가죽시트%'
)

SELECT car_type, count(car_id) cars
FROM tmp
GROUP BY car_type
ORDER BY car_type