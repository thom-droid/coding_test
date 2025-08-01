SELECT DISTINCT id,
                SUM(num) OVER w as num
FROM ( SELECT DISTINCT COUNT(requester_id) OVER (PARTITION BY requester_id) AS num,
                       requester_id                                            id
       FROM requestaccepted602
       UNION ALL
       SELECT DISTINCT COUNT(accepter_id) OVER (PARTITION BY accepter_id) AS num,
                       accepter_id                                           id
       FROM requestaccepted602 ) a
window w AS (PARTITION BY id)
ORDER BY num DESC
LIMIT 1;
