select round(count(distinct a.player_id) / (select count(distinct player_id) from Activity) ,2 )as fraction
from Activity as a 
join(
    select player_id , min(event_date) as first_date
    from Activity
    group by player_id

) as first_login
on a.player_id = first_login.player_id and a.event_date = date_add(first_login.first_date ,interval 1 day );


