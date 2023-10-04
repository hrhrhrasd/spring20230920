-- SELECT : 데이터 조회(읽기, 검색, 가져오기)
SELECT * FROM w3schools.customers; -- 테이블형식
SELECT * FROM w3schools.employees;
SELECT * FROM w3schools.products;

select * from customers;

select CustomerName-- column 이름 나열
from customers;-- table 이름 나열

select CustomerName, CustomerID
from customers;

select CustomerID, CustomerName
from customers;

-- 예1) 직원(employees)의 lastname,firstname,birthdate 조회
select LastName,FirstName,BirthDate
from employees;
-- 예2) 상품(products)의 이름 단위 가격 조회
select ProductName,Unit,Price
from products;
-- 예3) 공급자의 이름 주소 국가 조회
select SupplierName,Address,Country
from suppliers;


-- 고객테이블의 국가 컬럼 조회
select Country from customers;

-- distinct 중복 제거
select distinct Country from customers;

select distinct City,Country from customers;

-- count : 행 갯수
select count(Country) from customers;
select count(distinct Country) from customers;

-- 전체 행의 수
select count(*) from customers;

-- 공급자들의 국가 수
select count(distinct Country) from suppliers;
-- 주문 건수
select count(OrderID) from orders;
-- 고객이 있는 도시 수
select count(distinct City) from customers;
-- 카테고리 수
select count(CategoryID) from categories;