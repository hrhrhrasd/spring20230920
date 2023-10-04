select CustomerName, Address, City, Country
from customers;

-- where : 레코드 선택(솎아내기)

select *
from customers
where CustomerID = 1;

select *
from customers
where CustomerID = 2;

select *
from customers
where Country = 'USA';

select *
from customers
where Country = 'mexico';

-- 영국에 사는 고객들 조회
select CustomerName
from customers
where Country = 'UK';

-- 1번 카테고리에 속한 상품들 조회
select ProductName
from products
where CategoryID = 1;

-- Osaka에 있는 공급자들 조회
select SupplierName
from suppliers
where City = 'Osaka';


-- 미국에 사는 고객의 이름 조회
select CustomerName
from customers
where Country = 'usa';

-- 영국에사는 고객의 이름과 번호 조회
select CustomerName, CustomerID
from customers
where Country = 'uk';

-- 2번 카테고리에 있는 상품명과 가격
select ProductName, Price
from products
where CategoryID = 2;

-- 일본에 있는 공급자 이름과 전화번호 조회
select SupplierName, Phone
from suppliers
where Country = 'japan';

-- 2번카테고리의 이름 조회
select CategoryName
from categories
where CategoryID = 2;





