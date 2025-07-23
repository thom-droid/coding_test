select user_id,
         count(follower_id) as follower_count
       FROM followers
group by user_id