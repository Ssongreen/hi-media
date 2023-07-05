/*

DDL truncate
구조만 남기고 모든 로우 삭제 

truncate 테이블명
*/

select * from t1; 

## t1 테이블 을 복사 한 cop_t1 테이블 생성

create table copy_t1
as 
select *from t1;

###truncate 
truncate copy_t1;

