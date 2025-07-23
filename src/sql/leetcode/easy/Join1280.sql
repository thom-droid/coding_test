SELECT      s.student_id,
            s.student_name,
            sbj.subject_name,
            COALESCE(COUNT(e.student_id), 0) as attended_exams
FROM        students s
JOIN        subjects sbj
LEFT JOIN   examinations e  ON e.student_id = s.student_id
                           AND e.subject_name = sbj.subject_name
GROUP BY    s.student_id, s.student_name, sbj.subject_name
ORDER BY    s.student_id, sbj.subject_name;

