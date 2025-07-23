select id,
       case when month = 'Jan' then revenue end as 'Jan_revenue',
       case when month = 'Feb' then revenue end as 'Feb_revenue',
       case when month = 'Mar' then revenue end as 'Mar_revenue',
       case when month = 'Apr' then revenue end as 'Apr_revenue',
       case when month = 'May' then revenue end as 'May_revenue',
       case when month = 'Jun' then revenue end as 'Jun_revenue',
       case when month = 'Jul' then revenue end as 'Jul_revenue',
       case when month = 'Aug' then revenue end as 'Aug_revenue',
       case when month = 'Sep' then revenue end as 'Sep_revenue',
       case when month = 'Oct' then revenue end as 'Oct_revenue',
       case when month = 'Nov' then revenue end as 'Nov_revenue',
       case when month = 'Dec' then revenue end as 'Dec_revenue'
FROM Department
group by id, month, revenue