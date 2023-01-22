WITH RECURSIVE HOURTABLE AS
                   (
                       SELECT 0 AS n
                       UNION ALL
                       SELECT n + 1 FROM HOURTABLE WHERE n < 23
                   )

SELECT HT.N HOUR, COALESCE (COUNT(AO.ANIMAL_ID), 0) COUNT
FROM HOURTABLE HT
         LEFT JOIN ANIMAL_OUTS AO
                   ON HOUR(AO.DATETIME) = HT.N
GROUP BY HT.N