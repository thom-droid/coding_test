SELECT id, b.fish_name, length
FROM ( SELECT id,
              fish_type,
              RANK() OVER (PARTITION BY fish_type ORDER BY length DESC) rnk,
              length
       FROM fish_info ) a
JOIN fish_name_info b using (fish_type)
WHERE rnk = 1
ORDER BY id;








