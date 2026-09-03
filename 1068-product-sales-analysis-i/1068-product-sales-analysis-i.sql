select Product.product_name , Sales.year , Sales.price
from Sales 
inner join Product
on sales.product_id = Product.product_id;
