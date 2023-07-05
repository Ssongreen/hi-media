/*

commit & rollback ##########
commit 		: 작업 완료
rollback	: 작업 취소
commit 과 rollback은 논리적인 작업의 단위 (transation 트랜잭션) 관련
###############################
*/


# frist sinario####
#1) t1 테이블을 복사한 copy_t1 테이블 생성
create table copy_t1 
as
select * from t1;

#2) 로우 삭제 :co3가 null인 로우
delete from copy_t1
where co3 is null;

## 조회
select *from copy_t1;

#3) 작업 취소
rollback;
## 작업취소 drop it ??? : my SQL 은  make up commit yourself,  that C auto commit.
# edit - preference - SQL execution - check box take off mode
#4) 확인 작업 