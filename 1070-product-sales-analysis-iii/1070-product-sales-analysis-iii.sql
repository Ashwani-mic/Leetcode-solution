select  s.product_id , s.year as first_year , s.quantity , s.price 
from Sales as s
join (
    select product_id , min(year) as first_year , quantity , price
    from Sales 
    group by product_id

) as first_sales
on s.year = first_sales.first_year and s.product_id = first_sales.product_id;
 

