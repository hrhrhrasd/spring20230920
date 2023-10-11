-- delete from tabelName where ~~~
-- !! where절 없을시 테이블 전체 삭제
select * from employees;

select * from employees where LastName='손';
delete from employees where LastName='손';
-- 지우기전에 같은 where절로 지울 레코드가 맞는지 확인 !!!!!!

select * from employees where FirstName='차';
delete from employees where FirstName='차';

-- 직원 테이블에 오늘 입력한 레코드 지우기
select * from employees;
select * from employees where EmployeeID >= 10;
delete from employees where EmployeeID >= 10;
-- 상품
select * from products;
select * from products where ProductID >= 80;
delete from products where ProductID >= 80;

select * from customers;
select * from products;