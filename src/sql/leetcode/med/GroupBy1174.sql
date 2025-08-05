#If the customer's preferred delivery date is the same as the order date, then the order is called immediate; otherwise, it is called scheduled.
#The first order of a customer is the order with the earliest order date that the customer made. It is guaranteed that a customer has precisely one first order.
#Write a solution to find the percentage of immediate orders in the first orders of all customers, rounded to 2 decimal places.

WITH first_orders AS (
    ( SELECT DISTINCT customer_id,
                      FIRST_VALUE(order_date) OVER (w) AS v
      FROM delivery1174
      WINDOW w AS (PARTITION BY customer_id ORDER BY order_date) ) )
SELECT ROUND(COUNT(*) /
             ( SELECT COUNT(DISTINCT customer_id) FROM first_orders ) * 100, 2) AS immediate_percentage
FROM first_orders f
JOIN delivery1174 d ON f.customer_id = d.customer_id
    AND f.v = d.customer_pref_delivery_date;


#solution 2
SELECT ROUND(AVG(order_date = customer_pref_delivery_date) * 100, 2) AS immediate_percentage
FROM delivery1174
WHERE (customer_id, order_date) IN (
    SELECT customer_id, MIN(order_date)
    FROM delivery1174
    GROUP BY customer_id
    );


select customer_id, order_date,  Delivery1174.customer_pref_delivery_date
from delivery1174
where (customer_id, order_date ) in (
    select customer_id, min(order_date)
    from delivery1174
    GROUP BY customer_id
    )

