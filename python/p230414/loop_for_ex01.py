"""
반복문 : for 
for 변수 in 여러값
파이썬에서 for문은 반복문(loop)을 구현할 때 사용됩니다. for문은 주로 리스트, 튜플, 문자열 등의 시퀀스 자료형을 순회하면서 반복작업을 수행할 때 사용됩니다.

for문의 구조는 다음과 같습니다.

python
Copy code
for 변수 in 시퀀스:
    # 반복 작업 수행
위 구조에서 변수는 반복문을 수행하면서 시퀀스 자료형의 각 요소를 차례로 대입받는 변수를 의미합니다. 시퀀스는 반복문을 수행할 대상 자료형으로, 리스트, 튜플, 문자열 등이 사용될 수 있습니다.

아래는 for문의 예시입니다.
python
Copy code
numbers = [1, 2, 3, 4, 5]

# 리스트 numbers의 요소를 순회하면서 각 요소를 출력하는 예시
for num in numbers:
    print(num)

# 문자열의 각 문자를 출력하는 예시
for char in "Hello":
    print(char)
위 예시에서는 리스트 numbers의 각 요소와 문자열 "Hello"의 각 문자를 출력하는 for문을 사용하고 있습니다.
"""

even = [2,4,6]

for en in even:
    print(en)

## range(시작값, 끝값)
print(" range 함수 1")
for r in range(1,10):
    print(r , end=" ")
## range(끝값)
print("\n range함수 2")
for r in range(10):
    print(r , end=" ")
#인수 3개 range(시작, 끝값, 증감값)
#         range(start, end, step)
print("\n range함수 3")
for r in range(1, 10):
    print(r,end="")

#[]다음과 같이 출력 
# 내림차순
print("\n range 내림차순")
for r in range (10,0,-1):
    print(r,end=" ")

print("\n range 짝수")
for r in range (2,12,+2):
    print(r,end=" ")

