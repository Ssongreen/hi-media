"""
문제 경제 탭에서 오늘의 연재 타이틀을 화면에 출력하기
"""
from bs4 import BeautifulSoup

import requests
import urllib.request as request

#싸이트 정보 가져 오기
url = "https://news.daum.net/economic#1"
# html = request.urlopen(url).read()
html = requests.get(url).text
# html = requests.get(url).content

soup = BeautifulSoup(html, "html.parser")

econermic = soup.find("ul",class_="list_todayseries").find_all("a",class_="link_txt")

for idx, econermic_title in enumerate (econermic,1):
    print(f"{idx}.{econermic_title.text}")