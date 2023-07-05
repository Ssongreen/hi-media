## view######################################
#	가상 테이블, 논리 테이블
# 	기반 테이블 (base table)을 삭제 하면, view 삭제됨
## 장점
# 	보안 효과
#	특정 데이터만 조회
#	쿼리 재사용
## 단점
#	view 변경 불가능
#	추가, 삭제, 수정 제한 있을 수 있음
#	인덱스를 가질 수 없당
## 문법
# 	create view 뷰이름
#	as
#	select문;
/*
뷰를 update 가능은 합니다.
뷰를 insert하는 것은 조건이 있습니다.
테이블의 모든 필드의 값을 넣어줘야하는데 일부만 넣어주게 되면 불가능. 그래서 넣으려면 전체를 다 넣거나 디폴트를 지정해줍니다.
집계함수가 들어가느 뷰는 수정 불가능
with check option을 주면 체크조건이 들어가게 됩니다.
*/
##############################################

select * from employees;

create view emp
as
select emp_no, first_name, gender
from employees;
show tables like "%emp";

# view emp 조회 전체 로우
select * from emp;

# view emp 조회 : 남자 직원

select * from emp where gender like "m";

# view emp 수정 : emp_no 가 10003인 직원의 이름을 길동잉 수정
update emp set first_name = "길동잉" where emp_no = 10003;

select * from emp;

# view emp 추가 : emp_no - 100, first_name - 보검, gender - M
insert into emp values(100, "보검", 'M');

# view emp 인덱스 생성 : first_name 컬럼에 idx_emp_first_name 인덱스 생성
alter table emp add index first_name(idx_emp_first_name);
create index emp on first_name(idx_emp_first_name);

# view emp로 view v_emp를 생성
select * from emp;

create view v_emp
as 
select emp_no, first_name
from emp;

show tables like "%emp";

#view v_emp 삭제
drop view v_emp;

# table 목록 확인
show tables like "%emp";

#view 확인
show full tables where table_type like "VIEW";

select table_shema, table_name, table_type
from information_schema.tables
where table_schema like "employees"
		and table_type like "VIEW";

select * from emp; 

alter view emp
as
select emp_no, first_name, gender 
from emp
where emp_no < 10100;

 ## 문제 사번 사원번호, 현재 매니저의 사번 vi
select de.emp_no as "사번" , de.dept_no as "부서번호", dm.emp_no as "매니저 사번"
from dept_manager de, dept_emp dm
where de.dept_no = dm.dept_no
		and dm.to_date = "9999-01-01"; 

select * from dept_manager;

create view v_dept_emp_manager
as
select de.emp_no as "사번", de.dept_no as "부서번호", dm.emp_no as "매니저 사번"
from dept_manager de, dept_emp dm
where de.dept_no = dm.dept_no
		and dm.to_date = "9999-01-01"; 
## view 확인
show tables like "%emp%";
show full tables where table_type like "VIEW";

# view 생성 쿼리문 확인
show create view v_dept_emp_manager;


# AS select `de`.`emp_no` AS `사번`,`de`.`dept_no` AS `부서번호`,`dm`.`emp_no` AS `매니저 사번` 
# from (`dept_manager` `de` join `dept_emp` `dm`) 
# where ((`de`.`dept_no` = `dm`.`dept_no`) and (`dm`.`to_date` = ''9999-01-01''))'
