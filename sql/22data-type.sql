-- mariadb INT > java int
-- mariadb dec > java double
-- mariadb varchar > java string
-- mariadb date > java Timestamp (LocalDate)
-- mariadb dateTime > java Timestamp (LocalDateTime)

use mydb1;
create table my_table12 (
    int_col int,
    dec_col dec(10,2),
    str_col varchar(10),
    date_col date,
    date_col_time datetime
    );

select * from my_table12;