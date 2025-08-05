WITH o AS ( SELECT b.buyer_id,
                   COUNT(b.order_id) as cnt
            FROM users1158  a
            JOIN orders1158 b ON a.user_id = b.buyer_id
            WHERE YEAR(b.order_date) = '2019'
            GROUP BY b.buyer_id )
SELECT a.user_id as buyer_id,
       a.join_date,
       o.cnt as order_in_2019
FROM users1158 a
LEFT JOIN o ON a.user_id = o.buyer_id


