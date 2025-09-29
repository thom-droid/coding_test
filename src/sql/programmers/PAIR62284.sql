SELECT a.cart_id
FROM cart_products a
JOIN cart_products b
     ON a.cart_id = b.cart_id
         AND a.name != b.name
WHERE (a.name, b.name) IN (('Milk', 'Yogurt'), ('Yogurt', 'Milk'))
GROUP BY a.cart_id
ORDER BY a.cart_id;

select * from cart_products;