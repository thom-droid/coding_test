# Find all numbers that appear at least three times consecutively.
#
# Return the result table in any order.

WITH v AS (SELECT id,
                  num,
                  LEAD(num) OVER (ORDER BY id) AS next_num,
                  LAG(num) OVER (ORDER BY id)  AS prev_num
           FROM logs180)
SELECT DISTINCT num as ConsecutiveNums
FROM v
WHERE v.num = next_num
  AND v.num = prev_num;