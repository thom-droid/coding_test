select      u.name,
            COALESCE(SUM(r.distance) , 0) as travelled_distance
from        users u
LEFT join        leetcode.Rides r on u.id = r.user_id
group by    u.id,
            u.name
ORDER BY    travelled_distance desc,
            u.name asc;
