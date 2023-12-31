"""
파이썬은 들여쓰기로 영역 확인 ~ (4칸 공백)
java는 {} 괄호로 영역 확인~
조건 1개
if 조건식:
    실행할 코드 블록

#조건 2개
if 조건식1:
    실행할 코드 블록1
else:
    실행할 코드 블록3

#조건 3개
if 조건식1:
    실행할 코드 블록1
elif 조건식2:
    실행할 코드 블록2
else:
    실행할 코드 블록3

"""
num = 1
if num > 0:
    print("양수")
elif num < 0:
    print("음수")
else:
    print("0")

print("*프로그램 종료*"*3)

#pass : 반복, 조건문, class에서 가능하다 문법의 형태를 맞추면서도 실행하지 않아용
"""
pass는 Python에서 아무 것도 하지 않고 넘어갈 때 사용되는 키워드입니다. 주로 if문, while문, 함수 등에서 블록 내에서 아무것도 처리하지 않고 다음으로 넘어갈 때 사용합니다. 예를 들어, 아래와 같은 코드에서 pass는 빈 블록을 만들기 위해 사용됩니다.
"""