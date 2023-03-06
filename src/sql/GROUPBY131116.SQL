SELECT t1.category, t2.price max_price, t1.product_name
FROM food_product t1
         JOIN
     (
         SELECT category, MAX(price) price
         FROM food_product
         WHERE category IN ('과자', '국', '김치', '식용유')
         GROUP BY category
     ) AS t2
     ON t1.price = t2.price
         AND t1.category = t2.category
ORDER BY max_price DESC
