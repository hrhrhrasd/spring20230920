use w3schools;

select *
from products;
select *
from categories;

-- chais 상품의 카테고리 명?
select CategoryID from products
where ProductName = 'chais';
select CategoryName from categories
where CategoryID = 1;

-- join : 두개의 테이블 결합
select * from products, categories; -- 8 * 77개
select * from products join categories;

--
create table table_a (
    product_id int primary key auto_increment,
    product_name varchar(20),
    category_id int
);
create table table_b (
    category_id int primary key auto_increment,
    category_name varchar(20)

);
insert into table_b (category_name)
values ('음료수'), ('반찬');
insert into table_a (product_name, category_id)
values ('콜라',1),
       ('사이다',1),
       ('제육',2),
       ('돈가스',2),
       ('두부',2);
select * from table_a join table_b;

select * from table_a join table_b
where table_a.category_id = table_b.category_id;

select *from table_a join table_b
where table_a.product_name = '콜라'
and table_a.category_id = table_b.category_id;

select *from table_a join table_b
    on table_a.category_id = table_b.category_id
where table_a.product_name = '콜라';

select * from products join categories
on products.CategoryID = categories.CategoryID
where ProductName = 'chais';

select * from products as p join categories as c
on p.CategoryID = c.CategoryID
where ProductName = 'chais';

-- chais 상품의 공급자명, 전화번호
select SupplierName, Phone from suppliers as s join products as p
on s.SupplierID = p.SupplierID
where p.ProductName = 'chais';

-- 1996sus 7월 4이렝 주문한 고객명
select CustomerName from customers as c join orders as o
on c.CustomerID = o.CustomerID
where o.OrderDate = '1996-07-04';

-- 1996 07 04 주문건 담당자
select LastName,FirstName from employees as e join orders as o
on e.EmployeeID = o.EmployeeID
where OrderDate = '1996-07-04';

select CustomerName, LastName as employeeName, OrderDate from employees as e join orders as o join customers as c
on c.CustomerID = o.CustomerID and e.EmployeeID = o.EmployeeID
order by OrderDate;

select CustomerName, LastName as employeeName, OrderDate
from employees e
         join orders o
              on e.EmployeeID = o.EmployeeID
         join customers c
              on c.CustomerID = o.CustomerID
order by OrderDate;


-- 'chang' 상품의 공급자명 카테고리명 조회
select SupplierName, CategoryName
from products p
         join categories c
              on p.CategoryID = c.CategoryID
         join suppliers s
              on p.SupplierID = s.SupplierID
where p.ProductName = 'chang';


-- 960709에 주문한 고객명과, 직원명
select CustomerName, concat(FirstName, ' ', LastName) as employeeName, OrderDate
from employees  e
         join orders  o
              on e.EmployeeID = o.EmployeeID
         join customers  c
              on c.CustomerID = o.CustomerID
where OrderDate = '1996-07-09';

-- 960709 주문한 상품명
select ProductName
from products p
         join orderdetails od
              on p.ProductID = od.ProductID
         join orders o
              on od.OrderID = o.OrderID
where o.OrderDate = '1996-07-09';

-- 'chang' 상품이 주문된 날짜들
select p.ProductName, OrderDate , concat(e.FirstName, ' ', e.LastName) as fullName
from products p
join orderdetails od
on od.ProductID = p.ProductID
join orders o
on o.OrderID = od.OrderID
join customers c
on o.CustomerID = c.CustomerID
join employees e
on e.EmployeeID = o.EmployeeID
where ProductName = 'chang';













