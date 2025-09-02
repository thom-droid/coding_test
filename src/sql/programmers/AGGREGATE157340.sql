WITH available AS (
    SELECT car_id
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    GROUP BY car_id
    HAVING SUM(start_date <= '2022-10-16' AND end_date >= '2022-10-16') >= 1
)
SELECT a.car_id,
        '대여중' as availability
FROM available a

UNION ALL

SELECT car_id,
        '대여 가능' as availability
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
WHERE car_id NOT IN (SELECT car_id FROM available)
GROUP BY car_id
ORDER BY car_id DESC;

-- more standardized version
WITH available AS (
    SELECT car_id
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    GROUP BY car_id
    HAVING SUM(CASE WHEN start_date <= '2022-10-16' AND end_date >= '2022-10-16' THEN 1 ELSE 0 END) >= 1
)
SELECT a.car_id,
        '대여중' as availability
FROM available a

UNION ALL

SELECT b.car_id,
        '대여 가능' as availability
FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY b
WHERE NOT EXISTS (SELECT 1 FROM available a WHERE a.car_id = b.car_id)
GROUP BY b.car_id
ORDER BY car_id DESC;