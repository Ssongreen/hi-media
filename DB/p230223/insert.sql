/*
DML insert ##

row 추가 
문법1 컬럼명 지정
insert into 테이블명 (컬럼명1 , 컬러명2)
value (값1, 값2);

문법2 컬럼명 생량 : 모든 컬럼
insert into 테이블명
values (값1, 값2)

문법3 서브 쿼리 이용
insert into 테이블명(컬럼명1, 컬럼명2)
select 컬럼명1, 컬럼명2
from 테이블명

문법4 한번에 여러 로우 추가
insert into 테이블명(컬럼명1, 컬럼명2)
values (값1, 값2),(값3,값4),(값5,값6);
########################################

*/

# t1 테이블 생성
create table t1(
	co1 int,
    co2 varchar(10),
    co3 float
);

desc t1;
## t1 테이블 조회
select *from t1;
# 로우 추가 : 컬럼명 모두 표시
insert into t1(co1,co2,co3) values(1, "하나",1.1);
# 로우 추가 : 컬럼명 모두 생략
insert into t1 values(2, "둘",2.2);
# 로우 추가 : 일부 컬럼
insert into t1(co1, co2) values(3, "셋");
# 로우 추가 : 컬럼명 모두 표시
insert into t1 values(4, 400 ,4.4);
# 로우 추가 : 자료형 - co1 컬럼 : 문자
insert into t1 values("5", "550","5.5");
# 로우 추가 : 자료형 - co1 컬럼 : 문자
# 앙되영
insert into t1 values("six", "sixth","6.6");

## 테이블 구조(key) 복사 -> 데이터 복사 #####
desc temp1;


#1. 테이블 구조 복사 
create table copy_temp1 like temp1;
#2. 테이블 목록 확인
show tables like "%temp1";

#3. copy_ temp1 구조 확인
desc copy_temp1;

#4. copy_temp1 조회 --> date 없음
 
#5. temp1 조회
 select * from temp1;
 
# 6. copy_temp1에 로우 추가 : temp1 로우 복사
 insert into copy_temp1 select * from temp1;
 
 #7. copy_temp1 조회
  select * from copy_temp1;

## 문제 
# titles 테이블의 일부 구조를 복사한 c_titles 테이블 생성
# 단 emp_no, title, from_date 컬럼 구조 그대로 복사 -> pk 설정 
# 데이터는 title이 Enginner 행만 추가
desc employees.titles;

create table c_titles like employees.titles;
alter table c_titles drop to_date;

select emp_no, title, from_date from employees.titles
where title like "Engineer";

insert into c_titles select emp_no, title, from_date from employees.titles
where title like "Engineer";

select * from c_titles;

## t1테이블 여러개 row 추가
select * from t1;

insert into t1
values(6, "육", 6.6),
(7, "칠", 7.7),
(8, "팔", 8.8);
