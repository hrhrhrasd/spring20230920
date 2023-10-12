use mydb1;
-- 1 : n

-- 1 : 1
create table my_table_37_employee (
    id int primary key auto_increment,
    name varchar(20),
    birth date
);

create table my_table_38_employee_info (
    id int references my_table_37_employee(id),
    salary int,
    address varchar(20)
);

-- n : m >> 1 : n + 1 : m
create table my_table39_person (
    id int primary key unique ,
    name varchar(20)
);
create table my_table40_skill (
    id int primary key unique ,
    skill_name varchar(20)
);
create table my_table41_person_skill (
    person_id int references my_table39_person(id),
    skill_id int references my_table40_skill(id),
    primary key (person_id,skill_id)
);






