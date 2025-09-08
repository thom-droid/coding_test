WITH ordered AS ( SELECT lat_n,
                         ROW_NUMBER() OVER (ORDER BY lat_n) AS rk,
                         COUNT(*) OVER ()                   AS cnt
                  FROM station )
SELECT ROUND(
               CASE
                   WHEN cnt % 2 = 1 THEN
                           ( SELECT lat_n FROM ordered WHERE rk = (cnt + 1) / 2 )
                   ELSE ( SELECT AVG(lat_n) FROM ordered WHERE rk IN (cnt / 2, cnt / 2 + 1) )
                   END,
               4) AS median_lat_n
FROM ordered
LIMIT 1;


WITH orderedlatitudes AS ( SELECT lat_n,
                                  ROW_NUMBER() OVER (ORDER BY lat_n) AS rownum,
                                  COUNT(*) OVER ()                   AS totalrows
                           FROM station )
SELECT ROUND(
               CASE
                   WHEN totalrows % 2 = 1 THEN
                       -- Odd number of rows: select the middle value
                           ( SELECT lat_n FROM orderedlatitudes WHERE rownum = (totalrows + 1) / 2 )
                   ELSE
                       -- Even number of rows: average the two middle values
                       ( SELECT AVG(lat_n) FROM orderedlatitudes WHERE rownum IN (totalrows / 2, totalrows / 2 + 1) )
                   END,
               4
       ) AS median
FROM orderedlatitudes