SELECT product_id, 'store1' AS store, store1 AS price
FROM products
where store1 is not NULL

UNION
select product_id, 'store2' AS store, store2 AS price
FROM products
where store2 is not NULL

UNION
select product_id, 'store3' AS store, store3 AS price
FROM products
where store3 is not NULL
