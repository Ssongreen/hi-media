"""
네이버 날씨 페이지에서 이미지 다운로드 받기
저장 위치 : d:\img\오늘 날짜 
파일명    : 시분초.jpg

"""

import os
from datetime import datetime as date
import requests
import urllib.request as request
from bs4 import BeautifulSoup

url = r"https://search.naver.com/search.naver?where=nexearch&sm=tab_jum&query=%EB%82%A0%EC%94%A8"
# headers = {"user-agent": "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36"}

# html = requests.get(url, headers=headers)

# now = datetime.now() 
# date_str = now.strftime("%Y%m%d")  
# folder = os.path.join("d:/img/", date_str)  
# os.makedirs(folder, exist_ok=True)  

# soup = BeautifulSoup(html.content,"html.parser")
# img_tags = soup.find_all("img", class_="img api_get api_img")

# file_name = str(datetime.now().time()).replace(":","").replace(".","")
# file_name = os.path.join(folder, file_name) 

# for i, img_tag in enumerate(img_tags):
#     img_save = img_tag['data-lazysrc']
#     urllib.request.urlretrieve(img_save, f"{file_name}{i}.jpg")
#     print(f"{file_name} 다운로드 완료")
    
# print("프로그램 끝")


html = requests.get(url)
# print(html.status_code)

# 파싱
soup = BeautifulSoup(html.text, "html.parser")

# 엘리먼트
img_element = soup.find_all("img", class_="thumb api_get api_img")

# 이미지 저장 폴더 생성
today = str(date.now().date()).replace("-","")
folder_path = f"d:/img/{today}/" #폴더라는 표현으로 경로 뒤에 / 넣어주세용

os.makedirs(folder_path, exist_ok=True)

# 이미지 저장

for img_element in img_element:
    file_name = str(date.now().time()).replace(":","").replace(".","")
    save_path = f"{folder_path}{file_name}.jpg"
    img_save = img_element['data-lazysrc']
    request.urlretrieve(img_save, f"{save_path}.jpg")
    print(f"{save_path}다운로드")
print("다운로드 완료")