SELECT a.employee_id, b.department_id
FROM (SELECT employee_id,
             'Y' AS primary_flag
      FROM employee
      WHERE primary_flag = 'Y'
      GROUP BY employee_id

      UNION

      SELECT employee_id,
             'N' AS primary_flag
      FROM employee
      GROUP BY employee_id
      HAVING COUNT(department_id) = 1) AS a
         JOIN employee b ON a.employee_id = b.employee_id
    AND a.primary_flag = b.primary_flag
ORDER BY a.employee_id;

WITH department AS (SELECT employee_id,
                           CASE
                               WHEN COUNT(*) > 1 THEN MAX(CASE WHEN primary_flag = 'Y' THEN department_id END)
                               WHEN COUNT(*) = 1 THEN MAX(department_id)
                               END AS department_id
                    FROM employee
                    GROUP BY employee_id)
SELECT employee_id,
       department_id
FROM department;



