use w3schools;

-- union : 합집합
select  Country from customers;
select  Country from suppliers;

select Country from customers
union
select Country from suppliers; -- 중복 x

select Country from customers
union all
select Country from suppliers; -- 중복 o

select CustomerName, Country from customers
union
select SupplierName, Country from suppliers;

-- 직원의 lname, fname 한번에
select LastName name from employees
union
select FirstName from employees;

-- full outer join
use mydb1;
-- left join union right  join
select * from my_table44_a left join my_table45_b
on my_table44_a.col1 = my_table45_b.col1
union
select * from my_table44_a right join my_table45_b
on my_table44_a.col1 = my_table45_b.col1;