select e.name
from Employee as e 
join Employee as y 
on e.id = y.managerId
group by e.name , y.managerId
having count(y.managerId) >=5