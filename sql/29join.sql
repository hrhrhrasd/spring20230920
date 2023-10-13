use w3schools;

select * from products p join suppliers s
on p.SupplierID = s.SupplierID;

select * from products p join suppliers s
using (SupplierID);

select * from products p natural join suppliers s;