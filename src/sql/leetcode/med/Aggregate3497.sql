## window over, group by

WITH paid_user AS ( SELECT user_id
                    FROM useractivity3497
                    WHERE activity_type = 'paid' )
SELECT a.user_id, trial_avg_duration, paid_avg_duration
FROM ( SELECT user_id, ROUND(AVG(activity_duration), 2) AS trial_avg_duration
       FROM useractivity3497
       WHERE user_id IN ( SELECT user_id FROM paid_user )
         AND activity_type = 'free_trial'
       GROUP BY user_id ) a
JOIN ( SELECT user_id, ROUND(AVG(activity_duration), 2) AS paid_avg_duration
       FROM useractivity3497
       WHERE user_id IN ( SELECT user_id FROM paid_user )
         AND activity_type = 'paid'
       GROUP BY user_id ) b ON a.user_id = b.user_id;


select user_id,
       ROUND(AVG(CASE WHEN activity_type = 'free_trial' THEN activity_duration END), 2) AS trial_avg_duration,
       ROUND(AVG(CASE WHEN activity_type = 'paid' THEN activity_duration END ), 2) AS paid_avg_duration
FROM useractivity3497
WHERE activity_type in ('free_trial', 'paid')
AND user_id IN ( SELECT user_id FROM useractivity3497 WHERE activity_type = 'paid' )
GROUP BY user_id;