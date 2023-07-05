/*
## 다섯째 시나리오 ###
@@ 1) copy_t1 : 로우 1개 추가 "DML"
@@ 2) new_t1  : 테이블 생성	  "DDL"
@@ 3) copy_t1  : rollback	  "DML"
######################
*/


#조회
select * from copy_t1;

# 1) copy_t1
insert into copy_t1
values (1, "하나", 1.1), (2,"둘",2.2),(3,"셋",3.3);

#2) new_t1 :테이블 생성
create table new_t1
select * from t1;

show tables like "%t1%";
#@@ new_t1 조회
select * from new_t1;

## 3) copy_t1 : 로우 1개 삭제 - co1 컬럼의 값이 2인 로우 삭제
delete from copy_t1
where co1 = 2;

## 조회 
select * from copy_t1;

##4) 도루마르! 
rollback;