-- 코드를 입력하세요
WITH avg_rent as (
    SELECT car_id, ROUND(AVG(DATEDIFF(end_date, start_date) + 1), 1) as days
    FROM CAR_RENTAL_COMPANY_RENTAL_HISTORY
    GROUP BY car_id
)
SELECT CAR_ID,
       days as AVERAGE_DURATION
FROM avg_rent ar
WHERE days >= 7
ORDER BY days DESC,
         car_id DESC;