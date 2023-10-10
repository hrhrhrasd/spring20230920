select * from customers
where CustomerName like '%the%';

select * from customers
where CustomerName like '%ch%';

-- like : 검색
-- %, _ 기호(wildcard) 사용
select * from customers
where CustomerName like 'ch%'; -- ch뒤에 0개 이상의 문자
select * from customers
where CustomerName like '%er'; -- er로 끝나는 문자열 (er 앞에 0개 이상의 문자)
select * from customers
where CustomerName like '%er%'; -- er이 있는 문자열

select * from employees
where FirstName like '_____'; -- _ : 1개의 문자(아무거나) >> 5글자 문자열
select * from employees
where LastName like '____'; -- 4글자 문자열
select * from employees
where LastName like '_e%'; -- 두번쨰 문자가 e인 문자열

-- ch로 시작하는 상품
select * from products
where ProductName like 'ch%';
-- es로 끝나는 상품
select * from products
where ProductName like '%es';
-- use가 들어간 상품명
select * from products
where ProductName like '%use%';
-- 두번째 글자 u
select * from products
where ProductName like '_u%';
