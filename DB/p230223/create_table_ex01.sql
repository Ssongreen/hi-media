/*
DDL create ###############################

create table [if not exsits] 테이블 명(
	컬럼명 자료형,
    컬럼명 자료형
);
    
  제약 조건###############################
  primary key : 기본키 - 중복 허용x, null 허용x
  foreign key : 왜래키 -중복 o null 허용 o 참조값만 허용
  not null    : null 허용 x
  auto_increment : 자동으로 1씩 증가
  unique 	  : 중복 허용 x (유일값) ,null 허용
  check 	  : 값의 범위나 종류 지정(domation, 도메인) my SQL 8.0.16 부터 지원
  default	  : 기본 값
  #####################################  
*/

# 현재 DB 확인
select database();

# 테이블 생성
create table if not exists t1(
	co1 int,
    co2 float
);

create table temp1(
	one int primary key auto_increment, 전 값에 증가 1 "컬럼 레벨 방식" culem level rule
    two int not null, 절대 null 안되용
    three int
);

desc temp1;

##temp1 조회
select * from temp1;

#insert into 테이블명(컬렁명, 컬럼명) 같은 위치는 생략가능
#values (값1, 값2);

insert into temp1 values (1, 1, 1);
insert into temp1 (two, three) values(2, 2);
insert into temp1  values(100, 100, 100);
insert into temp1  (two, three) values(3, 3);
insert into temp1  (one, two) values(200, 200);
insert into temp1  (two, three) values(3, 1);

##제약 설정에 어긋하면 데이터 삽입이 안되용
#one 칼럼 제약 조건 - pk - 중복값으로 위배됨
insert into temp1  values(1, 5, 5);

# two 컬럼 제약 조건 - not null 제약 조건에 위배됨
insert into temp1 (one, three) values(4, 4);

/*create table temp2(
	one int,
    two int unique,
   constraint pk (제약명) primary key(one) 		테이블 레벨 방식 권장 해용
);
*/

create table temp2(
	one int,
    two int unique,
    constraint pk_one primary key(one)
);
desc temp2;

## temp2 조회
select * from temp2;

## row 추가
insert into temp2 values(1, 1); 
insert into temp2 (one) values(3); 

##제약 설정에 어긋하면 데이터 삽입이 안되용
# two 컬럼 제약 조건 - unique => 중복 허용 안됨
insert into temp2 (one, two) values(2, 1); 

# one 컬럼 제약 조건 - pk => null 허용 안됨
insert into temp2 (two) values(2); 

create table temp3(
	gender char(1) not null,
    age int default 1,
    constraint ck_gender check(gender in ("M","F")), check (age>0)
);

desc temp3;

## temp3 조회
select * from temp3;

# 로우 추가
insert into temp3 values("M" , 5);
insert into temp3 values("f" , 6);
insert into temp3 (age) values(29);
insert into temp3 (gender) values("f");

##제약 설정에 어긋하면 데이터 삽입이 안되용
# gender 컬럼 제약 조건 - check => 도메인 값이 아니에용용
insert into temp3 values("w", 34);
# age 컬럼 제약 조건 - check => 
insert into temp3  values("f", 0);
# gender 컬럼 제약 조건 - char에 데이터 값 설정에 벗어나서 그래용
insert into temp3  values("Man", 33);

##my sql 버전 확인
select version();
## 다중은 테이블 방식
create table temp4(
	one int,
    two char(10),
    three float,
	four int,
	constraint pk_temp4 primary key(one, two, three)
);

desc temp4;

#로우 추가
insert into temp4 values(1,1,1,1);
insert into temp4 values(1,2,2,2);

# pk - 위에 중복 값이라 앙되용
insert into temp4 values(1,2,2,3);
# pk - null 값이라 앙되용
insert into temp4 (one, three, four) values(3,3,3);

# temp4 조회
select * from temp4;

select * from temp1;
desc temp1;

#"테이블 생성" 외래키 설정
create table temp5(
	id int,
    name varchar(50),
    constraint fk_id foreign key(id) references temp1(one)

);

desc temp5;
select *from temp5;
select *from temp1;

## 로우 추가
insert into temp5 values(1, "홍씨");

# 오류 fk - 원인 : pk에 겂는 값을 5를 입력해서 그래용
insert into temp5 values(5, "박씨");

insert into temp5 (name) values("이씨");
insert into temp5 values(1, "해씨");


## 문제 
## temp6 테이블 생성 
##id: pk, name varchar(30) age: >1 

create table temp6(
	id int not null,
    name varchar(30) not null,
    age int not null,
    primary key(id),
    foreign key(id) references temp1(one), 
    check (age>0)

);

desc temp6;

##조회
select *from temp6;

#데이터 추가
insert into temp6 values(1, "홍", 31);
##참조를 사용하려는데 참조 번호가 없어서 그래용
insert into temp6 values(5, "박", 33);
## 기본 값 설정으로 중복 앙되용
insert into temp6 values(1, "이", 37);
