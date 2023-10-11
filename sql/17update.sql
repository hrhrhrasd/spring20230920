select * from products;
select * from products where ProductID = 3;
update products
set ProductName = '시럽', Price = 15.00
where ProductID = 3;

update products
set ProductName = 'asd', Price = 15.00
where ProductID = 1;

update products
set Price = Price * 2
where ProductID = 3;