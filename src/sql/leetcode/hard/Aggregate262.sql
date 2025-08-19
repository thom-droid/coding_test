WITH unbanned_users AS ( SELECT users_id
                         FROM users262
                         WHERE banned = 'No' )
SELECT request_at AS Day,
       ROUND(AVG(status = 'cancelled_by_client' OR status = 'cancelled_by_driver'), 2) AS 'Cancellation Rate'
FROM trips262
WHERE client_id IN ( SELECT users_id FROM unbanned_users )
  AND driver_id IN ( SELECT users_id FROM unbanned_users )
  AND request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY request_at

