-- group by : 그룹함수 사용시 그룹함수의 범위(그룹) 지정

select max(Price) from products;
select CategoryID, max(price) from products
group by CategoryID; -- categoryId 컬럼이 유효

select CategoryID, max(price), min(price) from products
group by CategoryID;

select CategoryID, max(price) as maxp , min(price) from products
group by CategoryID order by maxp desc;

-- 일별 매출액
select OrderDate, (Price*Quantity) as 매출 from products p join orderdetails od
on p.ProductID = od.ProductID
join orders o
on o.OrderID = od.OrderID
group by OrderDate
order by OrderDate;

-- 직원별 주문처리 금액
select e.LastName, sum(Price*Quantity) from orders o join employees e
on o.EmployeeID = e.EmployeeID
join orderdetails od
on od.OrderID = o.OrderID
join products p
on p.ProductID = od.ProductID
where o.OrderDate >= '1996-08-01' and o.OrderDate <'1996-09-01'
group by e.LastName;


-- 고객별 총 주문 금액 조회

select c.CustomerName, sum(Price*Quantity) as s from orders o join customers c
   on c.CustomerID = o.CustomerID
join orderdetails od
   on od.OrderID = o.OrderID
join products p
   on p.ProductID = od.ProductID
group by c.CustomerName;

-- 그중 100000달라 이상 소비자
SELECT * FROM
    (SELECT c.CustomerName, SUM(p.Price * od.Quantity) `총 주문금액`
     FROM customers c JOIN orders o ON c.CustomerID = o.CustomerID
                      JOIN orderdetails od ON o.OrderID = od.OrderID
                      JOIN products p ON od.ProductID = p.ProductID
     GROUP BY c.CustomerID) t1
WHERE t1.`총 주문금액` >= 100000;