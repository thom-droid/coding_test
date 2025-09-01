WITH RECURSIVE pairs AS (
    SELECT product_id product1,
           product_id product2,
           user_id
    FROM productpurchases3554

    UNION ALL

    SELECT p.product1,
           a.product_id,
           a.user_id
    FROM productpurchases3554 a
    JOIN pairs p ON a.user_id = p.user_id
    WHERE a.product_id > p.product2
)
SELECT user_id,
       product1,
       product2
FROM PAIRS
WHERE product1 != product2
;

SELECT LEAST(a.product_id, b.product_id),
       GREATEST(a.product_id, b.product_id)
FROM productpurchases3554 a
JOIN productpurchases3554 b ON a.user_id = b.user_id AND a.product_id < b.product_id;

