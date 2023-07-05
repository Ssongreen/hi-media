/*
사용자 추가 ###############
create user "아이디"@"localhost" identified by "비밀번호"; @@ 내부 접근
create user "아이디"@"%" identified by "비밀번호";			@@ 외부 접근  "%" 대신에 IP 주소로 통해 특별히 접속가능
!! @ 모든 접근 허용
create uesr "아이디"@"%";

사용자 삭제 ################
drop user "아이디"@ "localhost";
drop user "아이디"@ "%"; 

*/

show databases;

# mysql DB 선택
use mysql;

#테이블 목록
show tables;
show tables like "uesr";

## user 테이블 조회
select * from mysql.user;

##user 접근자 확인
select host, user from user;

## 사용자 추가 ##
create user "kim"@"localhost" identified by "1111"; 

## 사용자 삭제 ##
drop user "kim"@"localgost";
