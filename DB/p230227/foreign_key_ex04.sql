/*
foreign key 참조설정############################################
@on delete	: 참조되는(PK) 테이블의 값이 삭제 될 경우의 동작 구문 
@on update	: 참조되는(PK) 테이블의 값이 수정 될 경우의 동작 구문

@cascade	:참조되는 테이블에서 데이터를 삭제하거나 수정하면,
			:참조하는 테이블에서 삭제와 수정이 같이 이뤄짐

@set null	:참조되는 테이블에서 데이터를 삭제하거나 수정하면,
			:참조하는 테이블의 데이터가 null 설정됨

@no action	:참조되는 테이블에서 데이터를 삭제하거나 수정하면,
			:참조하는 테이블의 데이터는 변경되지 않음

@restrict	:MySQL에서는 no action과 같아용 "제한" 
			:참조하는 데이터가 있다면,
			:참조되는 데이터를 삭제하거나 수정할 수 없음
################################################################
*/
#db 선택
use test;

# table 삭제
drop table if exists buy;
drop table if exists customer;

# table 생성
create table if not exists customer(
	id int auto_increment,
    name char(30) not null,
    mobile char(13) not null,
    constraint pk_id primary key(id)
);

create table buy(
	id int,
    price int not null,
    product_name char(50),
    foreign key(id) references customer(id) 
    on delete restrict
    on update restrict
);

## row 추가
insert into customer values(1000, "홍씨", "010-1111-1111");
insert into customer (name, mobile) values("이여사", "010-2222-2222");
insert into customer (name, mobile) values("삼성동", "010-3333-3333");


insert into buy values(1000, 20000, "동원 돈까스");
insert into buy values(1000, 1000, "머리 빗");
insert into buy values(1002, 990, "꾸잇");

select * from customer;
select * from buy;

# no action 설정
set foreign_key_checks=0; ## 외래키를 끊기 
set foreign_key_checks=1; ## default 처음 상태로 만들기

## 삭제 customer 테이블의 id가 1000인 로우 삭제
delete from customer
where id = 1002;

## 수정	customer 테이블의 id가 1000인 로우의 id를 2000으로 수정
update customer
set id =2000
where id = 1000;

## 참조되지 않은 값은 (수정, 삭제) 가능 ##
## 수정	customer 테이블의 id가 1001인 로우의 id를 2002으로 수정
update customer
set id = 2002
where id = 1001;

## 수정	customer 테이블의 id가 1001인 로우의 id를 2002으로 수정
delete from customer
where id = 2002;