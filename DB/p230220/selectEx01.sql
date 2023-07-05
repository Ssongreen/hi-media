/*
SQL ++++++++++++++++++++++++++++++++
정의어 create ,drop, alter
조작어 select, insert, update, delete
제어어 grant revoke, commit, rollback

조작어 select - 조회 , 검색 +++++++++++++++++++++++++++++

select 컬럼명(field명) 
//select statement// seleck 문
select 필드명1, 필드명2  @@@ select clause  select 절
from  테이블명  "__"절   @@@ from 	clause from 절
where 조건;				 @@@ where clause where 절 선택 사항

where clause 사용되는 연산자
비교 (관계) 연산자
sth< 	작다, 미만
sth>	크다, 초과
sth<=	작거나 같다, 이하
sth>=	크거나 같다, 이상
=		같다
<>		다르다

논리 연산자		:and , or ,not
범위 연산자		:between A and B
집합 연산자		:in(값1, 값2, ...) ",(또는)"
문자열 연산자	:like 
				:not like
                :와일드 카드 - %(모든), _(하나)
                ex1) u로 시작하는 u%
                ex2) u로 시작하는 %u
				ex3) u로 시작하는 %u%
  
                
null 			:is null			null과 같다. null이다
				:is not null		null과 같이 않다.m

*/
## DB 선택
use employees;

## 테이블 목록
show tables;

## 테이블 구조 확인
desc employees;

## 전체 직원의 정보 조회
select emp_no, birth_date, first_name, last_name, gender, hire_date
from employees;

## 전체 직원의 정보 중 사원과 이름만 조회
select emp_no, first_name
from employees;

## 사번이 10001인 사원의 정보 조회
select emp_no, birth_date, first_name, last_name, gender, hire_date
from employees
where emp_no = 10001;

use employees;
desc dept_manager;
#select 필드명
#from 테이블명
#where (조건) 컬럼명 ;

#문제 1번 d005 부서 매니저의 사원번호 부서번호
select emp_no, dept_no
from dept_manager
where dept_no = "d005";
# Query statement 커리문
#문제 2번 d003 부서 소속 담당이 아닌 매니저 사원번호 부서번호 
select emp_no, dept_no
from dept_manager
where dept_no <>"d003";
#<> 다르다

#문제 3번 연봉이 150,000 이상 사원들의 사원번호 연봉
select emp_no, salary 
from salaries
where salary >= 150000;

#문제4 1986년 이후에 입사한 사원의 번호 입사일 이름 
select emp_no, hire_date, first_name
from employees
where hire_date >= "1986-01-01";

#문제5 1990년 이후부터 매니저로 근무하고 있는 사원의 사원번호 부서 번호 매니저 시작 날짜
select emp_no, dept_no, from_date, to_date
from dept_manager 
where from_date >= "1990-01-01";

#문제6 1990년 이전 입사한 사원들의 사원번호 입사일 
select emp_no, hire_date
from employees
where hire_date <= "1990-12-31";
