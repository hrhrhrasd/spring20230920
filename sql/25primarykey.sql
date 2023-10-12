-- primary key (기본 키, pk)

create table my_table27 (
    id int primary key,
    name varchar(20)
);

create table my_table28 (
    id int,
    name varchar(20),
    primary key (id)
);

create table my_table29 (
    name varchar(20),
    birth date,
    primary key (name,birth)
);

create table my_table30 (
    id int primary key auto_increment,
    name varchar(10)
);

insert into my_table30 (name)
value ('son');
insert into my_table30 (name)
    value ('lee');
insert into my_table30 (name)
    value ('kim');
select * from my_table30;

delete from my_table30
where id = 4;