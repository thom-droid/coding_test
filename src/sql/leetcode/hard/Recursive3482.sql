WITH RECURSIVE
    h AS ( SELECT employee_id,
                  employee_name,
                  manager_id,
                  salary,
                  department,
                  1 AS level
           FROM employees3482
           WHERE manager_id IS NULL

           UNION ALL

           SELECT a.employee_id,
                  a.employee_name,
                  a.manager_id,
                  a.salary,
                  a.department,
                  h.level + 1
           FROM employees3482 a
           JOIN h ON a.manager_id = h.employee_id ),
    closure AS ( SELECT employee_id AS ancestor_id,
                        employee_id AS descendant_id,
                        salary
                 FROM employees3482

                 UNION ALL

                 SELECT cl.ancestor_id,
                        e.employee_id,
                        e.salary
                 FROM employees3482 e
                 JOIN closure       cl
                      ON e.manager_id = cl.descendant_id )
    select * from closure group by ANCESTOR_ID;
    agg AS ( SELECT ancestor_id  AS employee_id,
                    COUNT(*) - 1 AS team_size,
                    SUM(salary)  AS budget
             FROM closure
             GROUP BY ancestor_id )
SELECT a.EMPLOYEE_ID,
       b.employee_name,
       b.level,
       a.team_size,
       a.budget FROM agg a
JOIN h b ON a.employee_id = b.employee_id
ORDER BY b.level,
         a.BUDGET DESC,
         b.employee_name;

select * from employees3482;
