SELECT * FROM customers;

SELECT CustomerName, Country
FROM customers
where Country = 'germany';

select CustomerName,Country
from customers
where not Country = 'germany';

select ProductName, CategoryID
from products
where not CategoryID = 1;

select SupplierName, City
from suppliers
where not City = 'japan';
