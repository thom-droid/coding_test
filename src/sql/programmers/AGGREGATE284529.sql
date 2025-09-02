-- 코드를 작성해주세요
SELECT a.dept_id, a.dept_name_en, ROUND(AVG(b.sal)) avg_sal
FROM HR_DEPARTMENT a
JOIN HR_EMPLOYEES b
ON a.dept_id = b.dept_id
GROUP BY a.dept_id
ORDER BY avg_sal DESC;
