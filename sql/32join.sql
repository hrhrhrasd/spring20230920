use w3schools;

select e1.LastName, e1.BirthDate
from employees e1 join employees e2
where e1.BirthDate < e2.BirthDate
and e2.LastName = 'Leverling';

-- 'Ipoh coffe' 보다 비싼 상품명 조회
select p1.ProductName, p1.price
from products p1 join products p2
where p1.Price > p2.Price
and p2.ProductName = 'Ipoh Coffee';

select * from products
order by Price desc;
select * from products
where ProductName='Ipoh Coffee'
order by Price, ProductName