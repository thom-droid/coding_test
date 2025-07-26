select getnthhighestsalary(1);

drop function if exists getnthhighestsalary;
DELIMITER $$;
create FUNCTION getnthhighestsalary(n INT)
    RETURNS INT
    DETERMINISTIC
BEGIN
    SET n = n - 1; -- Adjust N to be zero-based index
    RETURN (SELECT DISTINCT salary as getNthHighestSalary
            FROM employee177
            ORDER BY salary DESC
            LIMIT 1 OFFSET n);
END;

DELIMITER ;

SELECT  DISTINCT salary as getNthHighestSalary
            FROM employee177
            ORDER BY salary DESC
            LIMIT 1 OFFSET 0;

SELECT distinct salary
from employee177;


-- window
select salary,
       nth_value(salary, 2) OVER w
from employee177
    window w as (order by salary desc);

-- cte, dense_rank
with ranking as (
    SELECT Salary,
           DENSE_RANK() OVER w as rnk
    FROM employee177
    WINDOW w AS (ORDER BY salary DESC)
)
select salary as getNthHighestSalary
FROM ranking
where RNK = 1;

-- select
SELECT DISTINCT salary
FROM employee177
ORDER BY salary DESC;

INSERT INTO employee177 (id, salary)
VALUES (1, 100),
       (2, 200),
       (3, 300)
#        (4, 300),
#        (5, 400),
#        (6, 400),
#        (7, 500);
#
# TRUNCATE TABLE employee177;
#
# INSERT INTO employee177 (id, salary)
# VALUES (1, 100),
#        (2, 100),
#        (3, 100),
#        (4, 100),
#        (5, 100);

