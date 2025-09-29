WITH r AS (SELECT id,
             fish_type,
             CASE WHEN length IS NULL THEN 10 ELSE length
             END AS length
             FROM fish_info
            )
SELECT COUNT(id) as fish_count, MAX(length) as max_length, fish_type
FROM r
group by fish_type
having avg(length) >= 33
order by fish_type