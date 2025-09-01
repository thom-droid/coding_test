SELECT i.ingredient_type, SUM(fh.total_order) AS total_order
FROM first_half fh
         JOIN  icecream_info i
               ON fh.flavor = i.flavor
GROUP BY i.ingredient_type
ORDER BY total_order