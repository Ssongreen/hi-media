## 수평 조인 : from 절에 테이블명을 , 로 구분하여 여러개
########################################################

select * from dept_manager; ## 24 row 
select * from departments;  ## 9  row


## 다대다 join : 하나의 그룹에 연결 시킨 것 데이터만 뻥튀기 된 것
select emp_no, dept_manager.dept_no, departments.dept_no, dept_name
from dept_manager, departments;

## 부서번호가 같은 로우 수평 조인
# 조인1)
select emp_no, dept_manager.dept_no, departments.dept_no, dept_name
from dept_manager, departments
where dept_manager.dept_no = departments.dept_no;
# 조인2) 정리된 코드
select emp_no, dm.dept_no, dept_name
from dept_manager as dm, departments dt
where dm.dept_no = dt.dept_no; ##조인 조건 "징검다리"

##문제 현재 재직 중인 사원 번호 이름(first) 연봉 조회
select em.emp_no, sa.emp_no, em.first_name, sa.salary
from employees as em, salaries as sa
where to_date in("9999-01-01") 
	and em.emp_no = sa.emp_no;
    
## 현재 재직 중 사원의 현 직책 조회(사번, 직책)
select ti.emp_no, ti.title
from titles as ti
where to_date = "9999-01-01"; #240123

select e.emp_no, first_name, title
from employees e, titles as t
where e.emp_no = t.emp_no
 and to_date = "9999-01-01";