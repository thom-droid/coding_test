SELECT p.id, COUNT(c.id) AS cnt
FROM ecoli_data      p
LEFT JOIN ecoli_data c ON p.id = c.parent_id AND p.id != c.id
GROUP BY p.id
ORDER BY p.id;


