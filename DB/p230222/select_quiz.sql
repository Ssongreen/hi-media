#남자 사원의 수
use employees;
select count(gender)
from employees
where gender like binary "M";

#d005부서의 현재 근무하고 있는 사원 수
select dept_no "부서", count(emp_no) "근무자 수"
from dept_emp
group by dept_no
having dept_no in ("d005");

#부서별 현재 재직자 수
select title "부서" , count(emp_no) "재직자 수"
from titles
where to_date > 9999-01-01
group by title;

#각 부서의 과거 매니저 수
select dept_no as "부서", count(emp_no) as "매니저"
from dept_manager 
where to_date like date_sub(now(), interval 1 day) < now()
group by dept_no;

#직책에 공백이 있는 데이터의 길이를 구하시오. 단, 중복을 제거하여 하나의 데이터만 조회
select title ,length(title)
from titles
where title is not null;

#부서명, 부서번호, 부서 총 직원수 조회 (현재와 기존 직원 포함한 수)
desc dept_emp;
select dept_no, count(emp_no) from dept_emp group by dept_no;

#현재 연봉 전체 평균 보다 많이 받는 직원들의 사원 번호, 현재 연봉 조회
select emp_no, salary(select avg(to_date > 9999-01-01) 
from salaries
where avg(salary) > like (select to_date > 9999-01-01);

#1960년 이후 태어난 사원들의 사원 번호, 부서 번호 조회 
select e.emp_no, d.dept_no
from employees as e, departmenrs as d
where e.birth_date <= "1960-01-01";