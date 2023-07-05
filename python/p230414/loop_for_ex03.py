"""팩토리얼 함수(factorial function)
def p(m,n):
    r = 1
    for i in range(m, m-n, -1):
        r *= i
    return r
"""
"""
#리스트 내포
#문법
#명령문 for 변수 in 여러값 if 조건값

리스트 내포(comprehension)란 파이썬에서 리스트를 생성하는 간결한 방법 중 하나입니다. 일반적으로 for 루프와 if 조건문을 사용하여 리스트를 생성합니다.

예를 들어, 0부터 9까지의 정수 중에서 짝수만 포함하는 리스트를 생성하는 경우, 일반적인 for 루프 방법은 다음과 같습니다.
리스트 내포는 다음과 같은 형식으로 작성됩니다.

css
Copy code
[표현식 for 항목 in iterable if 조건식]
표현식: 항목을 이용하여 만들어질 값
항목: iterable(반복 가능한 객체)에서 가져올 변수명
iterable: 반복 가능한 객체(리스트, 튜플, 집합, 문자열 등)
조건식: 선택적으로 지정 가능한 조건문
리스트 내포는 이외에도 중첩된 리스트 내포, 딕셔너리 내포 등 다양한 형태로 사용할 수 있습니다.
"""
#리스트 내포
#문법
#명령문 for 변수 in 여러값 if 조건값
## 일반 for문
for r in range(1,11):
    if r % 3 == 0:
        print(r)

#리스트 내포 1)
print("리스트 내포")
[print(r) for r in range(1,11) if r % 3 == 0]

#일반 for문
print("일반 for문")
# ever = [] 과 같다
even = list()
for r in range(1,10):
    if r % 2 ==0:
        even.append(r)

print("even 뭘까용 " ,even)

# 리스트 내포 2)

even_two= [r for r in range(1,10) if r % 2 ==0]
print("even_two", even_two)