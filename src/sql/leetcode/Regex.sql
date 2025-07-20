select * from users
where mail REGEXP '^[a-zA-Z][a-zA-Z0-9._-]*@leetcode\\.com$' AND binary mail like '%.com';