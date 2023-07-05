## 세번째 시나리오 ###
## 1) copy_t1 테이블의 모든 로우 삭제 delete
## --- commit --- 작업 완료
## 2) t1 테이블의 모든 데이터를 copy_t1 테이블 복사 insert
## 3) copy_t1 테이블에서 co3 컬럼이 null인 로우 삭제 delete
## 4) 작업 취소 rollback

use test;
# 조회 
select * from copy_t1;

## 1) copy_t1 테이블의 모든 로우 삭제 delete
delete from copy_t1;

## commit 작업 완료
commit;

## 2) t1 테이블의 모든 데이터를 copy_t1 테이블 복사 insert
insert into copy_t1 select * from t1;


## 3) copy_t1 테이블에서 co3 컬럼이 null인 로우 삭제 delete
delete from copy_t1 where co3 like 2.2;

## 4) 작업 취소
rollback;

update t1 set co3 = 2.2 where co1 =2;
