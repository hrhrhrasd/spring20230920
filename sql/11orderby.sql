select *
from employees
order by BirthDate; -- 생일기준 정렬

select *
from employees
order by 4; -- 동일

select EmployeeID, LastName, BirthDate
from employees
order by 3; -- asc 오름 차순

select EmployeeID, LastName, BirthDate
from employees
order by 3 desc; -- 내림 차순

select * from products
order by CategoryID, Price; -- 우선순위

select * from products
order by CategoryID, Price desc;

-- 고객을 국가명 오름차순으로 조회
select CustomerName, Country from customers
order by Country;

-- 가격이 비싼상품이 먼저 조회
select * from products order by Price desc;

-- 어린 직업 먼저
select * from employees order by BirthDate desc;