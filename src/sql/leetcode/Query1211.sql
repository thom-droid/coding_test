# Write your MySQL query statement below
select q1.query_name,
       round(avg(q1.rating / q1.position), 2)  as quality,
       round(coalesce(q2.cnt, 0) / count(q1.query_name) * 100, 2) as poor_query_percentage
from Queries q1
        LEFT join (select query_name,   count(query_name) as cnt
                   from      Queries
                  where rating < 3
               group by query_name) q2 on q1.query_name = q2.query_name
GROUP BY q1.query_name, q2.cnt;

select q1.query_name,
       round(avg(q1.rating / q1.position), 2)  as quality,
       round(sum(CASE WHEN q1.rating < 3 THEN 1 ELSE 0 END) / count(q1.query_name) * 100, 2)  as poor_query_percentage
from Queries q1
GROUP BY query_name;