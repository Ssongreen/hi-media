## 클래스 정의
"""
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
클래스 멤버
변수    :   인스턴스 변수   , 클래스 변수
메서드  :   인스턴스 메서드 , 클래스 메서드
@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@
                    접근
-------------------------------------------------
인스턴스    메서드      [내부]self.메서드명()
                        [외부]클래스명.메서드명(주소)
                        [외부] 참조변수.메서드명()

클래스      메서드      [외부] 클래스명.메서드명() @classmethod

정적 메서드             [외부] 클래스명.메서드명
-------------------------------------------------
"""

#클래스 정의
class Calculator:
    ## 인스턴스 메서드
    def add(self, first, second):
        self.first = first
        self.second = second
        print("덧셈", self.first +self.second)

    #클래스 메서드
    @classmethod
    def sub(cls,n1,n2):
        print("뺼셈",n1 - n2)

    #정적 메서드    #인스턴스 변수를 사용하지 못해용
    @staticmethod
    def mul(sta,a,b):
        instance = mul()
        instance.add
        print("곱셈",a*b)
        print(f"{instance.add}되요?")

    #매게 변수가 없어도 괜찮아용
    @staticmethod
    def div():
        print("나눗셈")
# 메서드 호출
# 1) 인스턴스 메서드 호출 : 객체 생성 - > 호출

# cal = Calculator()
# cal.add(3,5)

Calculator().add(3,5)

#2) 클래스 메서드 호출
Calculator.sub(6,1)

#3) 정적 메서드

Calculator.mul(2,5)
Calculator.div()