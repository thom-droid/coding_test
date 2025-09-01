
SELECT
    YEAR(o.sales_date) year,
    MONTH(o.sales_date) month,
    count(distinct u.user_id) AS purchased_users,
    ROUND(
                count(distinct u.user_id) /
                (
                    SELECT count(*)
                    FROM user_info
                    where year(joined) = 2021
                ) ,
                1) AS purchased_ratio
FROM user_info u
         JOIN online_sale o
              ON u.user_id = o.user_id
WHERE YEAR(u.joined) = '2021'
GROUP BY year, month
ORDER BY year, month