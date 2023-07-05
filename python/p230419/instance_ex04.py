# 클래스 정의
class Cat:
    def __init__(self):
        print("생성자")
    #메서드
    def showInfo(self):
        print("나는 고양")

#인스턴스 생성
print("(。O ⩊ O。)")
one = Cat()
one.showInfo()

print("(。O ⩊ O。)")
two = Cat
two.__init__((Cat()))
two.showInfo