-- page
select * from suppliers;
select Count(*) from suppliers; -- 29

-- 1페이지에 10개 row >> 총 3페이지
-- count(*) : records 수  : 1 ~ 10 3페이지

-- record n개 페이지당 10개 마이막 페이지 :
-- (n-1)/10