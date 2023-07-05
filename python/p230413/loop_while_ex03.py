"""
continue문이 실행되면 해당 반복에서 남은 부분을 건너뛰고 다음 반복으로 이동합니다.
- if문과 같이 사용
-continue가 실행되면, 반복문 계속 되용

"""

num = 0

while num < 101:
    num += 1
    if num % 3 ==0: 
        continue        #if 조건문을 제외 하고 contitnue를 사용되어 while로 조건으로 가유
    print("((•'ٮ'•)৴)",num)

print("stop")