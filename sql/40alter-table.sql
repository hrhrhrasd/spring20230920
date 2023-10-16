use mydb1;

create table my_table46 (
    col1 int,
    col2 int,
    col3 int,
    col4 int,
    col5 int
);

-- not null 제약사항 추가
alter table my_table46
modify col1 int not null;

desc my_table46;

-- not null 제약사항 제거
alter table my_table46
modify col1 int null;

-- ex) col2에 not null 제약사항 추가 후 삭제
alter table my_table46
modify col2 int not null;

alter table my_table46
modify col2 int null;

-- default

alter table my_table46
modify col3 int default 100;

alter table my_table46
alter col3 drop default;

-- unique

alter table my_table46
add unique (col5);

alter table my_table46
drop index col5; -- 컬럼명 x 제약사항명

-- primary key

alter table my_table46
add primary key (col5);

alter table my_table46
drop primary key;

desc my_table46;

show create table my_table46;

create table my_table47 (
    id int auto_increment primary key ,
    name varchar(10)
);

-- foreign ket 제약사항 추가

alter table my_table46
add foreign key (col5) references my_table47(id);

desc my_table46;

show create table my_table46;
CREATE TABLE `my_table46` (
                              `col1` int(11) DEFAULT NULL,
                              `col2` int(11) DEFAULT NULL,
                              `col3` int(11),
                              `col4` int(11) DEFAULT NULL,
                              `col5` int(11) NOT NULL,
                              KEY `col5` (`col5`),
                              CONSTRAINT `my_table46_ibfk_1` FOREIGN KEY (`col5`) REFERENCES `my_table47` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

alter table my_table46
drop foreign key my_table46_ibfk_1;

alter table my_table46
drop index col5;

desc my_table46;