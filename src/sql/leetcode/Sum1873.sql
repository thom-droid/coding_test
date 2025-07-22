select e.employee_id,
       coalesce(bonus_candidates.salary, 0) as bonus
from employees e
left join (
SELECT employee_id, salary
FROM employees
where employee_id % 2 != 0
and binary name not like 'M%') bonus_candidates on bonus_candidates.employee_id = e.employee_id
order by e.employee_id;