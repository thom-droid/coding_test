SELECT t2.price AS PRICE_GROUP, count(t2.product_id) AS PRODUCTS
FROM
    (
        SELECT product_id, TRUNCATE(price, -4) as price
        FROM product
    ) AS t2
group by t2.price
ORDER BY 1