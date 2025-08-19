WITH rnk AS
         ( SELECT DENSE_RANK() OVER (PARTITION BY departmentid ORDER BY salary DESC) AS salary_rank,
                  id                                                                 AS employee_id,
                  departmentid,
                  name,
                  salary
           FROM employee185 )
SELECT b.name   AS department,
       a.name   AS employee,
       a.salary AS salary
FROM rnk AS        a
JOIN department185 b ON a.departmentid = b.id
WHERE a.salary_rank <= 3;


Select d.name as department , e1.name as employee, e1.salary as Salary
From employee185 e1 join department185 d on e1.DepartmentId = d.Id
Where  3 > (select count(distinct (e2.Salary))
            from  employee185 e2
            where e2.Salary > e1.Salary
            and e1.DepartmentId = e2.DepartmentId)