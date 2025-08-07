SELECT a.student_id, a.subject, b.first_score, b.last_score
FROM ( SELECT student_id,
              subject
       FROM scores3421
       GROUP BY student_id, subject
       HAVING COUNT(exam_date) >= 2 )   a
JOIN ( SELECT student_id,
              subject,
              first_score,
              last_score
       FROM ( SELECT DISTINCT student_id,
                              subject,
                              FIRST_VALUE(score)
                                          OVER ( PARTITION BY student_id, subject ORDER BY exam_date)             AS first_score,
                              FIRST_VALUE(score)
                                          OVER ( PARTITION BY student_id, subject ORDER BY exam_date DESC)        AS last_score
              FROM scores3421 ) a
       WHERE first_score < last_score ) b ON a.student_id = b.student_id AND a.subject = b.subject;






