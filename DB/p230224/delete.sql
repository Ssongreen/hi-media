/*
#DML delete
-로우 삭제, 변경

delete from 테이블명
where 조건
*/

show tables;

select * from copy_temp1;

## copy_temp1 one 컬럼의 값이 100인 로우 삭제 
delete from copy_temp1
where one = 100;

## 문제 ## one 컬럼 값이 2,200
delete from copy_temp1

where one in (2 ,200);

## delete 에 where 절이 없다면 "다 제거"
delete from copy_temp1;