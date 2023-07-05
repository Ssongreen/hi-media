## [그룹 함수] 집계 함수 ##############
## count (컬럼명) : 로우 개수 null - 포함
## count (*) 	  : 로우 개수 null - 포함 x
## sum (컬럼명) : 합
## avg (컬럼명) : 평균
## max (컬럼명) : 최댓값
## min (컬럼명) : 최솟값

#[문법] 
#select 컬럼명, 컬럼명
#from 테이블명
#where 	조건 : 가공이 되기 전 row 함수를 사용 하는 절
#groub by 컬럼명
#having 조건 : group by 이후 가공된 데이터를 사용 하는 절
#order by 컬럼명 asc, 컬럼명 desc
##########################################

## 회사 총 사원수
select * from employees;

select count(emp_no) as "null 포함해" , count(*) as "null 제외 하고 사용해" 
from employees;

select count(emp_no), count(to_date), count(*) 
from titles;

## 직원들 연봉 전체 합, 최고 연봉 , 최저 연봉
select sum(salary), max(salary), min(salary)
from salaries;

## 사원의 성별 수
select gender, count(gender) ##  select절에 컬럼명에 다음에 집계(그룹)함수 온다면 group by 를 사용되는 컬럼명을 사용.
from employees
group by gender;# 

##직책별 직원수
select title, count(emp_no)
from titles
group by title
having count(emp_no) > 50000; 

# 문제 d001, d002, d009 각 인원수
# ex1) 전체 값을 설정 후 찾는 값 
select dept_no, count(emp_no)
from dept_emp
group by dept_no
having dept_no in ("d001","d002","d009");

#ex2) 미리 구성하고 설정값
select dept_no, count(emp_no)
from dept_emp
where dept_no in("d001", "d002", "d009")
group by dept_no;

