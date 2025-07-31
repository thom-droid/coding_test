WITH manager_5_reports AS ( SELECT m.id
                            FROM employee570      e
                                 JOIN employee570 m ON e.managerid = m.id
                            GROUP BY m.id
                            HAVING COUNT(e.id) >= 5 )
SELECT m.name
FROM employee570            m
     JOIN manager_5_reports r ON m.id = r.id;


