select e.machine_id , round(AVG(e.timestamp - s.timestamp),3) as processing_time
from Activity as s
join Activity as e
on e.machine_id = s.machine_id and e.process_id = s.process_id
where s.activity_type ='start' and e.activity_type = 'end'
group by s.machine_id