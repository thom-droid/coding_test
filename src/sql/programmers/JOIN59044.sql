SELECT ai.name, ai.datetime
FROM animal_ins ai
         LEFT JOIN animal_outs ao
                   ON ai.animal_id = ao.animal_id
WHERE ao.datetime IS NULL
ORDER BY ai.datetime
LIMIT 3


# SELECT ai.name, ai.datetime
# FROM animal_ins ai
# WHERE animal_id NOT IN
# (
#     SELECT ai.animal_id
#     FROM animal_ins ai
#     JOIN animal_outs ao
#     ON ai.animal_id = ao.animal_id
# )
# ORDER BY ai.datetime
# LIMIT 3