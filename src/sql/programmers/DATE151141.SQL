# # -- 코드를 입력하세요
# DATEDIFF(h.end_date, h.start_date) as DATE_DIFF, DATEDIFF(h.end_date, h.start_date) +1 AS DATE_DIFF2, c.CAR_ID, c.daily_fee,
SELECT h.history_id AS HISTORY_ID,

       TRUNCATE(
               (
                       CASE
                           WHEN ABS(DATEDIFF(h.end_date, h.start_date) + 1) >= 90 THEN 0.85
                           WHEN ABS(DATEDIFF(h.end_date, h.start_date) + 1) >= 30 THEN 0.92
                           WHEN ABS(DATEDIFF(h.end_date, h.start_date) + 1) >= 7 THEN 0.95
                           ELSE 1
                           END
                       * (ABS(DATEDIFF(h.end_date, h.start_date)) + 1 )
                       * c.daily_fee
                   ), 0
           ) AS FEE

FROM car_rental_company_car c
         LEFT JOIN car_rental_company_rental_history h
                   ON c.car_id = h.car_id
WHERE c.car_type = '트럭'
ORDER BY FEE DESC, HISTORY_ID DESC

/* ver2*/

    WITH tmp AS
(
    SELECT c.car_type, c.daily_fee, h.history_id, datediff(h.end_date, h.start_date) + 1 AS duration,
        CASE
            WHEN datediff(h.end_date, h.start_date) + 1 >= 90 THEN '90일 이상'
            WHEN datediff(h.end_date, h.start_date) + 1 >= 30 THEN '30일 이상'
            WHEN datediff(h.end_date, h.start_date) + 1 >= 7 THEN '7일 이상'
            ELSE ''
        END AS duration_type
    FROM car_rental_company_car c
    JOIN car_rental_company_rental_history h
    ON c.car_id = h.car_id
    WHERE c.car_type = '트럭'
)

SELECT t.history_id AS HISTORY_ID, TRUNCATE(((100 - IFNULL(p.discount_rate, 0)) / 100) * t.daily_fee * t.duration, 0) AS FEE
FROM tmp t
         LEFT JOIN car_rental_company_discount_plan p
                   ON t.duration_type = p.duration_type
                       AND t.car_type = p.car_type
ORDER BY FEE desc, HISTORY_ID desc