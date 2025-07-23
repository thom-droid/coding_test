select p.product_name,
       s.year,
       SUM(s.price) as price
FROM Sales s
JOIN Product p on p.product_id = s.product_id
group by s.sale_id,
         p.product_name,
         s.year