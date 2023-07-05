from bs4 import BeautifulSoup

html ="""
<html>
    <body>
        <div id="wrap">
            <h1>공지</h1>
            <h2>과목</h2>
            <ul class="lec">
                <li>파이썬 기초1</li>
                <li>파이썬 기초2</li>
                <li>머신러닝</li>
            </ul>
            <h2>강의 일정</h2>
            <h2>교재 목록</h2>
        </div>
    </body>
</html>

"""

# 추출형식 3가지 방법
soup = BeautifulSoup(html, "html.parser")

#모든 h2추출
#엘리먼트가 여러개가 있으면 selcet는 여러개 뽑아와용
h2_all_01 = soup.select("html > body > div > h2")
print("모든 추출 1)", h2_all_01)
print("모든 추출", type(h2_all_01))

#set은 집합 개념이다. 
h2_all_02 = soup.select("body h2")
print("모든 추출 2)",h2_all_02)
print("모든 h2",type(h2_all_02))

h2_all_03 = soup.select("div > h2")
print("모든 추출 3)",h2_all_03)
print("모든 h2",type(h2_all_03))

h2_all_04 = soup.select("#wrap > h2")
print("모든 추출 3)",h2_all_04)
print("모든 h2",type(h2_all_04))

#문제 아래와 같이 content만 추출해용
"""
과목
강의 일정
교재 목록
"""
for h2 in h2_all_04:
    print(h2.text)

print(h2_all_04[0])
print(h2_all_04[:-1])

# 처음 만나는 자식 하나만 뽑아용 
h2_one_01 = soup.select_one("div > h2")
print("h2 하나 추출 ",h2_one_01)
print("h2 하나 추출 ",type(h2_one_01))

h2_one_02 = soup.select_one("div h2:nth-of-type(1)")
print("h2에 첫번째 하나", h2_one_02)

h2_one_03 = soup.select_one("div h2:nth-of-type(2)")
print("h2에 두번째 하나 ", h2_one_03)

#문제 아래와 같은 content만 추출 해용
"""
파이썬 기초1
파이썬 기초2
머신러닝
"""

h2_one_04 = soup.select_one(".lec")
print(h2_one_04)
#태그이기에 엘리먼트만 있으면 사용 가능해요
print("content 추출", h2_one_04.text)
# 태그이기에 한번더 추출 할 수 있어요
print(h2_one_04.select("li"))
# 타입이 set이기에 안되용
# print(h2_all_04.selct("li"))

