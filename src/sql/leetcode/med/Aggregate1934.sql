SELECT a.user_id, COALESCE(ROUND(AVG(b.action = 'confirmed' OR 0), 2), 0) AS confirmed_rate
FROM signups1934            a
LEFT JOIN confirmations1934 b ON a.user_id = b.user_id
GROUP BY a.user_id;