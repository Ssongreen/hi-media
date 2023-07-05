# 한 줄 주석
#주석
###주석

-- 한 줄 주석 : ctrl + /
-- 주석

/*
	시작
	여러 줄 주석
	끝
*/

# 화면 확대/축소 : ctrl + 휠

## 질의문(Query statement) 입력 후 ctrl + enter 실행

## DB 목록
show databases;

## DB 선택(접속)
use world; 

## 테이블 목록
show tables;

## city 테이블 구조 간단하게 확인
desc city;

## [null] =======================
## : 알 수 없는 값, 알려지지 않은 값
## : 0 아님, 공백 아님
##===============================

## city 테이블 데이터 조회
select * from city;

## DB목록 확인
show databases;

## employees DB 설치(추가) : cmd에서 작업
-- mysql -u root -p < employees.sql

## employees DB 선택(접속)
use employees;

## employees DB의 테이블 목록 확인
show tables;

use world;
