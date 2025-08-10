WITH seasonal AS ( SELECT sale_id,
                          product_id,
                          CASE
                              WHEN MONTH(sale_date) BETWEEN 3 AND 5 THEN 'Spring'
                              WHEN MONTH(sale_date) BETWEEN 6 AND 8 THEN 'Summer'
                              WHEN MONTH(sale_date) BETWEEN 9 AND 11 THEN 'Fall'
                              ELSE 'Winter' END AS season,
                          quantity,
                          price
                   FROM sales3564 ),
     ranked_data AS ( SELECT DISTINCT a.season,
                                      SUM(a.quantity * a.price)                                                                              AS total_revenue,
                                      SUM(a.quantity)                                                                                        AS total_quantity,
                                      ROW_NUMBER() OVER (PARTITION BY a.season ORDER BY SUM(a.quantity) DESC, SUM(a.quantity * price) DESC ) AS rn,
                                      b.category
                      FROM seasonal     a
                      JOIN products3564 b ON a.product_id = b.product_id
                      GROUP BY a.season,
                               b.category
                      ORDER BY a.season,
                               total_quantity DESC,
                               total_revenue  DESC )
SELECT season,
       category,
       total_quantity,
       total_revenue
FROM ranked_data
WHERE rn = 1;
