-- 코드를 입력하세요
SELECT  b.user_id,
        b.nickname,
        CONCAT(b.city, ' ', b.street_address1, ' ', b.street_address2) AS '전체주소',
        CONCAT(LEFT(b.tlno, 3), '-', MID(b.tlno, 4, 4), '-', RIGHT(b.tlno, 4)) AS '전화번호'
FROM USED_GOODS_BOARD a
JOIN USED_GOODS_USER b
ON a.writer_id = b.user_id
GROUP BY a.writer_id
HAVING COUNT(a.board_id) >= 3
ORDER BY b.user_id DESC;
