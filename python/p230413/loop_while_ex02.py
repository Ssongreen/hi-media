"""
break는 반복문을 강제로 종료하는 데 사용됩니다. 만약 break 문이 실행되면, 반복문의 나머지 부분은 실행되지 않고, 반복문을 빠져나가게 됩니다.
-반복문 내 사용
- if문과 같이 사용
-break가 실행되면, 반복문 탈출
"""

num = 0

while num < 10:
    num += 1
    if num % 3 ==0:
        break
    print("((•'ٮ'•)৴)",num)

print("반복문 끝 ((•'ٮ'•)৴)",num)
print("stop")
