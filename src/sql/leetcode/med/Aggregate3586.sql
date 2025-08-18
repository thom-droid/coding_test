WITH covid_patients AS ( SELECT patient_id
                         FROM covid_tests3586
                         GROUP BY patient_id
                         HAVING SUM(CASE WHEN result = 'Positive' THEN 1 ELSE 0 END) >= 1
                            AND SUM(CASE WHEN result = 'Negative' THEN 1 ELSE 0 END) >= 1 ),
     positive_days AS ( SELECT patient_id,
                               MIN(test_date) AS positive_date
                        FROM covid_tests3586
                        WHERE result = 'Positive'
                          AND patient_id IN ( SELECT patient_id FROM covid_patients )
                        GROUP BY patient_id )
SELECT a.patient_id,
       b.patient_name,
       b.age,
       DATEDIFF(MIN(a.test_date), c.positive_date) AS recovery_time
FROM covid_tests3586 a
JOIN patients3586    b ON a.patient_id = b.patient_id
JOIN positive_days   c ON a.patient_id = c.patient_id
    AND a.test_date > c.positive_date
WHERE a.result = 'Negative'
GROUP BY a.patient_id,
         b.patient_name,
         b.age
ORDER BY recovery_time,
         b.patient_name;

SELECT a.patient_id,
       c.patient_name,
       c.age,
       DATEDIFF(MIN(b.test_date), MIN(a.test_date)) AS recovery_time
FROM covid_tests3586 a
JOIN covid_tests3586 b
     ON a.patient_id = b.patient_id
         AND a.test_date < b.test_date
         AND a.result = 'Positive'
         AND b.result = 'Negative'
JOIN patients3586    c ON a.patient_id = c.patient_id
GROUP BY a.patient_id, c.patient_name, c.age
ORDER BY recovery_time,
         patient_name;






