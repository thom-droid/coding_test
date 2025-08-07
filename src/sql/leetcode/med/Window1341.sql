SELECT name
FROM ( SELECT RANK() OVER (ORDER BY COUNT(a.user_id) DESC, b.name ) rnk,
              b.name,
              'r' AS type
       FROM movierating1341 a
       JOIN users1341       b ON a.user_id = b.user_id
       GROUP BY a.user_id, b.name

       UNION ALL

       SELECT RANK() OVER (ORDER BY AVG(a.rating) DESC, b.title) rnk,
              b.title,
              'm' AS type
       FROM movierating1341 a
       JOIN movies1341      b ON a.movie_id = b.movie_id
       WHERE LEFT(created_at, 7) = '2020-02'
       GROUP BY a.movie_id, b.title ) a
where rnk = 1 and (type = 'r' or type = 'm')
order by type DESC;