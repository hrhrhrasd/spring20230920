-- 비상관쿼리 : 외부 쿼리의 컬럼이 내부 쿼리에 사용되지 않음


-- 상관쿼리 : 외부 쿼리의 컬럼이 내부 쿼리에 사용 될 때
-- 각 공급자가 있ㄴ느 나라의 고객 수

use w3schools;

select * from suppliers;
select count(*) from customers where Country = 'uk';

select count(*) from customers
where Country = (select Country from suppliers where SupplierID = 1);
select count(*) from customers
where Country = (select Country from suppliers where SupplierID = 2);

select suppliers.SupplierID,
       (select count(*) from customers where customers.Country = suppliers.Country)
        as `number of customers`
from suppliers; -- 실행속도 유의


-- 각 직원보다 나이가 많은 직원의 수
select e2.LastName, e2.BirthDate
       ,(select count(*) from employees e1 where e1.BirthDate < e2.BirthDate) as c
from employees as e2
order by c;