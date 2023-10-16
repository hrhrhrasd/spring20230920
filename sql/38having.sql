-- having : select절에서 연산 등으로 생성된 컬럼을 사용할 때(실제 테이블에 없는)
SELECT * FROM
    (SELECT c.CustomerName, SUM(p.Price * od.Quantity) `총 주문금액`
     FROM customers c JOIN orders o ON c.CustomerID = o.CustomerID
                      JOIN orderdetails od ON o.OrderID = od.OrderID
                      JOIN products p ON od.ProductID = p.ProductID
     GROUP BY c.CustomerID) t1
WHERE t1.`총 주문금액` >= 100000;

select c.CustomerName, sum(Price*Quantity) as s from orders o join customers c
   on c.CustomerID = o.CustomerID
join orderdetails od
   on od.OrderID = o.OrderID
join products p
   on p.ProductID = od.ProductID
group by c.CustomerName
having s >= 100000;

-- ex) 총 처리 금액 10만달러 미만인 직원

select LastName, sum(Price*Quantity) as s from employees e join orders o
on o.EmployeeID = e.EmployeeID
join orderdetails od
on od.OrderID = o.OrderID
join products p
on p.ProductID = od.ProductID
group by LastName
having s < 100000;