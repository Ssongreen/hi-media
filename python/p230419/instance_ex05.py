"""
상속 

class 부모 클래스:
    멤버

class 자식 클래스(부모 클래스):
    멤버
"""
class Sun:
    pass

class GrandParent:
    def rich(self):
        print("rich?")

class Parent:
    money = 3463461

    def buy(self, money):
        Parent.money -= money
        print(f"남은 돈 {Parent.money}원 이에요")

class child(Parent, GrandParent):
    ## 메서드 오버라이딩(method overring)
    """
    상속 관계에서 부모의 메서드 재정의
    -> 선언부 그대로, 기능만 수정
    """
    def buy(self, money):
        print(f"부모님 용돈 {money} 주세용")

    # def buy(self):
    #     print(f"부모님 용돈 {Parent.money} 주세용")


#인스 턴스 생성

c = child()
c.buy(1523)
c.rich()
# c.buy()

#객체 소속을 확인 하고 싶당
##ininstance(객체명, 클래스명)
num = 5
print('5가 int 인가요 ?' , isinstance(num,int))

print("객체 c는 Child와 관련잇나요", isinstance(c,child))
print("객체 c는 Parent와 관련잇나요", isinstance(c,Parent))
print("객체 c는 Child,parent 와 관련잇나요", isinstance(c,(child,Parent))) # 튜플로 확인'

print("객체 c는 sun?? 관련 ??", isinstance(c,Sun))
print("객체 c는 sun??,child 관련 ??", isinstance(c,(Sun,child)))
print("객체 c는  관련 ??", isinstance(c,(Sun,child)))
