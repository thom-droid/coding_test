SELECT t.author_id, t.author_name, t.category,  sum(t.sales) total_sales
FROM
(
    SELECT a.author_id, a.author_name, b.category, sum(s.sales) * b.price sales, b.book_id
    FROM book b
    JOIN author a
    ON b.author_id = a.author_id
    JOIN book_sales s
    ON b.book_id = s.book_id
    WHERE DATE(s.sales_date) BETWEEN '2022-01-01' AND '2022-01-31'
    GROUP BY b.book_id
) AS t
GROUP BY t.category, t.author_id
ORDER BY t.author_id, t.category DESC

/* ver 2*/

SELECT *
a.author_id, a.author_name, b.category, sum(s.sales * b.price)
FROM book b, author a, book_sales s
WHERE DATE(s.sales_date) BETWEEN '2022-01-01' AND '2022-01-31'
AND b.book_id = s.book_id
AND a.author_id = b.author_id
GROUP BY a.author_id, b.category