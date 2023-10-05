SELECT * FROM customers;
SELECT CustomerName, City, Country FROM customers
WHERE Country = 'spain';
SELECT CustomerName, City, Country FROM customers
WHERE City = 'Madrid';
SELECT CustomerName, City, Country FROM customers
WHERE City = 'Madrid' AND Country = 'Spain';
SELECT CustomerName, City, Country FROM customers
WHERE City = 'Madrid' AND Country != 'Spain';
SELECT CustomerName, City, Country FROM customers
WHERE City != 'Madrid' AND Country = 'Spain';
SELECT CustomerName, City, Country FROM customers
WHERE City != 'Madrid' AND Country != 'Spain';

SELECT CustomerName, City, Country FROM customers
WHERE NOT (City = 'Madrid' AND Country = 'Spain');

SELECT CustomerName, City, Country FROM customers
WHERE City != 'Madrid' OR Country != 'Spain';

SELECT CustomerName, City, Country FROM customers
WHERE City = 'Madrid';
SELECT CustomerName, City, Country FROM customers
WHERE Country = 'Spain';
SELECT CustomerName, City, Country FROM customers
WHERE City = 'Madrid' OR Country = 'Spain';
SELECT CustomerName, City, Country FROM  customers
WHERE Country = 'Spain' OR Country = 'UK';

SELECT * FROM products
WHERE Price >= 10.00 AND Price <= 20.00;
SELECT * FROM customers
WHERE CustomerName >= 'c' and CustomerName < 'd';
SELECT * FROM employees
WHERE BirthDate >= '1958-01-01' and BirthDate < '1959-01-01';

-- 스웨덴 또는 이탈리아 공급자 조회
select SupplierName, Country from suppliers
where Country='sweden' or Country='italy';

-- 1963 8월생 직원 조회
select LastName,BirthDate from employees
where BirthDate >= '1963-08-01' and BirthDate < '1963-09-01';

-- 가격 100 ~ 200 (포함)
select ProductName, Price from products
where Price >= '100.00' and Price <= '200.00';

-- 1997년도 주문건 조회
select OrderID, OrderDate from orders
where OrderDate >= '1997-01-01' and OrderDate < '1998-01-01';

-- 여러 연산자 조합시 () 사용해서 우선순위 결정해줄 것

-- 예) 1번 카테고리인 상품 중 10달러 미만, 100달러 이상
SELECT * FROM products
WHERE (Price < 10 OR Price >= 100) AND (CategoryID = 1);