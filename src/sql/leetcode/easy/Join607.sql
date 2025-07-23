select s.name
    from SalesPerson s
left join (
select o.order_id, o.sales_id, o.com_id, o.amount, c.name
               from Orders o
join Company C
           on o.com_id = C.com_id
           where c.name = 'RED') o
on s.sales_id = o.sales_id
where o.order_id is null;

select name
from SalesPerson
where sales_id not in (
select s.sales_id
    from SalesPerson s
join Orders o on s.sales_id = o.sales_id
join company c on o.com_id = c.com_id
where c.name = 'RED');

SELECT name
FROM SalesPerson s
WHERE NOT EXISTS (
    SELECT 1
    FROM Orders o
    JOIN Company c ON o.com_id = c.com_id
    WHERE o.sales_id = s.sales_id AND c.name = 'RED'
);