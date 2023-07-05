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

path = os.path.dirname(__file__)
file_path = os.path.join(path, "morrie.txt")

# 1. 파일 읽어 오기
fl = open(file_path,"r", encoding="UTF-8")
# 1.2 읽기 함수 : readline, readlines, read
#cp949 는 파일 인코딩을 할때, 나타난 인코딩 형태 오류를 말한다. cheicterset 지정을 안하면 이렇게 나타나용
morrie = fl.read()
#1.3
#다 실행 할 것까지 한다음에 닫아요 변수에 저장되었으니 닫았어요
fl.close()

# 2. 데이터 추출 : 교수가 포함된 문장
cp = re.compile("[\w\s,]+교수[\w\s]*[.]")
#교수가 시작하면 *로 한다
professor = cp.findall(morrie)
for idx, line in enumerate(professor,1):
    print(f"{idx}.{line.lstrip()}") 

# 3. 화면 출력