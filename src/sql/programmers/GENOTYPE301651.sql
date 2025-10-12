WITH RECURSIVE
    gen AS ( SELECT id, 1 AS generation
             FROM ecoli_data
             WHERE parent_id IS NULL

             UNION ALL
             SELECT a.id, g.generation + 1
             FROM ecoli_data a
             JOIN gen        g ON a.parent_id = g.id ),
    p_has_c AS ( SELECT a.id
                 FROM ecoli_data a
                 JOIN ecoli_data b ON a.id = b.parent_id
                 GROUP BY a.id
                 HAVING COUNT(*) > 0 )
SELECT COUNT(g.id) AS count,
       generation
FROM gen          g
LEFT JOIN p_has_c p ON g.id = p.id
WHERE p.id IS NULL
GROUP BY generation
ORDER BY generation;

WITH RECURSIVE PARENT AS (
    SELECT ID, PARENT_ID, 0 DEPTH
      FROM ECOLI_DATA
     WHERE PARENT_ID IS NULL

    UNION ALL

    SELECT ED.ID, ED.PARENT_ID, P.DEPTH + 1 DEPTH
      FROM PARENT P
      LEFT OUTER JOIN ECOLI_DATA ED
        ON P.ID = ED.PARENT_ID
     WHERE P.ID IS NOT NULL
)SELECT * FROM parent;
SELECT
       COUNT(1) AS COUNT, DEPTH GENERATION
  FROM PARENT
 WHERE ID IS NULL
 GROUP BY ID, DEPTH
 ORDER BY DEPTH;
