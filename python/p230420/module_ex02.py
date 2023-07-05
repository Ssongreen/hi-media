import datetime

#날짜와 시간
now = datetime.datetime.now()
print("◝(・▿・)◜ now", now)

#날짜만
#date는 리턴 타입이 있다. 
date = datetime.datetime.now().date()
print("◝(・▿・)◜ date",date)

#년
year = datetime.datetime.now().year
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


#날짜 2
today = datetime.date.today()
print("(੭˙ ˘ ˙)੭ today",today)
print("(੭˙ ˘ ˙)੭ 년",today.year)
print("(੭˙ ˘ ˙)੭ 월",today.month)
print("(੭˙ ˘ ˙)੭ 일",today.day)


