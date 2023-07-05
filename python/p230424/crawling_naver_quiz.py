"""
[문제 ] naver 경제 탭에서 우측의 분야별 주요뉴스 타이틀을 추출하여, news.txt 파일에 쓰시오.
- 모드 : 추가 쓰기

"""
from bs4 import BeautifulSoup
import requests
import urllib.request as request
from datetime import datetime 
import os


# 요청
url ="https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=101"

#reject은 user agent가 필요해서 한거에용
headers = {"user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"}
# html = requests.get(url)
html = requests.get(url, headers=headers)

#[방법 2] 는 header를 사용하지 못해요
# html = request.urlopen(url).read()

#상태 코드 확인
# print(html.status_code)

# 파싱
soup = BeautifulSoup(html.content,"html.parser")

# 추출 
# news = soup.find("div", class_="classfy sd").find_all("a",class_="nclicks(rig.secteco)")
news = soup.find("div", class_="classfy sd").find_all("a")
#인덱스[] [] 클래스, id도 가능해요
# print(news[0]["title"])
# print(news[0]["href"])

# path = os.path.dirname(__file__)
# path_name = os.path.join(path,"news.txt")
path_name = os.path.join(os.path.dirname(__file__),"news.txt")

with open(path_name ,"a", encoding="UTF-8") as file:
    date = datetime.today()
    file.write(f"\n기록 일시 :{date}\n")
    
    for idx, news_title in enumerate(news,1):
        news_contents = (f"{idx}. {news_title.text}")
        file.write(f"{news_contents}\n")
