select date_id,
       make_name,
       count(distinct lead_id) as sale_count,
       count(distinct partner_id) as partner_count
from dailySales
group by date_id, make_name