SELECT user_id,
       email
FROM users
WHERE email REGEXP '^[a-zA-Z0-9_]+@[a-zA-Z]+\\.com$'
  AND    binary email like '%@%.com';