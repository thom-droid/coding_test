SELECT st.machine_id,
       round(sum(ed.timestamp - st.timestamp) / count(st.machine_id), 3) as processing_time
FROM (select *
      from Activity
      where activity_type = 'start') as st
JOIN(SELECT *
      from Activity
    where activity_type = 'end') as ed on st.machine_id = ed.machine_id
    and st.process_id = ed.process_id
group by st.machine_id;

# more readable version
select st.machine_id,
       round(avg(ed.timestamp - st.timestamp), 3) as processing_time
    from Activity st
JOIN Activity ed
using (machine_id, process_id)
where st.activity_type = 'start'
and ed.activity_type = 'end'
group by st.machine_id;
