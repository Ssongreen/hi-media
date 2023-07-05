#함수 정의
#[함수 정의 형태] 매개 변수 있고, 리턴 있음

"""
파이썬에서 return 키워드는 함수에서 값을 반환할 때 사용됩니다. 함수가 실행 중일 때 return 키워드가 실행되면, 
해당 값이 반환되고 함수의 실행이 종료됩니다. 반환할 값이 없는 경우에는 return을 생략할 수 있습니다.
함수 내에서 정의 되는 변수는 '지역변수'
"""
def add(n1,n2):
    result = n1+n2
    return result
    

#함수 호출
result_value = add(66, 7)
print("결과 알려줘", result_value)

"""
파이썬에서 함수의 실행이 끝나는 시점은 다음과 같습니다.

함수 코드의 마지막 줄에 도달했을 때: 함수 코드의 마지막 줄에서 실행이 종료되면, 함수는 자동으로 return None과 같이 None 값을 반환하고 종료됩니다.

return 키워드를 만났을 때: return 키워드를 만나면 함수는 해당 값을 반환하고 종료됩니다. return 키워드가 실행되면, 해당 값이 반환되고 함수의 실행이 종료됩니다.

예외가 발생했을 때: 함수 실행 중 예외가 발생하면, 예외가 발생한 지점에서 함수의 실행이 중단되고 예외가 발생한 정보를 포함한 예외 객체가 반환됩니다.

아래는 위 세 가지 경우에 대한 예시입니다.

python
Copy code
# 첫 번째 경우: 함수 코드의 마지막 줄에 도달했을 때
def hello():
    print("Hello, world!")

hello()  # Hello, world!
result = hello()
print(result)  # None

# 두 번째 경우: return 키워드를 만났을 때
def add(x, y):
    return x + y

result = add(3, 4)
print(result)  # 7

# 세 번째 경우: 예외가 발생했을 때
def divide(x, y):
    return x / y

result = divide(3, 0)  # ZeroDivisionError 예외 발생
print(result)
위 코드에서 hello 함수는 print 함수를 호출하여 "Hello, world!"를 출력합니다. 함수가 실행되면, 마지막 줄에 도달하면서 자동으로 None 값을 반환하고 종료됩니다. 함수를 두 번 호출할 때, 첫 번째 호출에서는 함수가 실행되어 "Hello, world!"가 출력되고, 두 번째 호출에서는 None 값이 반환되어 출력됩니다.

add 함수는 두 개의 인자를 받아 더한 값을 반환합니다. return 키워드를 사용하여 더한 값을 반환하고 함수의 실행을 종료합니다. 함수를 호출한 결과, 7이 출력됩니다.

divide 함수는 두 개의 인자를 받아 나눈 값을 반환합니다. 하지만, 두 번째 인자가 0이므로 ZeroDivisionError 예외가 발생합니다. 예외가 발생한 지점에서 함수의 실행이 중단되고 예외가 발생한 정보를 포함한 예외 객체가 반환됩니다. 따라서, result 변수에는 예외 객체가 저장되고, 예외가 발생한 이유가 출력됩니다.
"""