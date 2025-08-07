SELECT a.category,
       COALESCE(b.account_count, 0) AS accounts_count
FROM ( SELECT 'Low Salary' AS category
       UNION ALL
       SELECT 'Average Salary'
       UNION ALL
       SELECT 'High Salary' ) AS a
LEFT JOIN ( SELECT CASE
                       WHEN income < 20000 THEN 'Low Salary'
                       WHEN 20000 <= income AND income <= 50000 THEN 'Average Salary'
                       WHEN income > 50000 THEN 'High Salary' END AS category,
                   COUNT(*)                                       AS account_count
            FROM accounts1907
            GROUP BY category ) b on a.category = b.category
