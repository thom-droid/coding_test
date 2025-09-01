/* GROUP BY*/

SELECT user_id, product_id
FROM ONLINE_SALE
group by user_id, product_id
having count(online_sale_id) >= 2
ORDER BY user_id ASC, product_id DESC;