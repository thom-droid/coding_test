WITH a AS ( SELECT pid,
                   tiv_2015,
                   tiv_2016,
                   COUNT(CONCAT(lat, lon)) OVER (PARTITION BY CONCAT(lat, lon)) AS cnt1,
                   COUNT(tiv_2015) OVER (PARTITION BY tiv_2015)                 AS cnt2
            FROM insurance585 )
SELECT SUM(tiv_2016)
FROM a
WHERE cnt1 = 1
  AND cnt2 > 1;


