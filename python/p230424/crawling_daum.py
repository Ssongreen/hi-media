from bs4 import BeautifulSoup
# 크롤링(스크랩)요청하기
import requests
import urllib.request as request

#싸이트 경로를 가져오기
url ="https://news.daum.net/economic#1"
"""
요청 
[방법 1] requests
#http: response [200]이면 정상이다
#content로 안되는 싸이트가 있어서, text로 하면되요
# html = requests.get(url).content
#.text = str 
# html = requests.get(url).text
# print(type(html))
# # print(html)
# b` 는 2진수 숫자이다.
# soup = BeautifulSoup(html, "html.parser")
# print(soup)
#안될 떄 싸이트 개발자 도구랑 비교한다.
"""


#방법 2 urllib.rquest
#read() 함수를 통해 str로 변경되용 -> bytes
html = request.urlopen(url).read()
#객체 형태 주소
# print(type(html))
# print(html)

#2. 파싱
soup = BeautifulSoup(html,"html.parser")

#3. 뉴스 타이틀 리스트 ul 엘리먼트 추출
# news = soup.find("ul", class_="list_newsmajor").find_all("a",class_="link_txt")
# # print(news[0].text)

# for idx, news_title in enumerate (news, 1):
#     print(f"{idx}. {news_title.text}")

