use w3schools;

SELECT DISTINCT CustomerID FROM orders ORDER BY 1 ;

SELECT CustomerName
FROM customers
WHERE CustomerID
          NOT IN (SELECT DISTINCT CustomerID FROM orders ORDER BY 1);

SELECT c.CustomerName
FROM customers c LEFT JOIN orders o
                           ON c.CustomerID = o.CustomerID
WHERE o.CustomerID IS NULL ;

-- 주문을 처리한 적 없는 직원

select FirstName, LastName
from employees e left join orders o
on e.EmployeeID = o.EmployeeID
where o.EmployeeID is null;

select count(*) from employees;
select EmployeeID from orders;

insert into employees (LastName, FirstName, BirthDate, Photo, Notes)
value ('손','흥민','2300-01-01','ㅁㄴㅇ','축구');
