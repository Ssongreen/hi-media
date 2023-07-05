"""
오늘 날짜로 시간 폴더 
실행이 된 시간에 파일이 만들어야 된다
D:\workspace\오늘 날짜 \ 현재 시간 .txt 
"""

from datetime import date , datetime
import os

# 1. 경로 생성(폴더 생성)
today = str(date.today()).replace("-","")
# 1.1 폴더명
folder_path = "d:/workspace/"+today
# 1.2 폴더 생성
if not os.path.exists(folder_path):
    os.makedirs(folder_path)

# 2. 파일 생성(파일 추가)

#2.1 파일명

file_name = str(datetime.now().time()).replace(":","").replace(".","")
os.chdir(folder_path)   

#2.2  파일 추가
file = open(file_name+".txt","w")
file.close()

print("작업 완룡")