#import로 모듈이 있다면 파이썬에서는 실행을 시킨다.
#전역 변수

"""
__name__은 파이썬에서 내장되어 있는 특별한 변수입니다. 이 변수는 현재 모듈의 이름을 저장하고 있습니다.

만약 __name__ 변수를 직접 실행하는 것이 아니라 다른 모듈에서 import하여 실행한다면, 현재 모듈의 이름 대신 모듈의 이름이 저장됩니다. 이것은 모듈을 다른 모듈에서 재사용할 때 유용합니다.

예를 들어, 다음과 같은 코드가 있다고 가정해보겠습니다.

# module.py 파일

def foo():
    print('Hello, world!')

if __name__ == '__main__':
    foo()
__name__ 변수가 '__main__'과 같은지 확인하는 것은 현재 모듈이 직접 실행되었는지 아니면 다른 모듈에서 임포트되어 사용되었는지를 확인하는 것입니다. 만약 현재 모듈이 직접 실행되었다면, foo() 함수가 호출됩니다. 그러나 다른 모듈에서 module.py를 임포트하여 사용한다면, foo() 함수는 호출되지 않습니다.
"""

value = 10

def show():
    print("=" * 33)
    print("show 함수 실행")
    print("__name__",__name__)
    print("=" * 33)

#클래스 정의
class Increment:
    #인스턴스 메서드
    def showNumber(self,number):
        self.number = number +1
        print("1 증가하는 값", self.number)

#테스트 할때 사용, 직접 실행, 간접 실행에 따른 조건문을 형성한다.
if __name__ == "__main__":
    show()
else:
    print(__name__)