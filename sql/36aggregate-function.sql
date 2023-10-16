use w3schools;
-- aggregate function (집계함수, 집합함수, 그룹함수)
-- max, min, count, sum, avg 등

-- max
select max(price) from products;
select ProductName, max(price) from products; -- x 잘못된 결과
select ProductName from products
where Price = (select max(price) from products);

select * from products
where Price = (select min(price) from products);

-- ex) 가장 어린 직원 이름
select LastName, FirstName, BirthDate from employees
where BirthDate = (select max(BirthDate) from employees);

-- ex) 가장 연장자 직원
select LastName, FirstName, BirthDate from employees
where BirthDate = (select min(BirthDate) from employees);

-- count 갯수  null 포함 x

insert into products (ProductName)
value ('coffee');
select *
from products;
select count(ProductName) from products;
select count(Price) from products;

select min(price) from products;
select min(ifnull(Price, 0)) from products;

select sum(Quantity) from orders o join orderdetails od
on o.OrderID = od.OrderID
where o.OrderDate= '1996-07-04';

-- 1996-07-04 매출 조회

select sum(price * Quantity) from orders o join orderdetails od
on o.OrderID = od.OrderID
join products p
on p.ProductID = od.ProductID
where o.OrderDate= '1996-07-04';

-- avg : 평균
select avg(price) from  products;