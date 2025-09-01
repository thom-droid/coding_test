CREATE VIEW sales AS
    SELECT MONTH(orderDate) month,
           sum(quantityOrdered * priceEach) total
FROM orders
INNER JOIN orderdetails using (orderNumber)
GROUP BY MONTH(orderDate);