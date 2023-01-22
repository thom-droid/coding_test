SELECT flavor
FROM
    (
        SELECT *
        FROM first_half
        UNION ALL
        SELECt *
        FROM july
    ) AS t1
GROUP BY flavor
ORDER BY SUM(total_order) DESC
LIMIT 3;
