SELECT a.employee_id,
       b.employee_name,
       b.department,
       COUNT(a.employee_id) AS meeting_heavy_weeks
FROM ( SELECT employee_id,
              SUM(duration_hours) AS total_hours
       FROM meetings3611
       GROUP BY employee_id,
                YEARWEEK(meeting_date, 3) -- equivalent to ISO week numbering , date_part 'week' in PostgreSQL
       HAVING SUM(duration_hours) > 20 ) a
JOIN employees3611                       b ON a.employee_id = b.employee_id
GROUP BY a.employee_id,
         b.employee_name,
         b.department
HAVING COUNT(a.employee_id) >= 2
ORDER BY meeting_heavy_weeks DESC,
         b.employee_name;