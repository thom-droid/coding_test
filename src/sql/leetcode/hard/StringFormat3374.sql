WITH tokens AS (
  SELECT u.content_id,
         u.content_text,
         jt.ord,
         jt.w
  FROM user_content3374 AS u
  JOIN JSON_TABLE(
         CONCAT('["', REPLACE(LOWER(u.content_text), ' ', '","'), '"]'),
         '$[*]'
         COLUMNS(
           ord FOR ORDINALITY,
           w   VARCHAR(1000) PATH '$'
         )
       ) AS jt
)
SELECT content_id,
       content_text,
       GROUP_CONCAT(CONCAT(UPPER(LEFT(w,1)), SUBSTRING(w,2))
                    ORDER BY ord SEPARATOR ' ') AS formatted_text
FROM tokens
GROUP BY content_id, content_text;


SELECT content_id,
       content_text,
       st
FROM user_content3374
