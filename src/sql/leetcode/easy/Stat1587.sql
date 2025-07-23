select u.name,
       sum(t.amount) as balance
from users u
join transactions t using (account)
group by u.account, u.name
having sum(t.amount) > 10000