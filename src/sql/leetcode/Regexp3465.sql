SELECT product_id,
       product_name,
       description
FROM products
where description regexp '\\bSN[0-9]{4}-[0-9]{4}\\b'
order by product_id