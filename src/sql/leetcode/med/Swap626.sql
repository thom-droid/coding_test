WITH odd AS ( SELECT id + 1 AS id, student
              FROM seat626
              WHERE MOD(id, 2) = 1 ),
     even AS ( SELECT id - 1 AS id, student
               FROM seat626
               WHERE MOD(id, 2) = 0 )
SELECT id,
       IFNULL(CASE
                  WHEN
                      MOD(a.id, 2) = 1 THEN ( SELECT student FROM even WHERE even.id = a.id )
                  ELSE ( SELECT student FROM odd WHERE odd.id = a.id ) END,
              ( SELECT student FROM seat626 WHERE seat626.id = a.id )) as name
FROM seat626 a;

select
case when mod(id,2)=0 then id-1
when mod(id,2)=1 and id+1 not in (select id from seat626) then id
else id+1 end as id,
student
from seat626 order by id;

SELECT id,
       CASE
           WHEN MOD(id, 2) = 1 THEN COALESCE(LEAD(student) OVER (ORDER BY id), student)
           ELSE COALESCE(LAG(student) OVER (ORDER BY id), student) END AS student
FROM seat626;







