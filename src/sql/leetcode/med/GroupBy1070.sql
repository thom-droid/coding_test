WITH a AS ( SELECT sale_id,
                   product_id,
                   year,
                   quantity,
                   price,
                   DENSE_RANK() OVER (PARTITION BY product_id ORDER BY year) AS rnk
            FROM sales1070 )
SELECT product_id,
       year                                         AS first_year,
       quantity,
       price
FROM a
WHERE a.rnk = 1;

# from other solution;

#You might be thinking just partition/group by product_id and find the min() out of it.

#So, accordingly below code should work right?

select product_id, min(year) as first_year, quantity, price
from sales
group by product_id

#But surprisingly its wrong.

#Reason-
#SQL rules state that any column not in the GROUP BY clause and not aggregated (like quantity and price) will return indeterminate results from one of the rows in the group.

#Just for an example, output could be this table (which is not the desired output)

sale_id	product_id	year	quantity	price
1	        100	    2008	12	        5000
7	        200	    2011	15	        9000
# (notice, how quantity of product_id 100 is 12 instead of 10, this value 12 has come from its group's neigbour, i.e from the row with sale_id= 2)

#So now we know this behavior depends on the database implementation.

#Solution-
#Group by product_id, but extract only the (product_id, min(year)) (to avoid arbitrary values problem as we discussed above)
#and then filter out table's row based on those extracted (product_id, min(year)) values
#Correct Code
select product_id, year as first_year, quantity, price
from sales where (product_id, year) in (
    select product_id, min(year)
    from sales
    group by product_id
)
