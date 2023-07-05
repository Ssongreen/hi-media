show tables;

create table customer(
	id int,
	name varchar(50),
    primary key(id)
);

create table order_list(
	order_id int not null,
    id int not null,
    product_name varchar(50) not null,
    primary key(order_id),
    foreign key(id) references customer(id)
);
desc customer;
desc order_list;

#row 추가
insert into customer values
(1, "홍씨"),
(2, "이씨"),
(3, "박씨"),
(4, "나씨"),
(5, "하씨");

select * from customer;

insert into order_list values
(1001, 1, "초콜"),
(1002, 1, "샴푸"),
(1003, 2, "책상"),
(1004, 5, "티뷰");
select * from order_list;

#외래키 설정
set foreign_key_checks=0;

## customer id가 5인 로우 삭제
delete from customer
where id = 5;

# 테이블 조회
select * from customer; 
select * from order_list; 

## inner join ###################
#조인에 참여하는 로우(데이터)만 표현 
#교집합 연결에 된 애들만 표현
select *
from customer c INNER JOIN order_list o 
on c.id = o.id;

select * 
from customer c, order_list o
where c.id = o.id;

##left join ##############
#조인에 참여하지 않은 로우 표함
select * 
from customer c  left join order_list o 
	on c.id = o.id;
#customer table 기준으로 조인에 참여하지 않은 로우만 조회
select *
from customer c left join order_list o 
	on c.id = o.id
where o.id is null;

#right join ##############
# order_list table 기준으로 조인에 참여하지 않은 로우 포함

select * from customer c right join order_list o on c.id = o.id;

select * from customer c right join order_list o on c.id = o.id 
where c.id is null;

#full outer join 올 포함 ######### ?신텍스 에러
# select * from customer c FULL OUTER JOIN order_list o 
# on c.id = o.id;
use test;
select * from customer c  left join  order_list o on c.id = o.id
where c.id is null
UNION
select * from customer c  right join order_list o on c.id = o.id
where o.id is null;

# 교집합 뺀 나머지 ###
(select * from customer c where order_list o on c.id = o.id)
UNION all
(select * from customer c select order_list o on c.id = o.id)

SELECT  FROM (
	SELECT  FROM 
	UNION ALL
	SELECT  FROM 
) AS tmp
GROUP BY  HAVING COUNT(*)=1