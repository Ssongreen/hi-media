# class 정의

class Food:

    #인스 턴스 메서드
    def setSort(self,sort):
        self.sort = sort

#클래스 메서드
    @classmethod #@ : 데코네이터 Decorator
    def show(cls):
        intance =cls()
        intance.setSort("피자")
        # 인스턴스 메서드 호출
        print(f"음식 종류는 {intance.sort}입니다")
# 인스턴스 생성
# pizza = Food()
# pizza.setSort("피자")
Food.show()
