SELECT b.emp_no,
       b.emp_name,
       grade,
       ROUND(CASE
           WHEN grade = 'S' THEN sal * 0.2
           WHEN grade = 'A' THEN sal * 0.15
           WHEN grade = 'B' THEN sal * 0.1
           ELSE 0 END, 0) AS bonus
FROM ( SELECT emp_no,
              CASE
                  WHEN score >= 96 THEN 'S'
                  WHEN score >= 90 THEN 'A'
                  WHEN score >= 80 THEN 'B'
                  ELSE 'C' END AS grade
       FROM ( SELECT emp_no, AVG(score) score FROM hr_grade GROUP BY emp_no, year ) AS avg_score ) AS a
JOIN hr_employees                                                                                     b
     ON a.emp_no = b.emp_no
ORDER BY b.emp_no



