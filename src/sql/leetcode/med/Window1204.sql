SELECT person_name
FROM ( SELECT person_name,
              ROW_NUMBER() OVER (ORDER BY w DESC) AS o
       FROM ( SELECT person_name,
                     SUM(weight) OVER (w) AS w
              FROM queue1204
              WINDOW w AS (ORDER BY turn) ) aug_w
       WHERE w <= 1000 ) aug_w2
WHERE o = 1;

