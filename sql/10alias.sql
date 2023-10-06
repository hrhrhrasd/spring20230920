select * from employees;
select EmployeeID, LastName from employees;

-- 컬럼명or 테이블명 변경

select EmployeeID as id, LastName as name from employees;
select EmployeeID, concat(FirstName, ' ', LastName) as fullName -- as 생략 가능
from employees;
select EmployeeID, concat(FirstName, ' ', LastName) fullName
from employees;
select EmployeeID, concat(FirstName, ' ', LastName) `full Name` -- 따옴표 아님(backtick)
from employees;

-- 공급자의 이름&주소(ad, city, country 연결),전화번호(phone number)로 조회
select SupplierName, concat(Address, '/ ', City, '/ ', Country), Phone `phone number`
from suppliers;

select * from products;
select * from categories;

select p.ProductName, c.CategoryName
from products as p
join categories as c on p.CategoryID = c.CategoryID;