"""
반복문 : while 
break - if 같이 씀
continue
while 조건:
----코드 블록


조건은 반복이 진행될지 여부를 결정하는 불리언 표현식입니다. 
조건이 True이면 코드 블록이 실행됩니다. 
코드 블록은 조건이 False가 될 때까지 반복해서 실행됩니다.

"""
num = 1 ##초기값

while num < 12: ##조건식
    print("((•'ٮ'•)৴)",num)
    num+=1      ## 증감식
    continue
print("stop")