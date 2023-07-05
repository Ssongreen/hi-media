"""
모듈 읽기
@@방법@@ 

1) import 모듈명
-파이썬 설치 할 때 기본적으로 설치되는 모듈이에요 

2) from 모듈명 import 클래스, 함수, 변수
- from 다음 모듈명은 사용할때는 사용하지 않아용

3)import 모듈명 as 별명

"""
from datetime import datetime 
from datetime import datetime as dt

now = datetime.now()
print("◝(・▿・)◜ now", now)
print("◝(・▿・)◜ date",now.date)
print("◝(・▿・)◜ year",now.year)
print("◝(・▿・)◜ month",now.month)
print("◝(・▿・)◜ days",now.day)
print("◝(・▿・)◜ time",now.time)
time = now.time()
hour = time.hour
print("◝(・▿・)◜ hour",hour)
#분
minute = time.minute
print("◝(・▿・)◜ minute",minute)
#초
second = time.second
print("◝(・▿・)◜ second",second)

today = datetime.today()

print("(੭˙ ˘ ˙)੭ today",today)
print("(੭˙ ˘ ˙)੭ 년",today.year)
print("(੭˙ ˘ ˙)੭ 월",today.month)
print("(੭˙ ˘ ˙)੭ 일",today.day)

print("@"*50)

# 관용 적인 알리 아스는 (Alias) 는 
# 코드표를 알수 없기에 사용을 고려해야 한다.

now = dt.now()
print("◝(・▿・)◜ now", now)

date = datetime.now().date()
print("◝(・▿・)◜ date",date)

#년
year = datetime.now().year
print("◝(・▿・)◜ year",year)

#월
month = now.month
print("◝(・▿・)◜ month",month)

#일
days = now.day
print("◝(・▿・)◜ days",days)

#시간
time = now.time()
print("◝(・▿・)◜ time",time)

#시
hour = time.hour
print("◝(・▿・)◜ hour",hour)
#분
minute = time.minute
print("◝(・▿・)◜ minute",minute)
#초
second = time.second
print("◝(・▿・)◜ second",second)

today = dt.today()

print("(੭˙ ˘ ˙)੭ today",today)
print("(੭˙ ˘ ˙)੭ 년",today.year)
print("(੭˙ ˘ ˙)੭ 월",today.month)
print("(੭˙ ˘ ˙)੭ 일",today.day)