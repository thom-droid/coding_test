select activity_date as day,
         count(distinct user_id) as d
from Activity
where activity_date between '2019-06-27' and '2019-07-27'
and activity_type not in ('open_session', 'end_session')
group by activity_date
