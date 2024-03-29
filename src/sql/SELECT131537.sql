SELECT DATE_FORMAT(sales_date,  '%Y-%m-%d') as SALES_DATE, PRODUCT_ID, NULL as USER_ID, SALES_AMOUNT
FROM OFFLINE_SALE
WHERE date(sales_date) >= '2022-03-01' AND date(sales_date) <= '2022-03-31'
UNION
SELECT DATE_FORMAT(sales_date,  '%Y-%m-%d') as SALES_DATE, PRODUCT_ID, USER_ID, SALES_AMOUNT
FROM ONLINE_SALE
WHERE date(sales_date) >= '2022-03-01' AND date(sales_date) <= '2022-03-31'
ORDER BY SALES_DATE, PRODUCT_ID, USER_ID;
