SELECT DISTINCT product_id,
                first_value(new_price) OVER(w) as price
FROM products1164
WHERE change_date <= '2019-08-16'
WINDOW w AS (PARTITION BY product_id ORDER BY change_date DESC)

union

SELECT product_id, 10 as v
from products1164
where product_id not IN ( SELECT product_id
                          FROM products1164
                          WHERE change_date <= '2019-08-16'
                          GROUP BY product_id
                          HAVING COUNT(*) >= 1 )



