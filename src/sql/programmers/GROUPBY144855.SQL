SELECT b.category, SUM(s.sales) total_sales
FROM book b
         JOIN book_sales s
              ON b.book_id = s.book_id
WHERE YEAR(s.sales_date) = 2022 AND MONTH(s.sales_date) = 1
GROUP BY b.category
ORDER BY b.category
