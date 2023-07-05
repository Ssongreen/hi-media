# 클래스 정의

"""                     선언 위치           접근 형태               메모리 할당(메모리에 만들어 질때)
=====================================================================================================
인스턴스    변수        메서드 내           self.변수명                 메서드 실행

클래스      변수        클래스 내           클래스명.변수명             클래스 메모리에 로드 될때

"""

class Person:
    #클래스 변수 #객체 생성과 상관없어요
    count =1 #z
    
    # def __init__(self):
    #     print("생성자 실행")
    #     self.count = 1
    #     print(f"{self.count}번 사람 생성")
    #     self.count = self.count +1 

    def __init__(self):
        print("\n 생성자 실행됨")
        print(f"{Person.count}번 사람 생성") 
        Person.count +=1
        # self.count +=1 

## 인스턴스 생성
print("클래스 변수 count ", Person.count)
p1 = Person()
p2 = Person()
print("클래스 변수 count ", Person.count)

