/*
DDL rename
rename table 기존 이름 to 새이름;
*/

# 테이블 목록
show tables;

#테이블명 변경 : copy_employees -> employees
rename table copy_employees to employees;