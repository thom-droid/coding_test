-- 코드를 입력하세요
WITH sales AS (
    SELECT writer_id as user_id, sum(price) as total_sales
FROM USED_GOODS_BOARD
WHERE status = 'DONE'
GROUP BY writer_id
HAVING sum(price) >= 700000)
SELECT a.user_id, a.nickname, b.total_sales
FROM USED_GOODS_USER a
JOIN sales b
ON a.user_id = b.user_id
ORDER BY b.total_sales