/*
DDL alter

alter table 테이블명 modify 컬럼명 자료형;
alter table 테이블명 change 기존 컬럼명 새컬럼명 자료형;
alter table 테이블명 add 	추가 컬럼명 자료형;
alter table 테이블명 drop 	컬럼명;
alter table 테이블명 rename 새 테이블명; "이름 변경"

*/


## 테이블 t1 의 co2 컬럼의 자료형 변경 : varchar(10) - > char(5)
alter table t1 modify co2 char(5);

#t1 테이블 구조

desc t1;
select * from t1;

#테이블 t1의 co1 컬럼명 변경 :co1 -> num
#alter table 테이블명 change 기존 컬럼명 새컬럼명 자료형;
alter table t1 change co1 num int;

#테이블 t1의 num 컬럼명 변경 :num -> co1, 타입 float 변경
alter table t1 change num co1 float;

#테이블 t1에 co4 컬럼 추가 : type - int
alter table t1 add co4 int;

#테이블 t1에 co5 컬럼 추가 : type - int
alter table t1 add co5 int default 0;

#테이블 t1에 co4 컬럼 삭제
alter table t1 drop co4;

#테이블 이름 변경
alter table t1 rename t2;

show tables;