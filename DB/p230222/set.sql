##[수직 조인]#########
## 합집합 : union - 중복 제거,
##		  : union all - 중복 모두 표시

## 교집합, 차집합은 별도의 연산자가 제공되지 않아용
## 교집합 : join	  ->> 조인 조건
## 차집합 : sub query ->> not in

######## 예제 ############
select dept_no, emp_no
from dept_manager; 			#24rows

select dept_no, dept_name
from departments;			#9rows

## union 중복 ㄴㄴㄴ 중복은 하나로 합쳐짐
select dept_no
from dept_manager
union 
select dept_no
from departments;
###전부 일치해야 중복을 제거함 
select dept_no, emp_no
from dept_manager
union
select dept_no, dept_name
from departments;


##union all 중복 ㅇㅇ
select dept_no
from dept_manager
union all
select dept_no
from departments;