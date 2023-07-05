class Fruit:
    def __init__(self):
        print("생성자")

    #클래스 메서드
    @classmethod
    def create(cls):
        print("클래스 메서드 실행")
        return cls()


# 클래스 메서드 호출
class Banana(Fruit):
    def __init__(self):
        print("바나나 실행")

    def like(self):
        print("바나나 좋아해 ?")

    def count(self, count):
        self.count = count
        print(f"바나나는 {self.count}개 있뎅")

fruit =Fruit.create()
banana =Banana.create()

banana.like()
banana.count(7)
print("banana의 수", banana.count)