use mydb1;

create table my_table42_a (
    col1 varchar(1)
);

create table my_table43_b (
    col1 varchar(1)
);

insert into my_table42_a (col1)
values ('a'), ('b'), ('c');

insert into my_table43_b (col1)
values ('b'), ('c'), ('d'), ('e');

select *
from my_table42_a a join my_table43_b b
on a.col1 = b.col1;

select *
from my_table42_a a inner join my_table43_b b
                         on a.col1 = b.col1;

select *
from my_table42_a a left join my_table43_b b
                         on a.col1 = b.col1;
select *
from my_table42_a a left outer join my_table43_b b
                              on a.col1 = b.col1;

select *
from my_table42_a a right join my_table43_b b
                         on a.col1 = b.col1;

select *
from my_table42_a a right outer join my_table43_b b
                               on a.col1 = b.col1;

create table my_table44_a (
    col1 varchar(1),
    name varchar(10),
    address varchar(10)
);

create table my_table45_b (
    col1 varchar(1),
    product varchar(10),
    contry varchar(10)
);

insert into my_table44_a (col1, name, address)
values ('a','흥민','런던'),
       ('b','강인','파리'),
       ('c','민재','뮌헨');

insert into my_table45_b (col1, product, contry)
values ('b','축구공','한국'),
       ('c','컴퓨터','미국'),
       ('d','전화기','호주'),
       ('e','햄버거','영국');

select *
from my_table44_a a join my_table45_b b
on a.col1=b.col1;

select *
from my_table44_a a left join my_table45_b b
                         on a.col1=b.col1;

select *
from my_table44_a a right join my_table45_b b
                         on a.col1=b.col1;