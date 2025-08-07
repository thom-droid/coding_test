# Compute the moving average of how much the customer paid in a seven days window
# (i.e., current day + 6 days before). average_amount should be rounded to two decimal places.

# Return the result table ordered by visited_on in ascending order.

# window
# over (range between interval 6 day preceding and current row)
WITH a AS ( SELECT visited_on,
                   SUM(amount) OVER
                       (ORDER BY visited_on
                       RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW) AS amount
            FROM customer1321 )
SELECT DISTINCT visited_on, amount, ROUND(amount / 7, 2) AS average_amount
FROM a
WHERE visited_on >= ( SELECT MIN(visited_on) + INTERVAL 6 DAY FROM a );


SELECT
    visited_on,
    (
        SELECT SUM(amount)
        FROM customer1321
        WHERE visited_on BETWEEN DATE_SUB(c.visited_on, INTERVAL 6 DAY) AND c.visited_on
    ) AS amount,
    ROUND(
        (
            SELECT SUM(amount) / 7
            FROM customer1321
            WHERE visited_on BETWEEN DATE_SUB(c.visited_on, INTERVAL 6 DAY) AND c.visited_on
        ),
        2
    ) AS average_amount
FROM customer1321 c
WHERE visited_on >= (
        SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
        FROM customer1321
    )
GROUP BY visited_on;