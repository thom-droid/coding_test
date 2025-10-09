WITH ft_stk AS ( SELECT * FROM skillcodes WHERE category = 'Front End' )
SELECT id, email, first_name, last_name
FROM developers d
WHERE EXISTS ( SELECT 1 FROM ft_stk s WHERE d.skill_code & s.code = s.code )
ORDER BY id;

-- # EXISTS : 서브쿼리가 하나 이상의 행을 반환하는지 확인
-- # 즉, 개발자가 Front End 기술을 모두 가지고 있는지 확인
-- # d.skill_code & s.code = s.code : 개발자의 skill_code가 Front End 기술 코드를 모두 포함하는지 확인
-- # bit AND 연산자를 사용하여 확인
