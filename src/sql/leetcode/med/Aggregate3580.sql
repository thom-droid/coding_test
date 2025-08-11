## Write a solution to find employees who have consistently improved their performance over their last three reviews.

# An employee must have at least 3 review to be considered
# The employee's last 3 reviews must show strictly increasing ratings (each review better than the previous)
# Use the most recent 3 reviews based on review_date for each employee
# Calculate the improvement score as the difference between the latest rating and the earliest rating among the last 3 reviews
# Return the result table ordered by improvement score in descending order, then by name in ascending order.

WITH latest3 AS ( SELECT a.employee_id,
                         a.name,
                         b.rating,
                         b.review_date,
                         ROW_NUMBER() OVER (PARTITION BY a.employee_id ORDER BY b.review_date DESC) AS rn,
                         COUNT(*) OVER (PARTITION BY a.employee_id)                                 AS total_reviews
                  FROM employees3580           a
                  JOIN performance_reviews3580 b ON a.employee_id = b.employee_id ),
     eligible AS ( SELECT *
                   FROM latest3
                   WHERE rn <= 3
                     AND total_reviews >= 3 ),
     steps AS ( SELECT employee_id,
                       name,
                       rating,
                       rn,
                       review_date,
                       LAG(rating) OVER (PARTITION BY employee_id ORDER BY review_date) AS previous_rating
                FROM eligible )
SELECT employee_id,
       name,
       MAX(CASE WHEN rn = 1 THEN rating END) - MAX(CASE WHEN rn = 3 THEN rating END) AS improvement_score
FROM steps
GROUP BY employee_id,
         name
HAVING SUM(CASE WHEN rating > previous_rating THEN 1 ELSE 0 END) >= 2
ORDER BY improvement_score DESC,
         name
