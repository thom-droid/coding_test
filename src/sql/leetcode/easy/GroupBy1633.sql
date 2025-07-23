select r.contest_id,
       ROUND(count(r.user_id) / (select count(user_id) from users) * 100, 2) as percentage
from users u
         join register r using (user_id)
group by r.contest_id
order by percentage desc, r.contest_id asc;