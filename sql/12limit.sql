-- limit 조회 레코드(행) 제한
select * from customers limit 5;

select * from products
order by Price desc limit 10;

-- 어린직원 3명
select * from employees
order by BirthDate desc limit 3;

-- 2번 카테고리에서 가장 저렴한 상품
select * from products
where CategoryID=2
order by Price limit 1;

-- limit n : n개
-- limit n, m : n부터 m개 (0부터 시작)
select ProductName, Price from products
order by Price
limit 3, 5;

-- 페이지 나누기
select CustomerID, CustomerName from customers
order by CustomerID
limit 0, 10; -- 1페이지 10개

select CustomerID, CustomerName from customers
order by CustomerID
limit 10, 10; -- 2페이지 10개

select CustomerID, CustomerName from customers
order by CustomerID
limit 20, 10; -- 3페이지 10개

select CustomerID, CustomerName from customers
order by CustomerID
limit 90, 10; -- 마지막

-- 공급자 를 한페이지에 5개씩 보여줄때 3페이지 조회

select * from suppliers order by SupplierID limit 10,5;