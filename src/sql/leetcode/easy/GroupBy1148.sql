select v1.author_id
from views v1
join views v2
on v1.author_id = v2.viewer_id
group by v1.author_id
order by v1.author_id;


select author_id
from views
where author_id = viewer_id
group by author_id
order by author_id;