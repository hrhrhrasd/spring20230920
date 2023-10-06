select * from products where ProductID = 1;
select Price + 1 from  products where ProductID = 1;
select Price - 10.5 from products where  ProductID = 1;
select Price * 3 from products where  ProductID = 1;
select Price / 5 from products where  ProductID = 1;

select ProductName, Price * 2 from products;
select ProductName + 'a', Price * 2 from products; -- 문자열 연결 연산 불가
select concat(ProductName, 1), Price from products;
select concat(ProductName, 'a'), Price from products;

select LastName, BirthDate from employees;
select LastName, BirthDate + 1 from employees;
select LastName, BirthDate + 100 from employees;
select LastName, adddate(BirthDate, INTERVAL 1 day) from employees;

select EmployeeID, concat(FirstName, ' ', LastName) from employees;

-- 주문 수량 *2 결과
select Quantity *2 from orderdetails;
-- "city, country" 고객 테이블 조회
select *, concat(City, ' ', Country) from customers