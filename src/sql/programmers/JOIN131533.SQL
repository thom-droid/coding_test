SELECT p.product_code, sum(off.sales_amount) * p.price sales
FROM product p
         JOIN offline_sale off
              ON p.product_id = off.product_id
GROUP BY off.product_id
ORDER BY sales DESC, p.product_code
