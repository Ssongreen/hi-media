#리스트 내포
#문법
#명령문 for 변수 in 여러값
"""
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
# 일반 for문
print("\n일반 for문")
for r in range(1,10):
    print(r, end=" ")

#리스트 내포 @@ 보여지기만 하기 위해서 입니다 오류에용 좋은 코드가 아니다.
print("\n리스트 내포")
[print(r, end=" ")for r in range(1,10)] 

##리스트 내포 1) 
"""
해당 코드는 파이썬의 리스트 컴프리헨션(List Comprehension)을 사용하여 2부터 10까지의 짝수를 리스트로 만드는 코드입니다.

range(2, 11, 2)는 2부터 10까지의 숫자를 2씩 증가시키며 반환하는 제너레이터(generator)입니다.

for문을 사용하여 range(2, 11, 2)에서 반환한 숫자를 변수 r에 하나씩 할당하면서 반복합니다.

[r for r in range(2,11,2)]는 각 r 값을 리스트에 추가하고, 추가된 리스트를 even이라는 변수에 할당합니다.

따라서, even 리스트는 [2, 4, 6, 8, 10]과 같이 2부터 10까지의 짝수를 포함합니다.

이렇게 리스트 컴프리헨션을 사용하면 반복문을 사용하는 것보다 더 간단하게 리스트를 생성할 수 있습니다.
"""
print("\n 리스트 내포2")
even = [r for r in range(2,11,2)]
print("even",even)
print("even type",type(even))

#일반 for문
#리스트에 짝수를 추가해용, 일반 for문은 
print("일반 for문")
even = []
for r in range(2, 11, 2):
    even.append(r)
print("even", even)
print("even type", type(even))
