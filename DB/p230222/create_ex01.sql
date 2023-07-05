## DDL 정의어 : create, alter, drop, rename, truncate 
## DML 조작어 : select, update, insert, delete #insert만 where에 없어요요
## DCL 제어어 : grant, revoke, commit, rollback

## test DB 생성
## 문법 create database DB명;
create database test;

show databases;
#DB 삭제
drop database test;

#DB 생성
create database test
char set = utf8mb4; ##이모지 설정한 값

## 이모지 (emoji) :윈도우 + 마침표, 윈도우 + 세미콜론
# 안녕😎(╯°□°）╯︵ ┻━┻(⌐■_■) 

## test DB 선택
use test;

## table 목록 확인
show tables;

## 테이블 생성

# 문법 1 #############
# create table [if not exists]"테이블명"(
	#컬럼명 자료형,
    #컬럼명 자료형(크기)
#);

# 문법 2##############
#테이블 구조 + 데이터 복사
# 서브 쿼리 이용한 테이블 생성
# 테이블 복사 -> 키는 복사 안됨
/*create table [if not exists] 테이블명
as
####서브 쿼리#####
select 컬럼명, 컬럼명
from 테이블명
where 조건;

#문법 3 ##########################
# 테이블 구조만 복사
# key 복사
create table [if not exists] 복사본_테이블명 like 원본_테이블명;
*/ 
## t1 테이블 생성
create table t1(
	co1 int ,
    co2 varchar(10),
    co3 float
    
);
show tables;

#t1 테이블 구조
desc t1;

# t1 테이블 데이터 조회
select * from t1;

#####서브쿼리 이용한 테이블 생성

## departments 테이블의 모든 데이터 조회
select * from departments;

# 문법 select * from DB명.테이블명
select * from employees.departments;
select * from DB명.테이블명;

##현재 선택된 DB확인
select database();

#test DB의 테이블 목록
show tables;

## employees DB의 departments 테이블 복사
create table copy_departments
as
select * from employees.departments; 

## copy_departments 로우 조회
select * from copy_departments;

##테이블 구조
## employees BD의 departments 테이블(원본)과 
## test DB의 	  copy_departments 테이블(복사본)의 구조 차이
desc employees.departments;
desc copy_departments;

#문제 사번과 직책 컴럼으로 구성된 copy_title 테이블을 생성하시오
##단, staff 정보로만 데이터 구성

## employees.titles 테이블 구조
desc employees.titles;

## employees.titles 테이블 조회
select emp_no, title from employees.titles where title like "staff";

## copy_titles 테이블 생성
create table copy_titles
as
select emp_no, title from employees.titles where title like "staff";

#copy_title 테이블 구조
desc copy_titles;
select * from copy_titles;

## test DB의 테이블 목록
show tables;
show tables like "copy%";

## employees 테이블 구조 확인
desc employees.employees;         

## employees 테이블의 구조를 복사한 copy_employees 테이블 생성

create table copy_employees like employees.employees;   

## copy_employees 테이블 구조 확인
desc copy_employees;

## copy_employees 테이블 조회
select * from copy_employees;

## test DB의 테이블 목록
show tables;