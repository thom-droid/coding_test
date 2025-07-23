SELECT a.b AS second_largest_salary
FROM (SELECT MIN(salary) b
      FROM employee176
      GROUP BY salary
      ORDER BY salary DESC
      LIMIT 1 OFFSET 1) a

UNION ALL

SELECT NULL AS second_highest_salary
WHERE (SELECT COUNT(DISTINCT salary) FROM employee176) < 2;

SELECT COALESCE((SELECT MAX(salary)
                 FROM employee176
                 WHERE salary < (SELECT MAX(salary) FROM employee176))) AS secondesthighestsalary;

SELECT MAX(a.salary)
FROM employee176 a
         JOIN employee176 b
              ON a.salary < b.salary;

WITH cte AS (
    SELECT salary,
              DENSE_RANK() OVER (ORDER BY salary DESC) AS rnk
    FROM employee176
)
select salary AS second_highest_salary
from cte
where rnk = 2;

INSERT INTO employee176 (id, salary)
VALUES (1, 100),
       (2, 200),
       (3, 300),
       (4, 300),
       (5, 400),
       (6, 400),
       (7, 500);

TRUNCATE TABLE employee176;

INSERT INTO employee176 (id, salary)
VALUES (1, 100),
       (2, 100),
       (3, 100),
       (4, 100),
       (5, 100);


