select m.employee_id , m.name , count(n.employee_id) as reports_count , round(avg(n.age),0) as average_age
from Employees as m 
join Employees as n
on m.employee_id = n.reports_to
group by m.employee_id , m.name
order by m.employee_id;

