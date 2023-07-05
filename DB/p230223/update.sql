/*
DML update #######################
데이터 수정, 변경 
특정한 값을 수정할 것 row 수정할 거에용

문법
update 테이블명
set 컬럼명 = 변경할값 
where 조건;
*/
# DB 선택
use test;

# t1 테이블 조회
desc t1;
select * from t1;

## t1 테이블 co1 컬럼값이 4인 로우의 co2 컬럼 값을 "둘"로 변경
update t1 set co2 = "둘" where co1 = 4;

## t1 테이블 co1 컬럼값이 8인 로우의 co3 컬럼 값을 null로 변경
update t1 set co3 = null where co1 = 8;

#문제 t1 테이블에서 co1 값이 4~6인 로우의 co3를 0.1 변경
update t1 set co3 = 0.1  where co1 between 4 and 6;

## 과제 salaries의 로우 100개를 복사한 copy_salaries 테이블 생성하세용
# key 복사 없이, 모든 컬럼과 로우 복사
# 입사일이 1986년도인 직원의 현재 연봉을 10% 인상하시오

desc copy_salaries;
use test;
create table copy_salaries like employees.salaries;
insert into copy_salaries select * from employees.salaries where salary limit 100;
select * from copy_salaries; 
update copy_salaries
set salary = salary * 1.1 
where from_date < "19860101";

########################	
create table copy_salaries 
as
select * from employees.salaries limit 100;

####### 입사일 1986년 직원 조회
# 1번
select * from employees.employees where hire_date between "1986-01-01" and "1986-12-31";
# 2번
select * from employees.employees where year(hire_date) = 1986;

### 입사일 1986년 직원 조회
select * from copy_salaries 
where emp_no in(select emp_no 
				from employees.employees 
				where year(hire_date) = 1986)
	 and to_date = "9999-01-01";

update copy_salaries
set salary = salary * 1.1
where emp_no in(select emp_no 
				from employees.employees 
				where year(hire_date) = 1986)
	 and to_date = "9999-01-01";

### 조회
select * from copy_salaries;


#################
select * from t1;

# t1 테이블 co1이 7인 로우에서 co2와 co3를 7로 변경 
# update ti 
# set  컬럼명1 = 값, 컬럼명2 = 값, 컬럼명3 = 값, 컬럼명3 = 값

update t1 
set  co2 = 7, co3 = 7
where co1 = 7;

## copy_temp1 three 컬럼의 값을 200으로 변경
# 조회
select * from copy_temp1;
## 변경
update copy_temp1
set three = 200;
return = copy_temp1;