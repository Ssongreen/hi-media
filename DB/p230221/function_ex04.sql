/*
[함수] 숫자

*/

##[함수] 숫자 #######################
## 절대값
select abs(100),abs(-100);

## 소수점 이하 올림
select ceil(10.412412), ceil(10.5), ceil(10.6);

##소수점 이하 내림
select floor(10.4), floor(10.6), floor(10.5)

## 반올림
select round(19.64), round(10.5), round(10.6);

select round(634.45, 0), round(35732.1124, 1), round(31513.43634, -1);

## 버림
select truncate(1235.62346, 0), truncate(32135.66,1), truncate (166,555, -1);

## x의 y승
select power(5,3);

#나머지 
select mod(65, 6);

# 큰값
select greatest(3,6,8,11);

#작은 값 
select least(46,6,7,3,2);

#[함수] 문자
#이어 주기
select concat("one", "two", "three");

select concat(first_name, "님") as "이름", ("성별", gender)
from employees;

##사원의 사번, 이름 조회
## 단 이름은 first_name, last_name 한 컬럼으로 표시 -> 컬럼명 : 이름
use employees;
select emp_no "사번", concat(first_name,' ', last_name) as "이름"
from employees;

## 특정 위치에 추가 "1" : insert : 첫번째 인수인 문자에서 2번째 자리에서 1개를 wow로 변경
select insert("문자", 시작위치, 몇개, "추가문자");
select insert("abcdefa", 2 ,1, "wow");

##특정 위치에 추가 "2"
select insert("abcdefg", 2, 0, "wow");

##문제 bcd를 삭제 하시오
select insert("abcdefg" , 2, 3, "");

## 교체 
## 문법 replace(문자, 기존문자, 새문자)
select replace("abcdefg", "bc", "one");
select replace("abcdefgbcbcbcbcbc", "bc", "one");

## 문제 bcd 제거
select replace("abcdefg", "bcd", "");

##위치 : 왼쪽 기준으로 위치는 1부터 시작, 없으면 0 반환
##문법 instr(문자, 찾고자하는 문자); 
select instr("abcdefg", "b"); 		##2반환
select instr("abcdefgb", "b"); 		##2반환
select instr("abcdefg", "k"); 		##0반환 없음
select instr("abcdefg", "cde"); 		##0반환 없음

##문자 반환
## left (문자, 개수)
## right(문자, 개수)
## mid	(문자, 시작 위치 , 개수)
select left("abcdefg", 3);

## substring(문자, 시작 위치, 개수)
select substring("abcdefg",3,2);

## mid를 이용 하여 c부터 끝까지
select mid("abcdefg", 3);

##? 부서명에서 s로 시작하는 단어 추출
select * from departments;

## 1) s의 위치
select dept_name, instr(binary dept_name, "S") from departments;

## 2) "S"로 시작하는 단어 추출
## select dept_name, mid(dept_name, 시작 위치, 몇개);
select dept_name, mid(dept_name, instr(binary dept_name, "S")) from departments;

## 3) 정리된 쿼리문
select mid(dept_name, instr(binary dept_name, "S")) as "단어" from departments
where mid(dept_name, instr(binary dept_name, "S")) as "단어" like "S";

## 4) 가공된 데이터를 정리
select mid(dept_name, instr(binary dept_name, "S")) as "단어" 
from departments
where mid(dept_name, instr(binary dept_name, "S")) not like "";

## 공백 제거
##ltrim(문자) : 왼쪽 공백 제거
##rtrim(문자) : 오른쪽 공백 제거
##trim(문자) : 양쪽 공백 제거

select concat("|", ltrim('		abc		'), "|");
select concat("|", rtrim('		abc		'), "|");
select concat("|", trim	('		abc		'), "|");
select concat("|", trim	('		a   bc		'), "|");
select concat("|", trim	('		a   bc		'), "|");

## 과제
select replace('		a   bc		'," ","");
