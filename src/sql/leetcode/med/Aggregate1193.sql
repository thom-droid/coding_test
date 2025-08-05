SELECT DATE_FORMAT(trans_date, '%Y-%m')                        AS month,
       country,
       COUNT(id)                                               AS trans_count,
       COUNT(state = 'approved' OR NULL)                       AS approved_count,
       SUM(amount)                                             AS trans_total_amount,
       SUM(CASE WHEN state = 'approved' THEN amount ELSE 0 END) AS approved_total_amount
FROM transactions1193
GROUP BY DATE_FORMAT(trans_date, '%Y-%m'), country;
