"""크롤링은 웹 사이트에서 데이터를 추출하거나 수집하는 과정을 말합니다. 웹 크롤러는 자동화된 프로그램으로, 인터넷 상의 정보를 수집하고 검색하는 데 사용됩니다. 크롤링을 통해 수집된 데이터는 분석, 비교, 예측, 추천 등 다양한 용도로 활용될 수 있습니다.

하지만 크롤링은 웹 사이트의 저작권 문제나 법적 문제를 일으킬 수 있으므로, 사용자는 크롤링을 할 때 반드시 해당 웹 사이트의 이용 약관을 확인하고, 저작권, 개인정보보호 등 관련 법규를 준수해야 합니다. 또한, 일부 웹 사이트는 로봇 배제 표준(robots.txt)을 이용하여 크롤러의 접근을 제어할 수 있으므로, 이를 확인해야 합니다."""


"""
객층 구조를 가져오는 libily에서 가져와용
pip install beautifulsoup4

"""
#문자열을 계층 구조로 이해 하는 것이다.
from bs4 import BeautifulSoup

html = """
<html>
    <body>
    <h1>BeautifulSoup 연습합니다</h1>
    <p>연습 중1</p>
    <p>연습 중2</p>
    </body>
</html>
"""
soup = BeautifulSoup(html, "html.parser")
# print(soup)
# print(type(soup))
# print(soup.prettify()) 실제 개발자 도구 보면서해용

#h1 엘리먼트 추출
# print(soup.html.body.h1)
# print(type(soup.html.body.h1))
#h1 엘리먼트 content 추출

# print(soup.html.body.h1.text)
# print(soup.html.body.h1.string)
# print(soup.html.body.h1.get_text())
# print(soup.html.body.h1.getText())

# print(type(soup.html.body.h1.text))
# print(type(soup.html.body.h1.string))
# print(type(soup.html.body.h1.get_text()))
# print(type(soup.html.body.h1.getText()))

#body 엘리먼트 추출
# print(soup.body)
# #body 엘리먼트 content 추출
# print(soup.body.text)
# print(soup.body.string)
# print(soup.body.get_text())

# #h1 접근 
# #최상위 접근 시작
# print(soup.h1)
# print(soup.h1.text)
# p 접근
print(soup.p)

# p 엘리 먼트 추출
p = soup.html.body.p
print("p:?",p)

#형제 엘리먼트에 접근
# 엔터로 했기 떄문에 두번 사용 해야 되용
p2 = p.next_sibling.next_sibling

print(p2)

h1 = p.previous_sibling.previous_sibling

print(h1)

#일부의 엘리먼트 추출
body = soup.html.body
print("body " *25)
print(body)
print("h1 추출",body.h1)