select distinct customer_id
from customer1045
group by customer_id
having count(distinct product_key) = (select count(*) from product1045);

select customer_id
from
(
select c.customer_id,p.product_key
from
customer1045 c inner join product1045 p
on c.product_key = p.product_key

) c_p
group by customer_id
having count(distinct product_key) =
(select count(distinct product_key) from product1045)