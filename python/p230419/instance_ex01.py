"""
파이썬에서 클래스는 객체 지향 프로그래밍을 구현하는 데 사용됩니다. 클래스는 데이터와 데이터를 조작하는 메서드를 포함하는 사용자 정의 데이터 유형을 정의하는 데 사용됩니다.

클래스는 일반적으로 다음과 같은 구문으로 정의됩니다:

class 클래스이름:
    def __init__(self, 매개변수):
        self.인스턴스변수 = 초기값
    def 메서드이름(self, 매개변수):
        # 메서드의 동작
위의 예제에서 __init__() 메서드는 클래스 인스턴스가 생성될 때 호출됩니다. self 매개변수는 인스턴스 자체를 참조하는 데 사용됩니다. self를 통해 인스턴스 변수를 초기화하고 다른 메서드에서 사용할 수 있습니다. 메서드는 클래스의 동작을 정의하며 self 매개변수를 통해 인스턴스 변수에 액세스할 수 있습니다.

클래스를 사용하면 코드를 구조화하고 재사용 가능한 코드를 작성할 수 있습니다. 클래스는 캡슐화와 추상화를 지원하여 코드의 복잡성을 감소시키고 유지 보수를 용이하게 합니다. 클래스를 사용하여 객체 지향 프로그래밍을 구현하면 유지 보수성과 재사용성이 높은 코드를 작성할 수 있습니다.

"""

"""
클래스 class 

클래스는 자료형
멤버 : 변수(field), 메서드(method)
클래스명 : 대문자로 시작

-class 정의 
class 클래스명:
    멤버 변수 
    멤버 메서드

cf) 변수 종류
- 전역 변수 
- 지역 변수 : 한수 내
@@ 클래스 내 @@
인스턴스 변수
클래스 변수

# 클래스 정의

# class Student:
    # def greeting():
        # print("Hello")

## 인스턴스(객체) 생성
# hong = Student() # 생성자 호출
# hong.greeting()#메서드를 실행할 때 접근 연사자를 사용하면 주소가 입력 된다

# class Student:
#     def greeting():
#         print("Hello")

# ## 인스턴스(객체) 생성
#     greeting()

파이썬 생성자(Constructor)는 클래스(Class)의 인스턴스(Instance)가 생성될 때 호출되는 특별한 메소드(Method)입니다. 생성자는 클래스의 초기화 작업을 담당하며, 클래스 변수나 인스턴스 변수 등을 초기화하는 역할을 수행합니다.

파이썬에서 생성자는 __init__() 메소드를 사용하여 정의합니다. __init__() 메소드는 첫 번째 매개변수로 self를 받습니다. self는 인스턴스 자신을 가리키는 키워드로, 이를 통해 인스턴스 변수를 정의하고 접근할 수 있습니다.

++생성자
이유    : 객체가 생성될 때, 특정 메서드(기능) 자동 실행
        : 객체가 생성될 때, 변수 초기화
    객체가 생성될 때 무조건 실행(java)

    파이썬은 1개만 가능
    생성자를 명시하지 않으면, 기본 생성자가 실행
    기본 생성자 ->> 매개변수 없고, 기능 없음
                ->> 형식상 실행
    생성자명: __init__()
"""
class Student:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def greeting(self):
        print("Hello")
        # print("self에 저장된 주소",self)

    #인스턴스 변수 메서드 내에서 만든당 
    #두번째 매개 변수부터 넣어줘용
    def setName(self,name):
        self.name = name    

    def showInfo(self):
        print("제이름은"  + self.name) 
        print("나이는" + str(self.age))

## 인스턴스(객체) 생성
hong = Student("홍홍", 29) # 생성자 호출
hong.greeting()
# print("홍에 저장된 주소" ,hong)
#홍홍을 넣어줌 두번째 매개 변수가 받는다. 
# hong.setName("홍홍")
hong.showInfo()

park = Student("박씨",25)
park.greeting()
# print("박에 저장된 주소" ,park)
# park.setName("박씨")
park.showInfo()
park.__init__("박보검 2", 66)

# 파이썬은 생성자를 한개만 정의 할 수 있어용 
# 오버로딩 안되용]

"""
파이썬에서 함수나 메서드를 호출할 때 인자의 개수나 타입에 따라 실행되는 함수나 메서드가 달라질 수 있습니다. 이를 이용하여 오버로딩과 유사한 기능을 구현할 수 있습니다. 예를 들어, 다음과 같이 함수를 정의할 수 있습니다.
def add(a, b):
    return a + b

def add(a, b, c):
    return a + b + c
위의 예제에서는 add() 함수를 두 번 정의하였습니다. 첫 번째 함수는 두 개의 매개변수를 받아 더한 값을 반환하고, 두 번째 함수는 세 개의 매개변수를 받아 더한 값을 반환합니다. 이 경우에는 함수를 호출할 때 매개변수의 개수에 따라 실행되는 함수가 달라집니다.

하지만 위의 예제는 오류를 발생시키므로, 오버로딩 기능을 사용하기 위해서는 다른 방법을 사용해야 합니다. 예를 들어, 다음과 같이 가변 인자를 사용하여 함수를 정의할 수 있습니다.

def add(*args):
    if len(args) == 2:
        return args[0] + args[1]
    elif len(args) == 3:
        return args[0] + args[1] + args[2]
위의 예제에서는 *args를 사용하여 가변 인자를 받아들입니다. 그리고 len(args)를 사용하여 매개변수의 개수를 확인한 후, 실행될 코드를 결정합니다. 이를 이용하여 매개변수의 개수에 따라 실행되는 코드를 다르게 작성할 수 있습니다.
"""

print("\n 이미자 ??ㅁ")
# lee = Student()

