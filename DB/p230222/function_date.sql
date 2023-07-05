## 날짜 함수##

##현재 날짜 시간##
select now();
select sysdate();

## 현재 날짜
select curdate(); select current_date();

##현재 시간
select curtime(); select current_time();

## 특정 날짜를 기준으로 더하거나 빼기한 값
## date_"add"(날짜, interval 값 기준) - 날짜에서 interval 만큼 더한 날짜 반환
## date_"sub"(날짜, interval 값 기준) - 날짜에서 interval 만큼 빼기한 날짜 반환
## interval : year, month, day, hour, minute, second

## 오늘 기준으로 100일 뒤 날짜
select now(), date_add(now(), interval 100 day);
select now(), date_add(now(), interval 1 day);

## 오늘 기준으로 14개월 뒤 날짜
select now(), date_add(now(), interval 14 month);
select now(), date_add(now(), interval 1 month);

##현재 시간을 기준으로 10시간 뒤 
select now(), date_add(now(), interval 10 hour);

## 오늘 기준으로 100일 전 날짜
select now(), date_sub(now(), interval 100 day) as "100일 전";

##문제 사원들의 발령 7일전 날짜 조회
select hire_date, now(), date_sub(hire_date, interval 7 day) from employees;

## 년 , 월 , 일 ,시 ,분 ,초 만 조회
select now(), year(now()),month(now()),day(now()),
hour(now()), minute(now()),second(now());

## 월을 영어로 리턴 : monthname(날짜)
select now(), monthname(now());
select "2023-03-01", monthname("2023-03-01");

## 요일을 숫자로 리턴 dayofweek(날짜)
# 일요일 기준으로 주일(1)
select now(), dayofweek(now());
select "23-02-23", dayofweek("2023-02-23");

## 요일을 숫자로 리턴 2): weekday(날짜)
#월요일 기준으로 0으로 시작해서 증가하는 요일 월(0)
select now(), weekday(now());
select "23-02-23", weekday("23-02-23");

select current_date(), curdate() +1, weekday(curdate()+1);

## 일년을 기준으로 일 수: dayofyear(날짜) 개월 수 말로 day로 계산
select now(), dayofyear(now());

## 일년을 기준으로 몇 번째 주 : week(날짜) 주로 계산
select now(), week(now());

## 형식 지정
select now(), date_format(now(), "%Y년 %m월 %d일");