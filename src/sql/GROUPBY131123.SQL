SELECT food_type, rest_id, rest_name, favorites
FROM rest_info i1
WHERE i1.favorites =
      (
          SELECT MAX(favorites) favorites
          FROM rest_info
          WHERE food_type = i1.food_type
      )
GROUP BY food_type
ORDER BY food_type DESC