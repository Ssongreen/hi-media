#클래스 정의

class Animal:

    #클래스 변수
    count = 1444

    def showInfo(self):
        self.age = 1
        print("나는 동물이에용")

#클래스 메서드 접근
# Animal.showInfo()

## 인스턴스 생성

one = Animal()
one.showInfo()
Animal.showInfo(one)
print("인스턴스 변수 age", one.age)
print("클래스 변수 count", Animal.count)
print("one.count", one.count)

"""
파이썬 장고(Django)는 파이썬으로 작성된 무료 오픈소스 웹 프레임워크입니다. 웹 애플리케이션을 빠르고 쉽게 개발할 수 있도록 필요한 기본적인 구성 요소와 기능을 제공합니다. 장고는 데이터베이스, URL 라우팅, HTML 템플릿, 폼 처리, 보안 등 많은 기능을 내장하고 있어 개발자가 이를 모두 직접 구현하지 않아도 되어 편리합니다.

장고는 MTV(Model-Template-View) 패턴을 사용하여 웹 애플리케이션을 구성합니다. 모델(Model)은 데이터베이스와 상호작용하며, 뷰(View)는 HTTP 요청을 처리하고 사용자에게 데이터를 보여줍니다. 템플릿(Template)은 사용자에게 보여지는 HTML 페이지를 생성합니다.

장고는 다양한 애플리케이션에서 사용될 수 있으며, 대규모 웹 서비스에서도 사용되고 있습니다. 또한, 장고는 다양한 라이브러리와 패키지를 제공하여 개발자가 보다 쉽게 개발할 수 있도록 도와줍니다.

"""

two = Animal()
two.showInfo()