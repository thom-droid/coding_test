# Write a solution to find employees who have the highest salary in each of the departments.
#
# Return the result table in any order.

WITH salary_rank_by_department AS (
    SELECT a.name as employee,
           a.salary,
           b.name AS department,
           DENSE_RANK() OVER (PARTITION BY a.departmentid ORDER BY a.salary DESC) AS rnk
    FROM employee184 a
             JOIN department184 b ON a.departmentid = b.id
)
select department,
       employee,
       salary
from SALARY_RANK_BY_DEPARTMENT
where rnk = 1;

