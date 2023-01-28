SELECT ai.animal_id, ai.name
FROM animal_ins ai
         JOIN animal_outs ao
              ON ai.animal_id = ao.animal_id
ORDER BY DATE(ao.datetime) - DATE(ai.datetime) DESC
LIMIT 2