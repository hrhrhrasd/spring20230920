-- null 허용 여부
-- 유일한 값 여부
-- 기본값 지정
-- 값 체크

use mydb1;

create table my_table13 (
    col1 int,
    col2 int not null
);

insert into my_table13 (col1, col2)
    value (33, 44);

insert into my_table13 (col2)
    value (55);

insert into my_table13 (col1)
    value (66); -- x(null 허용x)

select * from my_table13;

-- unique : 중복 x (null)은 중복으로 안침

create table my_table14 (
    col1 int,
    col2 int unique
);

insert into my_table14 (col1, col2)
    value (33, 44);
insert into my_table14 (col1, col2)
    value (33, 55);
insert into my_table14 (col1, col2)
    value (33, 44); -- x

select * from my_table14;

create table my_table15
(
    col1 int,
    col2 int not null,
    col3 int unique,
    col4 int not null unique
);

insert into my_table15 (col1, col2, col3, col4)
value (11,22,33,44);

insert into my_table15 (col1, col2, col3, col4)
    value (11,22,33,44);

create table my_table16 (
    col1 varchar(10) unique
);

insert into my_table16 (col1)
    value ('');
insert into my_table16 (col1)
    value ('');

-- default : 기본값
create table my_table17
(
    col1 int,
    col2 int default 100,
    col3 varchar(10) default 'empty'
);
insert into my_table17 (col1)
value (1);

insert into my_table17 () value ();

select * from my_table17;

CREATE TABLE my_table18 (
                            col1 INT,
                            col2 INT DEFAULT 300,
                            col3 INT NOT NULL DEFAULT 500
);
INSERT INTO my_table18 (col1, col2, col3)
    VALUE (3, NULL, NULL); -- not ok
INSERT INTO my_table18 (col1, col3)
    VALUE (3, 222); -- ok
INSERT INTO my_table18 (col1)
    VALUE (4);
SELECT * FROM my_table18;

CREATE TABLE my_table19 (
    col1 INT NOT NULL UNIQUE DEFAULT 100
);

-- 테이블의 컬럼과 타입,제약사항 등을 확인
-- DESCRIBE, DESC
DESCRIBE my_table18;
DESC my_table18;

DESC my_table15;

-- TABLE 생성 쿼리 확인
SHOW CREATE TABLE my_table15;
CREATE TABLE `my_table15` (
                              `col1` int(11) DEFAULT NULL,
                              `col2` int(11) NOT NULL,
                              `col3` int(11) DEFAULT NULL,
                              `col4` int(11) NOT NULL,
                              UNIQUE KEY `col4` (`col4`),
                              UNIQUE KEY `col3` (`col3`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci
;

create table my_table20 (
    col1 int,
    col2 int check ( col2 > 100 ),
    col3 int check ( col3 > 1000 and col3 <2000 )
);
desc my_table20;
show create table my_table20;
CREATE TABLE `my_table20` (
                              `col1` int(11) DEFAULT NULL,
                              `col2` int(11) DEFAULT NULL CHECK (`col2` > 100),
                              `col3` int(11) DEFAULT NULL CHECK (`col3` > 1000 and `col3` < 2000)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

insert into my_table20 (col1, col2, col3)
value (1500, 50 -10); -- x
insert into my_table20 (col1, col2, col3)
value (10000, 150, 1500); -- ok







