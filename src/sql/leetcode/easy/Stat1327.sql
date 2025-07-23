select p.product_name,

       SUM(o.unit) as unit
from Products p
join orders o using (product_id)
where o.order_date between '2020-02-01' and '2020-02-29'
group by p.product_id, p.product_name
having sum(o.unit) >= 100;

