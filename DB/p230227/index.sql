/*
select 검색 속도를 크게 향상 시킨다.
인덱스 생성 시 DB 크기의 약 10% 정도되는 추가 공간이 필요하다.
인덱스 생성 시 시간이 걸린다. (몇분 씩 걸리기도 한다)
insert, update, delete같은 데이터 변경 쿼리가 잦은 경우 paging이 빈번해져 성능이 악화될 수 있다.
데이터 조회에는 플러스지만, 데이터 변경이 자주 일어나면 오히려 성능 감소된다.
*/
/*
보조 인덱스 (Secondary Index)
이 인덱스는 논 클러스터 인덱스 (non-clustered index) 라고도 불린다. 
개념적으로는 후보키에만 부여 할 수 있는 인덱스다.
(후보키 : 고유 식별 번호, 주민번호 같이 각 데이터를 인식할 수 있는 최소한의 고유 식별 속성 집합)
보조 인덱스의 생성시에는 데이터 페이지는 그냥 둔 상태에서 별도의 페이지에 인덱스를 구성한다.
별도의 페이지에서 인덱스를 구성하니, 클러스터와는 달리 자동 정렬을 하지 않는다.
클러스터 인덱스의 리프 페이지는 보조 인덱스의 인덱스 자체의 리프 페이지는 데이터가 아니라 데이터가 위치하는 주소값 (RID)
클러스터형 보다 검색 속도는 더 느리지만 데이터의 입력/수정/삭제는 덜 느리다.
보조 인덱스는 여러 개 생성할 수 있다. 그러나 함부로 사용할 경우에는 오히려 성능을 떨어뜨릴 수 있다.
각 데이터에 대해서 고유 값 (unique) 들이 있는 목록에 생성 할 수 있는 인덱스다. (unique key)
 */
 
 /*
 효율적인 인덱스 설계
 WHERE 절에 사용되는 열 (WHERE 절에 사용되는 열이라도 자주 사용해야 가치가 있음)
SELECT 절에 자주 등장하는 컬럼들을 잘 조합해서 INDEX로 만들어두면 INDEX 조회 후 다시 데이터에서 조회할 필요가 없으므로 빠르게 검색이 가능하다.
JOIN절에 자주 사용되는 열에는 인덱스의 효율이 좋음.
ORDER BY 절에 사용되는 열은 데이터 페이지가 자동 정렬됐기 때문에 클러스터형 인덱스가 유리
 */
 /*
 금지해야 할 인덱스 설계
대용량 데이터가 자주 입력되는 경우,
클러스터형 인덱스의 경우 빈번한 페이징이 일어나기 때문에 부하가 생긴다.
따라서 인덱스가 필요한 경우 primary(클러스터) 대신 unique만 설정하는 게 좋을 수 있다.
데이터 중복도가 높은 열은 익덱스 효과가 없다.
예를 들어 성별 열에 M, F만 있다고 하면 인덱스를 안쓰는 게 낫다.
따라서 일반 보조 인덱스보다 unique 보조 인덱스가 빠른 이유가 이것이다.
자주 사용되지 않으면 성능 저하를 초래할 수 있음. (INSERT만 주구장창 하는 시스템이라면, 사용해보지도 못하고 데이터 입력에 걸리는 작업량만 많아진다)
 */
 /*
 인덱스를 사용할 때 주의할 점
데이터 변경(삽입, 수정, 삭제) 작업이 얼마나 자주 일어나는지 고려해야 함.
단일 테이블에 인덱스가 많으면 속도가 느려질 수있다. (테이블당 4~5개 권장)
검색할 데이터가 전체 데이터의 20% 이상이라면, MySQL에서 인덱스를 사용하지 않음. (강제로 사용할 시 성능 저하를 초래할 수 있음)
전체 페이지의 대부분을 읽어야 하고, 인덱스 관련 페이지도 읽어야 해서 작업량이 크기 때문이다.
사용하지 않는 인덱스는 제거하는 것이 바람직함. (실무에서 사용하지 않는 보조 인덱스를 몇개 삭제했을 때 성능이 향상되는 경우도 많음)
클러스터형 인덱스는 테이블당 하나만 생성할 수 있음
테이블에 클러스터형 인덱스가 아예 없는 것이 좋은 경우도 있음
 */
 
 /*
 INDEX를 만들어 둔다고 모든 쿼리에서 INDEX를 활용하는 것은 아니다.
인덱스 입힌 컬럼을 가공
WHERE SUBSTR(컬럼명, 1,4) = ‘2019’
해결 → WHERE 컬럼명 LIKE ‘2019%’
인덱스가 있는 열 이름에는 함수나 연산을 가함
WHERE count*10=100
해결 →  WHERE count=100/10
인덱스 컬럼의 묵시적 형변환(같은 타입으로 비교해야함)
WHERE 컬럼명 = ‘20190730’
해결 → WHERE 컬럼명 = TO_DATE(‘20190730’, ‘YYYYMMDD’)
인덱스 컬럼 부정형 비교.
WHERE 컬럼명 != ‘10’
해결 → WHERE 컬럼명 IN(‘20’, ‘30’)
LIKE %가 앞에 위치.
WHERE 컬럼명 LIKE ‘%2019’
해결 → or 조건 사용 WHERE 컬럼명 IN(‘102019’,‘202019’,‘302019’)
 */
