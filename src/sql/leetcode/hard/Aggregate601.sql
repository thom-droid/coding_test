WITH a AS (
    SELECT id,
           visit_date, people,
           ROW_NUMBER() OVER (ORDER BY id) AS c
    FROM stadium601
    WHERE people >= 100
), b as (
    select id, visit_date, people, count(id) over (partition by id - c) as cnt
    from a
)
select id, visit_date, people
from b
where cnt >= 3
order by visit_date

