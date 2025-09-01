SET @max =
        (
            SELECT MAX(price) AS price
            FROM food_product
        );

SELECT product_id, product_name, product_cd, category, price
FROM food_product
WHERE price = @max