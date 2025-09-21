WITH hi AS ( SELECT s.id, s.name, g.grade, s.marks
             FROM students s
             JOIN grades   g ON s.marks BETWEEN g.min_mark
                                    AND g.max_mark where g.grade >= 8
             )
SELECT H.NAME, G.GRADE, S.MARKS
FROM STUDENTS S
LEFT JOIN HI H ON S.ID = H.ID
JOIN GRADES G ON S.MARKS BETWEEN G.MIN_MARK AND G.MAX_MARK
ORDER BY g.grade DESC,
         case when g.grade >= 8 then s.name end asc,
         s.marks;

WITH pr AS ( SELECT s.name, s.marks, g.grade
             FROM students AS s
             JOIN grades   AS g ON s.marks BETWEEN g.min_mark AND g.max_mark )
SELECT CASE WHEN pr.grade < 8 THEN NULL ELSE pr.name END AS name, pr.grade, pr.marks
FROM pr
ORDER BY pr.grade DESC, CASE WHEN pr.grade < 8 THEN pr.marks ELSE pr.name END;


