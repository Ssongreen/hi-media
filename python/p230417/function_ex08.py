"""
매개 변수 기본값(default value)을 설정하는 것은 함수를 정의할 때 인자(parameter)에 값을 할당하는 것입니다. 이를 통해, 함수를 호출할 때 인자를 생략해도 기본값이 할당되어 함수가 실행되도록 할 수 있습니다.

매개 변수 기본값 설정은 다음과 같이 함수를 정의할 때 수행할 수 있습니다.

def function_name(param1=default_value1, param2=default_value2, ...):
    # 함수 본문
위와 같은 형식으로 함수를 정의할 때, param1과 param2는 함수를 호출할 때 전달할 수 있는 매개 변수입니다. default_value1과 default_value2는 각 매개 변수의 기본값을 설정하는 것으로, 함수를 호출할 때 인자를 전달하지 않아도 미리 설정된 기본값이 할당됩니다.

예를 들어, 다음과 같이 함수를 정의하면 매개 변수 param1의 기본값으로 0이 할당됩니다.

python
Copy code
def example_func(param1=0):
    print(param1)
이후 example_func()와 같이 함수를 호출하면 매개 변수 param1에는 기본값으로 설정된 0이 할당되어 함수가 실행되며, 0이 출력됩니다. 만약 example_func(10)과 같이 인자를 전달하면, param1에는 전달된 값 10이 할당되고, 10이 출력됩니다.

기본값 설정 주의 사항
"""
## 기본값 설정
# 함수의 정의
#기본값 설정할 때에 오른쪽을 채워서 나가면 됩니다.

def default(a,b,c=-1):
    print(f"a:{a}, b:{b},c:{c}")

default(2,5,7)
default(2,5)
# default(2,) error
default(a=6,b=1)
