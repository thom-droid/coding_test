SELECT mcdp_cd AS 진료과코드, count(mcdp_cd) AS 5월예약건수
FROM appointment
WHERE YEAR(apnt_ymd) = 2022 AND MONTH(apnt_ymd) = 5
GROUP BY 진료과코드
ORDER BY 5월예약건수, 진료과코드