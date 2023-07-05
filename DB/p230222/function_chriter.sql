## 문자 함수 ######
## 대문자 변경 : ucase(문자)
## 소문자 변경 : lcase(문자)
select ucase("aSeVer"), lcase("aSeVer");

## 역순
select reverse("aSeVer");

##문자 길이
select length("Ashver greens");
#ef)부서명 길이 lenhth(컬럼명)
select length(dept_name)
from departments;