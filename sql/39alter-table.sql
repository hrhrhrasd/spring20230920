use w3schools;

-- alter table : 테이블 수정
-- 컬럼 추가, 변경, 삭제
-- 제약사항 변경
-- not null, unique, primary key, default, foreign key

-- 컬럼 추가
alter table products
add column col1 int;

desc products;

alter table products
add column col2 varchar(10) after ProductName;

alter table products
add column col3 int first;

alter table products
add column col4 int(10)
    not null default 1 references employees(EmployeeID);

-- ex)직원테이블 salay 컬럼 마지막에 추가
-- date type dec(10,2), null x, 기본 0.00

alter table employees
add column salary dec(10,2) not null default 0.00;

desc employees;

alter table products
drop col1;

alter table products
drop  column col2;

desc products;

-- 컬럼 변경
alter table products
modify col3 int(20);