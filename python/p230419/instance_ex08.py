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
class Thing:
    #클래스 변수
    totalCount = 0
    
    ##생성자
    def __init__(self):
        print("생성자 실행")
        #생성 초기화 및 인스턴스 변수 값이 없어도 실행 된다.
        self.name = "상품"
        self.count = 0
        self.showInfo()
        #클래스 변수 1식 증가
        Thing.totalCount +=1

    def setName(self,name):
        #인스턴스 변수 self.name
        self.name = name

    def serCount(self,conut):
        #인스턴스 변수 self.count
        self.count = conut
    
    def showInfo(self):
        print(f"{self.name}는 {self.count}개 있어용")

    @classmethod
    def showTotalCount(cls): #cls=class 클래스 메서드는 매개 변수가 꼭 와야 됌 형태를 맞춰야 한다. 
        print(cls)
        print(f"전체 상품 개수는 {Thing.totalCount}개입니다")

    # def showTotalCount(self):
    #     print(f"전체 상품 개수는 {Thing.totalCount}개입니다")

#인스턴스

phone = Thing()
# phone.setName("갤럭시")
# phone.serCount(5)
# phone.showInfo()
phone.showTotalCount()
# Thing.showTotalCount(phone) 클래스 메서드 처럼 사용은 되어도 주소 넣지 않겠다
Thing.showTotalCount()

pen = Thing()
pen.showTotalCount()