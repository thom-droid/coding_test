WITH h as (
    SELECT
    SUM(score) score,
    emp_no
    FROM hr_grade
    GROUP BY emp_no
), ranks as (
    SELECT RANK() OVER (ORDER BY h.score DESC) as rnk, h.score, h.emp_no
    FROM h
)
SELECT r.score, r.emp_no, e.emp_name, e.position, e.email
FROM ranks r
JOIN hr_employees e
ON r.emp_no = e.emp_no
WHERE r.rnk = 1

SELECT datediff('2025-08-30', curdate()) as diff;