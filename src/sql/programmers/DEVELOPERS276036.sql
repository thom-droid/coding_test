WITH grd_a AS ( SELECT f.code + py.code AS code
                FROM ( SELECT code
                       FROM skillcodes
                       WHERE category = 'Front End' )                     AS f
                CROSS JOIN
                    ( SELECT code FROM skillcodes WHERE name = 'Python' ) AS py ),
     grd_b AS ( SELECT * FROM skillcodes WHERE name = 'C#' ),
     grd_c AS ( SELECT * FROM skillcodes WHERE category = 'Front End' )
SELECT grade, id, email
FROM ( SELECT COALESCE(
                      CASE
                          WHEN EXISTS ( SELECT 1 FROM grd_a a WHERE d.skill_code & a.code = a.code ) THEN 'A'
                          WHEN EXISTS ( SELECT 1 FROM grd_b b WHERE d.skill_code & b.code = b.code ) THEN 'B'
                          WHEN EXISTS ( SELECT 1 FROM grd_c c WHERE d.skill_code & c.code = c.code ) THEN 'C'
                          END, '0') AS grade,
              d.id,
              d.email
       FROM developers d ) a
WHERE grade != '0'
ORDER BY grade, id;

