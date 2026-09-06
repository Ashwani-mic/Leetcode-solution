select id , movie, description  , rating 
from Cinema as c 
where  description != 'boring' and id%2 !=0
order by rating desc
