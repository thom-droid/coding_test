WITH RECURSIVE time AS(
    SELECT 9 AS hour
    UNION ALL
    SELECT hour + 1 FROM time WHERE hour < 19
)

SELECT t.hour, COUNT(a.animal_id) count
FROM time t
         LEFT JOIN animal_outs a
                   ON t.hour = HOUR(a.datetime)
GROUP BY t.hour