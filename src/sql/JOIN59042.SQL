SELECT ao.animaL_id, ao.name
FROM animal_outs ao
         LEFT JOIN animal_ins ai
                   on ao.animal_id = ai.animal_id
WHERE ai.animal_id IS NULL
ORDER BY ao.animal_id