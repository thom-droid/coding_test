SELEct id, movie, description, cinema.rating
from cinema
where description != 'boring'
and id % 2 != 0
order by rating desc;