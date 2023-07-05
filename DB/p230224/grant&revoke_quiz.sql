## 1. 내부 접근이 허용된 사용자 park 생성
create user "park"@"localhost" identified by "1234";
## 권한 확인
select host, user from user;

## 2. cmd에서 park으로 접속 -- > DB 확인

## 3. 사용자 park에게 test DB의 모든 테이블을 조회 할 수 있는 권한 부여
grant select on test.* to "park"@"localhost";

## 권한 확인
show grants for "park"@"localhost";

## 4. cmd에서 확인 : DB 목록 확인 : 테이블 목록 확인 : copy_departments 조회 
 select database(); use tables; show tables; 

## 5. cmd에서 : copy_departments row 추가
insert into copy_departments values('d013', "green");
## 6. 사용자 park에게 test DB의 copy_departments 테이블 추가 권한 부여
grant insert on  test.copy_departments to "park"@"localhost"; 
## 7. cmd 확인 copy_departments 로우 1개 추가
insert into copy_departments values('d013', "green");
## 8. 사용자 park에게 부여한 모든 권한 회수

revoke insert on test.copy_departments from "park"@"localhost";
revoke select on test.copy_departments from "park"@"localhost";
revoke all privileges on *.* from "park"@"localhost";
## 권한 확인
show grants for "park"@"localhost";
## 9. 사용자 park 삭제
drop user "park"@"localhost";
   