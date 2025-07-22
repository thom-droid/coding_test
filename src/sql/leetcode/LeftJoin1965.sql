WITH employee_ids AS (SELECT employee_id
                      FROM employees

                      UNION

                      SELECT employee_id
                      FROM salaries
                      ORDER BY employee_id)
SELECT ei.employee_id,
       e.name,
       s.salary
FROM employee_ids ei
         LEFT JOIN employees e  ON e.employee_id   = ei.employee_id
         LEFT JOIN salaries s   ON s.employee_id    = ei.employee_id
WHERE e.name IS NULL
   OR s.salary IS NULL;
