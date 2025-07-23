select manager.employee_id,
       manager.name,
       count(manager.employee_id) as reports_count,
       ROUND(avg(employee.age)) as average_age
from Employees manager
JOIN employees employee ON manager.employee_id = employee.reports_to
GROUP BY manager.employee_id, manager.name
ORDER BY manager.employee_id;