-- normalization : 정규화
use mydb1;
-- atomic data (원자적 데이터) p.209
-- ex)이름, 최종 학력, 특기,
create table my_table21_person (
    name varchar(100) not null,
    schools varchar(100),
    skill varchar(1000)
);

insert into my_table21_person (name, schools, skill)
value ('손흥민', '대졸', '축구, 노래');
insert into my_table21_person (name, schools, skill)
    value ('이강인', '대학원', '야구, 농구');
insert into my_table21_person (name, schools, skill)
    value ('김민재', '대학원', '배구');


select * from my_table21_person; -- 규칙 1 위반

create table my_table22_person (
    name varchar(100) not null,
    schools varchar(100),
    skill1 varchar(100),
    skill2 varchar(100),
    skill3 varchar(100)
);

insert into my_table22_person (name, schools, skill1, skill2, skill3)
value ('흥민', '대학', '축구', '노래', null);
insert into my_table22_person (name, schools, skill1, skill2, skill3)
    value ('강인', '대학원', '야구', '농구', null);
insert into my_table22_person (name, schools, skill1, skill2, skill3)
    value ('민재', '대학원', '배구', null, null);
select * from my_table22_person; -- 규칙 2 위반

create table my_table23_person (
        name varchar(100) not null,
        schools varchar(100),
        skill varchar(1000)
);
insert into my_table23_person (name, schools, skill)
    value ('손흥민', '대졸', '축구');
insert into my_table23_person (name, schools, skill)
    value ('손흥민', '대졸', '노래');
insert into my_table23_person (name, schools, skill)
    value ('이강인', '대학원', '야구');
insert into my_table23_person (name, schools, skill)
    value ('이강인', '대학원', '농구');
insert into my_table23_person (name, schools, skill)
    value ('김민재', '대학원', '배구');
select * from my_table23_person;

-- 각 행을 구분하는 컬럼(들)
create table my_table24_person (
    id int not null unique auto_increment,
    name varchar(20) not null,
    schools varchar(20),
    skill varchar(20)
);
-- auto_increment 1부터 1씩 자동으로 증가
-- 기본 키 (primary key) 조건 p.216
insert into my_table24_person (name, schools, skill)
    value ('흥민', '대졸', '축구');
insert into my_table24_person (name, schools, skill)
    value ('강인', '대졸', '축구');

select * from my_table24_person;

create table my_table26_person (
        id int primary key auto_increment, -- primary key == not null unique
        name varchar(20) not null,
        schools varchar(20),
        skill varchar(20)
);

desc my_table24_person;
desc my_table26_person;