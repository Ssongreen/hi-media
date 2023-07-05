/*
권한 부여 grant ################
문법 
! 모든 권한 준다
grant all privileges on DB명. 테이블명 to "아이디"@"localhost";

@ 아이디를 가진 사용자에게 DB의 테이블에 특정 권한 부여
grant  권한	 on DB명.테이블명 to "아이디"@"localhost"; 

@ ef) kim 사용자에게 employees DB의 salaries 테이블을 조회와 수정 권한 부여
grant select on employees.salaries to "kim"@"localhost"; 

권한 회수 revoke #############################
문법
! 모든 권한 회수
revoke all privileges on DB명. 테이블명 from "아이디"@"localhost";

@ 아이디를 가진 사용자에게 DB의 테이블에 특정 권한 부여
revoke  권한 on DB명.테이블명 from "아이디"@"localhost"; 

@ ef) kim 사용자에게 employees DB의 salaries 테이블을 조회와 수정 권한 부여
revoke select on employees.salaries from "kim"@"localhost"; 
*/


#kim의 권한 확인 
show grants;
show grants for kim@localhost;

## 현재 확인 법
select database();
show tables;

# test DB 선택
use test;

## test DB의 table 목록
show tables;

## 사용자 kim에게 test DB의 copy_departments 테이블 조회 권한 부여
grant select on test.copy_departments to "kim"@"localhost";

#kim의 권한 확인 
show grants for kim@localhost;

#사용자 kim에게 test DB의 copy_departments 테이블 수정 권한 부여
grant update on test.copy_departments to "kim"@"localhost";

#kim의 권한 확인 
show grants for kim@localhost;

## kim 권한 회수 ##################
## 사용자 kim에게 test DB의 copy_departments 테이블 수정 권한 회수
revoke update on test.copy_departments from "kim"@"localhost";

## 사용자 kim에게 test DB의 copy_departments 테이블 조회 권한 회수
revoke select on test.copy_departments from "kim"@"localhost";
