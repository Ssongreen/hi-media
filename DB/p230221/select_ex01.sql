/* 
limit : offset(위치지점), 몇번 째까지; 
-offset은 0부터 시작
*/
#위에 몇개만 보고 싶어용 limit (num);
select *
from employees
limit 3;

select * from employees
limit 6, 19;

## 산술 연산자 : +, -, *, / ######################
## 1)단순 계산
select 10 + 10;
select 1325 + 512, 3262/ 2351, 6232 * 325236, 568614 - 3467;
select emp_no, salary, salary + 1000 as '10증가 값'
from salaries; 

#문제 사번, 현재 연봉, 10% 인상값
select emp_no, salary, salary * 1.1 as "10% 증가 값" 
from salaries
where to_date >= "9999-01-01"
limit 0, 20;

## distinct : 중복 제거 ###########
## row 단위로 진행된다. 
select distinct dept_no, emp_no
from dept_manager;