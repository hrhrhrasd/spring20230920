-- 정규화 normalization

-- 첫번째 정규화 (first noraml form) 1nf
-- 원자적 데이터를 가진 테이블, pk 컬럼이 있어야 함

-- 두번째 정규화 (second normal form) 2nf p.369
-- 1nf + 부분적 함수 의존이 없다.
-- 키의 일부가 변경되었을때 키가 아닌 컬럼이 변경되어야 하면 부분적 함수 의존
-- ex) 이름이 키 일때, 이름의 약자 컬럼은 부분적 함수의존

-- 3nf p.374
-- 2nf + 이행적 종속이 없어야 함

-- 이행적 종속 (transitive dependency)
-- 키가 아닌 컬럼이 키가 아닌 다른 컬럼에 의존

-- 입사 지웑
-- id, 이름 학교 학교주소
create table my_table30_person
(
    id int primary key auto_increment,
    name varchar(20),
    school varchar(20),
    address varchar(20)
);

insert into my_table30_person (name, school, address)
values ('son','서울대','관악'),
       ('강인','고려대','안암'),
       ('민재','연세대','신촌'),
       ('지성','고려대','안암'),
       ('범근','연세대','신촌');

select * from my_table30_person;

create table my_table31_person (
    id int primary key auto_increment,
    name varchar(20),
    school varchar(20)
);
create table my_table31_school (
    id int primary key auto_increment,
    name varchar(20),
    address varchar(20)
);

insert into my_table31_person (name, school)
values ('son','서울대'),
       ('강인','고려대'),
       ('민재','연세대'),
       ('지성','고려대'),
       ('범근','연세대');
insert into my_table31_school (name, address)
values ('서울대','관악'),
       ('고려대','안암'),
       ('연세대','신촌');

create table my_table33_person (
        id int primary key auto_increment,
        name varchar(20),
        school_id int -- 한 테이블의 컬럼이 다른 테이블을 참조하면 pk를 사용해야함
);
create table my_table34_school (
        id int primary key auto_increment,
        name varchar(20),
        address varchar(20)
);

insert into my_table33_person (name, school_id)
values ('흥민',1),
       ('강인',2),
       ('민재',1);
insert into my_table34_school (name, address)
values ('서울대','관악'),
       ('연세대','신촌'),
       ('고려대','안암');

insert into my_table33_person (name, school_id)
values ('지성', 4); -- 문제 발생

create table my_table35_person (
        id int primary key auto_increment,
        name varchar(20),
        school_id int REFERENCES my_table36_school(id)
                               -- 외래키(foreign key) 제약사항
);
create table my_table36_school (
        id int primary key auto_increment,
        name varchar(20),
        address varchar(20)
);