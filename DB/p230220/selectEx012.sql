/*
[SQL] =======================================
-정의어 : create, drop, alter
-조작어 : select, insert, update, delete
-제어어 : grant, revoke, commit, rollback

[조작어] select - 조회, 검색 ================
<< select statement >> select 문
select 필드명1, 필드명2	 ## << select clause >> select 절
from   테이블명			 ## << from clause >>   from 절				
where  조건;             ## << where clause >>  where 절

[where clause 사용되는 연산자] ===============
* 비교(관계) 연산자
  <		작다, 미만
  >		크다, 초과
  <=	작거나 같다, 이하
  >= 	크거나 같다, 이상
  =		같다
  <>	다르다

* 논리 연산자	: and, or, not
* 범위 연산자	: between A and B
* 집합 연산자	: in (값1, 값2, ...)
				  not in (값1, 값2, ...)
                  
* 문자열 연산자 : like
				  not like
                  
* null 연산자	: is null
				  is not null
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

## [즐거운 문제] ==================================================================
## [문제 1] d005 부서 매니저의 사원번호, 부서번호 추출하시오.

## [문제 2] d003 부서 소속(담당)이 아닌 매니저들의 사원번호, 부서번호 추출하시오.

## [문제 3] 연봉이 150,000 이상인 사원들의 사원번호, 연봉 추출하시오.

## [문제 4] 1986년 이후에 입사한 사원의 사원번호, 입사일, 이름 추출하시오.

## [문제 5] 1990년 이후부터 매니저로 근무하고 있는 사원들의 사원번호, 부서번호,
##         매니저 시작날짜 추출하시오. 

## [문제 6] 1990년 이전 입사한 사원들의 사원번호, 입사일 추출하시오.

## ===============================================================================
