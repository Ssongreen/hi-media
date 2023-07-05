## 논리 연산자 : ()and() , ()or() , not() 

#d001 부서 매니저 중 1990년 이후 부터 매니저인 사원의 사원번호 부서번호 매니저 시작일 조회 

select emp_no, dept_no, from_date
from dept_manager
where dept_no = "d001" and from_date >= "1990-01-0";

## 문제
#Q.1 1990년 이후 입사한 남자 사원의 사원번호 성별 입사일 추출
select emp_no, gender, hire_date
from employees
where hire_date >= "1990-01-01" and gender = "m";

#Q.2 1990년 이후부터 연봉을 60000 이상 받는 사원의 사원번호 연봉 연봉 수령 날짜(시작일)

select emp_no, salary, from_date
from salaries
where from_date >= "1990-01-01" and salary >= 60000;
#Q.3 d001부서와 d002 부서 매니저의 사원번호 부서번호

select emp_no, dept_no
from dept_manager
where dept_no = "d001" or dept_no = "d002";
#Q.4 직책이 staff engineer 인 사원의 사원번호 직책 호출
select emp_no, title
from titles
where title = "staff" or title = "engineer";
#Q.5 d003 부서 소속 담당이 아닌 매니저의 사원번호 부서번호 호출
select emp_no, dept_no
from dept_manager
where not dept_n = "d003";

##범위 연산자 between 연산자
#연봉이 6m 이상 7m 이하 사원의 사원 번호 연봉

## and 연산자
select emp_no, salary
from salaries
where salary >= 60000 and salary <= 70000;

## between 연산자 
##"문법" : where 컬럼명 between 시작값 and 끝값;
select emp_no, salary
from salaries
where salary between 60000 and 70000;

## 집합 연산자 ### in 연산자, not in 연산자
## d001부서와 d002 부서 매니저의 사원번호 부서번호##

### or 연산자 ###
select emp_no, dept_no
from dept_manager
where dept_no = "d001" or dept_no = "d002";

### in 연산자 ### 
## 문법 where 컬럼명 in (값1, 값2, 값3,);##
select emp_no, dept_no
from dept_manager
where dept_no in ("d001", "d002");


## d001부서, d002 부서 아닌 매니저의 사원번호 부서번호##
select emp_no, dept_no
from dept_manager
where dept_no <> "d001" and dept_no <> "d002";

select emp_no, dept_no
from dept_manager
where dept_no not in ("d001", "d002");

##문자열 연산자 : like , not like
## 성별이 여인 사원의 사번, 이름 ,성별 조회
##binary "대 소문자 구분"
select emp_no, first_name, gender
from employees
where gender = "f";

select emp_no, first_name, gender
from employees
where gender like "f";

##이름이 B로 시작하는 사원 사번, 이름 
select emp_no, first_name
from employees
where first_name like "b%";
##이름이 i로 끝나는 사원의 사번, 이름
select emp_no, first_name
from employees
where first_name like "%i";

##이름이 u가 포함된 사원의 사번, 이름
select emp_no, first_name
from employees
where first_name like "%u%";

## 이름의 두번쨰 글자가 r인 사원 사번 이름
select emp_no, first_name
from employees
where first_name like "_r%";

##이름의 두번째 글자가 r인 사원의 사번 이름 
##단 이름 글자수가 3개인
select emp_no, first_name
from employees
where first_name like "_r_";

## not like
## 이름이 B로 시작하지 않는 직원 이름과 사번
select emp_no, first_name
from employees
where first_name not like "b%";
## null 연산자 is, is not


#null 연산자 
select *
from titles
where to_date is null;

## null 값 넣기
## emp_no가 10002인 사원의 to_date를 null로 변경
update titles
set to_date =null
where emp_no = 10002;

## null 값 확인
select *
from titles
where to_date is null;