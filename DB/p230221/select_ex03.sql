/*
SQL
-정의어(DCL) create 생성, later 변경, 
-조작어(DML) select 조회, insert 추가, update 수정, delete 삭제
-제어어(DDL) grant부여 revoke회수 commit완료 rollback취소

[정렬] order by

-문법 order by 컬럼명 asc, 컬럼명 desc;

select
select 컬럼명
from 테이블 명
where 조건 
order by 컬럼명 asc, 컬럼명 desc; 
*/
##[정열]
## 직책을 오름차순 연봉 시작일을 내림차순 

select emp_no, salary, from_date
from salaries
order by salary, from_date desc;


## 문제 
## 직책을 오름 차순 업무 시작일을 내림차순항
## 사원 번호 직책 업무 시작일 조회

select emp_no, title, from_date
from titles
order by title asc, from_date desc;  

