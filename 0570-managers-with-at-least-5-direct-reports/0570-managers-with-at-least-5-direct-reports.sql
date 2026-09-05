select e.name
from Employee as e 
join Employee as e2 
on e.id = e2.managerId
group by e.name , e.Id
having count(e2.id)>=5