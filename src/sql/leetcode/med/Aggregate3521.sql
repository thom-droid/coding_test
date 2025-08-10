SELECT product1_id,
       product2_id,
       a1.category AS product1_category,
       b1.category AS product2_category,
       customer_count
FROM ( SELECT a.product_id              AS product1_id,
              b.product_id              AS product2_id,
              COUNT(DISTINCT a.user_id) AS customer_count
       FROM productpurchases3521 a
       JOIN productpurchases3521 b ON a.user_id = b.user_id
           AND a.product_id < b.product_id
       GROUP BY a.product_id, b.product_id
       HAVING COUNT(DISTINCT a.user_id) >= 3
          AND COUNT(DISTINCT b.user_id) >= 3 ) a
JOIN productinfo3521                           a1 ON a.product1_id = a1.product_id
JOIN productinfo3521                           b1 ON a.product2_id = b1.product_id
ORDER BY customer_count DESC,
            product1_id,
            product2_id