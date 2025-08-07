select SUM(case when operation = 'Buy' then -price else price end) as price,
       stock_name
from stocks1393
group by stock_name

