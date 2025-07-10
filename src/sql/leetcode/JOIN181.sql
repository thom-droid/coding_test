# find managers
SELECT
    e.name Employee
FROM
    employee e
JOIN
    employee m
ON m.id = e.managerId
AND e.salary > m.salary
