update Salary
set sex = IF(sex = 'm', 'f', 'm');
select * from Salary;