"""
문제 
웹페이지 요청 후 파싱하시오

"""
from bs4 import BeautifulSoup
import os
import requests
from urllib.request import request 

url = "https://www.transfermarkt.com/spieler-statistik/wertvollstespieler/marktwertetop"

html = requests.get(url)

soup = BeautifulSoup(html.content, "html.parser")

table = soup.find("div", class_="responsive-table").find_all('table', class_="items")
