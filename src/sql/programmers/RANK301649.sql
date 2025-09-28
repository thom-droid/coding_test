WITH ranked AS ( SELECT NTILE(4) OVER (ORDER BY size_of_colony DESC) AS q,
                        id,
                        size_of_colony
                 FROM programmers.ecoli_data )
SELECT id,
       CASE
           WHEN q = 1 THEN 'CRITICAL'
           WHEN q = 2 THEN 'HIGH'
           WHEN q = 3 THEN 'MEDIUM'
           ELSE 'LOW' END AS colony_name
FROM ranked
ORDER BY id;

