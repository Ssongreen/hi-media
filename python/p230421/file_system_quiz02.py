"""
chemical
파일 이름을 뽑쟈

문제 chemical 폴더 내 모든 파일명을 추출
파일명에서 숫자만 추출하여 chemical.txt에 기록
"""
import os
import re

# file_list = os.listdir(r"D:\web\python\p230421\chemical")

# for file_name in file_list:
#     file_path = os.path.join(r"D:\web\python\p230421\chemical", file_name)
#     file_dirname, file_basename = os.path.split(file_path)
#     file_name, file_ext = os.path.splitext(file_basename)
    
#     cp = re.compile("[^a-zA-Z]")
#     file_name = re.findall(cp, file_name)

#     if (f"{re.compile('\d')}-{re.compile('\d')}-{re.compile('\d')}-") : 
#         file_name = ''.join(file_name)
#         file_name = file_name.replace(' ', '\n')
#         print(file_name)

#1. 지정된 경로에서 파일명 읽어 오기
cur_path = os.path.join(os.path.dirname(__file__),"chemical")

#2. 파일명의 일부 추출

file_list = os.listdir(cur_path)
file_list_str = "~".join(file_list)
cp = re.compile("\d+-\d+-.")
file_name = cp.findall(file_list_str)
#3. 쓰기 작업

write_path = os.path.join(os.path.dirname(__file__),"chemical.txt")

with open(write_path,"w") as chemical:
    for mama in file_name:
        chemical.write(mama + "\n")
# join으로 각 요소 별로 줄바꿈을 넣어주는 코드이다.
with open(write_path,"a") as chemical:
    chemical.write("\n".join(file_name))
print("프로그램 종료")