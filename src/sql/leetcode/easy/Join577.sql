select e.name as name,
       b.bonus
from Employee e
         left join Bonus B
                   on e.empId = B.empId
where b.bonus < 1000 or b.bonus is null