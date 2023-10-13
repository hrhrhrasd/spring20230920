use w3schools;

select Price from products where ProductName='ipoh coffee';
select ProductName, price from products where Price > 46.00;

select ProductName, price
from products
where Price > (select Price
               from products
               where ProductName = 'ipoh coffee'
    );

select LastName, FirstName,BirthDate from employees
where BirthDate < (
    select BirthDate
    from employees
    where LastName = 'Leverling'
    )
order by BirthDate;

-- subquery : 1개의 행 1개의 열

-- n개의 행 1개의 열
select ShipperID from orders where OrderDate = '1996-07-08';
select CustomerName from customers where Country = 'mexico';

-- n개의 행 n개의 열
select CustomerID, CustomerName from customers where Country='mexico';

-- ex) 행1 열1
-- 'tofu' 상품을 공급하는 공급자명
select SupplierName from suppliers
where SupplierID = (
    select SupplierID
    from products
    where ProductName = 'tofu'
    );

select s.SupplierName from suppliers s
join products p
on s.SupplierID = p.SupplierID
where p.ProductName = 'tofu';

-- ex) n행 1열
-- 맥시코 고객이 주문한 일자

select OrderDate from orders
where CustomerID in (
    select CustomerID from customers
                      where Country = 'mexico'
    );

-- ex) 1번 카테고리에 있는 상품이 주문된 주문번호
select * from orderdetails
where ProductID in (
    select ProductID from products
    where CategoryID = 1
    );

-- ex) 1번 카테고리에 있는 상품이 주문된 날짜
select OrderDate, OrderID from orders
where OrderID in ( -- 354 orderId가 key 이기때문에 1개의 orderId 안에
    select OrderID from orderdetails        -- 여러 orderdetail이 있어도 1개만 출력
    where ProductID in ( -- 404
        select ProductID from products
        where CategoryID = 1 -- 12
    )
    );

select o.OrderDate, o.OrderID, od.OrderDetailID, od.OrderID  -- distinct 하면 위와 동일
from orders o left join orderdetails od
on o.OrderID = od.OrderID
left join products p
on p.ProductID = od.ProductID
where p.CategoryID=1; -- 404

select * from orderdetails
where OrderDetailID in (2131,2145,2154);

-- 주문한 적 없는 고객들
select * from customers where CustomerID not in (
select CustomerID from orders);

-- n행 m열
select * from customers;
insert into customers (CustomerName, Address,Country)
(select SupplierName, Address, Country from suppliers);

insert into customers (CustomerName, Address, Country)
select ContactName,City,Phone from suppliers;

select * from customers
where (City,Country)
in (select City, Country from suppliers);

create table table_c
select CustomerName, city, Country from customers;  -- 제약사항은 가져오지 않음

create table table_d
select ProductName, CategoryName, price from products p join categories c
on p.CategoryID = c.CategoryID
where p.CategoryID = 1;

select * from table_d;