-- 코드를 작성해주세요
SELECT year(ym) AS year,
ROUND(AVG(PM_VAL1), 2) as 'PM10',
        ROUND(AVG(PM_VAL2), 2) AS 'PM2.5'
FROM air_pollution
WHERE location2 ='수원'
GROUP BY year(YM)
ORDER BY year(YM)