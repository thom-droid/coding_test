select q1.query_name,
       round(avg(q1.rating / q1.position), 2)  as quality,
       round(coalesce(q2.cnt,0) / count(q1.query_name) * 100, 2)  as poor_query_percentage
from Queries q1
         left join (  select query_name,
                        count(query_name) as cnt
                   from Queries
                  where rating < 3
               group by query_name) q2 on q1.query_name = q2.query_name
GROUP BY query_name