/*
ORDER BY 와 GROUP BY에 대한 인덱스
INDEX는 ORDER BY와 GROUP BY에도 영향을 끼치는데 다음과 같은 경우에는 INDEX를 타지 않는다.
ORDER BY 인덱스컬럼1, 컬럼2 : 복수의 키에 대해서 ORDER BY를 사용한 경우
WHERE 컬럼1='값' ORDER BY 인덱스 컬럼 : 연속하지 않은 컬럼에 대해 ORDER BY를 실행한 경우
ORDER BY 인덱스컬럼1 DESC, 인덱스컬럼2 ASC : DESC와 ASC를 혼합해서 사용한 경우
GROUP BY 컬럼1 ORDER BY 컬럼2 : GROUP BY와 ORDER BY의 컬럼이 다른 경우
ORDER BY ABS(컬럼) : ORDER BY 절에 다른 표현을 사용한 경우
 */
## 테이블 인덱스 확인
show index from customer;

use employees;

show index from employees;

# 전체 DB의 모든 key 정보 조회 2-1 
select * from information_schema.table_constraints;

# 전체 DB의 모든 key 정보 조회 2-2
select * from information_schema.table_constraints
where table_schema like "employees"
	and table_name like "employees";

#전체 로우 조회

select * from employees;

##특정 로우 조회: id가 10002 인 row 조회
# single row
select * from employees
where emp_no = 10002;

##특정 로우 조회: index first_name이 Parto인 로우 조회
# full table scan : cost 102.86
select * from employees
where first_name like "Parto";

##################################################################################
## 인덱스 생성
# alter table 테이블명 add index 인덱스명(컬럼1, 컬럼2);
# create unique index 인덱스명 on 테이블명 컬럼명1, 컬럼명2 [asc|desc];
#
##인덱스 해제
# alter table 테이블명 add index 인덱스명;
# drop index  인덱스명 on 테이블명;
#####################################################################################

#인덱스 확인
show index from employees;
show indexes in employees;

select *from information_schema.table_constraints
where table_schema like "employees"
	and table_name like "employees";
    
    
## 인덱스 삭제####
# alter table 테이블명 add index 인덱스명;
 alter table employees drop index idx_emp_first_name; 
 
 ##특정 로우 조회: 일반 컬럼 first_name이 Parto인 로우 조회
# full table scan : cost 30165
select * from employees
where first_name like "Parto";

