/*
## 네번째 시나리오 ###
## 특정 위치(쿼리) 작업 취소: savepoint 

@@ 	savepoint 이름1;
	t1 테이블의 모든 로우를 copy_t1 테이블에 복사 
	insert 
    
@@ 	savepoint 이름2;
	co1인 3인 로우 삭제
	delete
### 작업 취소

######################
*/

## 조회
select * from copy_t1;

savepoint before_insert;

##@@ t1 테이블의 모든 로우를 copy_t1 테이블에 복사 
insert into copy_t1 select * from t1;

savepoint before_delete;

##@@ co1인 3인 로우 삭제
delete from copy_t1 where co1 =3;

rollback to before_delete;
rollback to before_insert;
