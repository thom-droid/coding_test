SELECT m.member_name, r.review_text, DATE_FORMAT(r.review_date, '%Y-%m-%d') AS review_date
FROM rest_review r
         JOIN member_profile m
              ON r.member_id = m.member_id
WHERE r.member_id =
      (
          SELECT m.member_id
          FROM member_profile m
                   JOIN rest_review r
                        ON m.member_id = r.member_id
          GROUP BY m.member_id
          ORDER BY count(m.member_id) DESC
          LIMIT 1
      )
ORDER BY review_date, review_text