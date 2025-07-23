select p.product_id, p.product_name
from product p
join sales s using (product_id)
where p.product_id not in (
    select s.product_id
    from sales s
    where s.sale_date not between '2019-01-01' and '2019-03-31')
group by p.product_id, p.product_name

