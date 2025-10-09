WITH RECURSIVE h AS ( SELECT item_id AS p_id,
                             item_id AS c_id,
                             1       AS lvl
                      FROM item_tree
                      WHERE parent_item_id IS NULL

                      UNION ALL

                      SELECT i.parent_item_id AS p_id,
                             i.item_id        AS c_id,
                             h.lvl + 1        AS lvl
                      FROM item_tree i
                      JOIN h ON i.parent_item_id = h.c_id
                      WHERE lvl < 100 )
SELECT *
FROM h;

WITH RECURSIVE h2 AS ( SELECT item_id AS parent_item_id,
                              item_id AS item_id,
                              0       AS lv
                       FROM item_tree
                       UNION ALL
                       SELECT it.parent_item_id,
                              it.item_id,
                              h2.lv + 1
                       FROM item_tree it
                       JOIN h2 ON it.parent_item_id = h2.item_id )
SELECT *
FROM h2;

SELECT item_id, item_name, rarity
FROM item_info
WHERE item_id NOT IN ( SELECT a.parent_item_id
                       FROM item_tree a
                       JOIN item_tree b ON a.parent_item_id = b.item_id
                       WHERE a.parent_item_id IS NOT NULL
                       GROUP BY a.parent_item_id
                       HAVING COUNT(*) >= 1 )
ORDER BY item_id DESC;




