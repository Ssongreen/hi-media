"""
문제 morrie.txt 에서 교수가 들어간 문장만 추출하시옹

"""
import re,os
import os


# with open(r'D:/web/python/p230421/morrie.txt', "r", encoding="utf-8") as file:
#     alls = file.read()

# split_alls = re.split("[.]\s+", alls)

# for text in split_alls:
#     if "교수" in text:
#         print(text)

# 1. 파일 읽어 오기
path = os.path.dirname(__file__)
file_path = os.path.join(path, "morrie.txt")

with open(file_path,"r", encoding="UTF-8") as fl:
    morrie = fl.read()

# 2. 데이터 추출 : 교수가 포함된 문장
cp = re.compile("[\w\s,]+교수[\w\s]*[.]")
#교수가 시작하면 *로 한다
professor = cp.findall(morrie)
for idx, line in enumerate(professor,1):
    print(f"{idx}.{line.lstrip()}") 

# 3. 화면 출력