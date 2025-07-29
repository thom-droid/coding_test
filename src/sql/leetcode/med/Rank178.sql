# Write a solution to find the rank of the scores. The ranking should be calculated according to the following rules:
#
# The scores should be ranked from the highest to the lowest.
# If there is a tie between two scores, both should have the same ranking.
# After a tie, the next ranking number should be the next consecutive integer value. In other words, there should be no holes between ranks.

WITH ranked_scores AS (SELECT DENSE_RANK() OVER (ORDER BY score DESC) AS rnk,
                              score
                       FROM scores178)
SELECT score, rnk
FROM ranked_scores;

-- Alternative solution using a window function with a named window
SELECT score,
       DENSE_RANK() OVER order_by_score_desc AS rnk
FROM scores178
WINDOW order_by_score_desc AS (ORDER BY score DESC);