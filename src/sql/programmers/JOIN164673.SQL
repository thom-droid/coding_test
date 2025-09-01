-- 코드를 입력하세요
SELECT
    u.title TITLE
     , u.board_id BOARD_ID
     , r.reply_id REPLY_ID
     , r.writer_id WRITER_ID
     , r.contents CONTENTS
     , date_format(r.created_date, '%Y-%m-%d') as CREATED_DATE
FROM USED_GOODS_BOARD u
         JOIN USED_GOODS_REPLY r
              ON u.board_id = r.board_id
WHERE date_format(u.created_date, '%Y%m') = '202210'
ORDER BY r.created_date ASC, u.title ASC