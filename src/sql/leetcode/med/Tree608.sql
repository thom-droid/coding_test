WITH parent AS ( SELECT p_id
                 FROM tree608
                 WHERE p_id IS NOT NULL
                 GROUP BY p_id ),
    inner_node as ( SELECT p_id
                FROM tree608
                WHERE p_id IS NOT NULL
                GROUP BY p_id
                HAVING COUNT(id) > 0 ),
     child AS ( SELECT id
                FROM tree608
                WHERE p_id IS NOT NULL )
SELECT id, CASE
           WHEN p_id IS NULL THEN 'ROOT'
           WHEN id in (select * from inner_node) THEN 'INNER'
           ELSE 'LEAF'
           END AS type
FROM tree608;

