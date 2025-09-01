SELECT SUBSTR(product_code, 1, 2) AS category, count(product_code) AS products
FROM product
GROUP BY category

