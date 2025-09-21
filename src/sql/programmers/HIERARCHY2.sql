WITH RECURSIVE gen AS ( SELECT id, parent_id, 1 AS lvl
                        FROM ecoli_data
                        WHERE parent_id is null

                        UNION ALL

                        SELECT e.id, e.parent_id, g.lvl + 1
                        FROM gen        g
                        JOIN ecoli_data e ON e.parent_id = g.id
                        WHERE g.lvl < 20 )
SELECT id
FROM gen
where lvl = 3
order by id



