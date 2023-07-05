class Animal:
    def __init__(self):
        print("부모 생성자")
        print("self",self)
        print("self",id(self))

class Dog(Animal):
    pass
    # def __init__(self):
    #     super().__init__()
    #     print("자식 생성자")
    #     print("self",self)
    #     print("self 주소",id(self))

#인스턴스
# 파이썬에서는 자식이 부모를 호출할 수 없고 직접 호출해야됑 
s = Dog()
