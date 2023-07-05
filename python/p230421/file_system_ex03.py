"""
Python에서 os 모듈은 운영체제와 상호작용하기 위한 함수들을 제공합니다. 이 모듈은 다음과 같은 기능을 제공합니다:

파일/디렉토리 작업: 파일/디렉토리 생성, 삭제, 이동, 이름 변경 등의 작업을 수행할 수 있습니다.
환경 변수: 운영체제의 환경 변수를 설정하고 가져올 수 있습니다.
실행: 외부 프로그램을 실행하고, 그 결과를 얻을 수 있습니다.
os 모듈을 사용하기 위해서는 import os 문을 사용하여 모듈을 가져와야 합니다. 이후에는 os 모듈에서 제공하는 함수들을 호출하여 작업을 수행할 수 있습니다.

예를 들어, 다음과 같이 os 모듈을 사용하여 현재 작업 디렉토리를 가져올 수 있습니다.

python
Copy code
import os

current_dir = os.getcwd()
print(current_dir)
이 코드는 현재 작업 디렉토리를 가져와서 출력합니다. os.getcwd() 함수는 현재 작업 디렉토리를 반환합니다.
"""

import os 

print(os.path.exists(r"D:\test"))
print(os.path.exists(r"d:\day"))
if os.path.exists(r"d:\test\ex.txt"):
    open(r"d:\test\ex.txt","w")
    print("파일 생성끝")

print(os.path.exists(r"d:\test\ex.txt"))
print(os.path.exists(r"d:\test\cf.txt"))
확인용 = os.path.exists(r"d:\okay")
#디렉토리 만들어요
#1) 예외 처리 = 
# try:
#     os.mkdir(r"d:\Okay")
# except:
#     print("폴더가 존재해요")
# else:
#     print("폴더 생성")
# print("프로그램 종료")

#1)
new_path = r"D:Okay"
os.mkdir(r"d:\hey")

if not os.path.exists(new_path): 
    os.mkdir(new_path)
    print("폴더 생성")

# print("폴더 생성")

# os.mkdir(r"D:\okay\sub") 
#디렉토리 만들기 #exist_ok=True를 사용하여, 경로에 파일이 있으면 에러 없이 넘어가고 
#경로에 파일이 없으면 만들어 준답니다.
os.makedirs("D:\hey\sub",exist_ok=True)

#파일 삭제
#파일이 존재 하지 않으면 에러 없이 넘어가용
# os.remove(r"d:\test\ex.txt")
print("ex.txt 파일 삭제")
##폴더 삭제
# 디렉터리가 비어야 실행되용
# os.rmdir(r"D:\okay")
# os.rmdir(r"D:\test")
print("test 폴더 삭제 완료")
#모두 삭제
# os.removedirs(r"D:\Okay\sub")
# print("okay 폴더 삭제")
os.removedirs(r"D:\hey\sub")
print("hey 폴더 삭제")

# 쉘 유틸
import shutil

shutil.rmtree(r"d:\hey")
print("hey 삭제 ")


print("프로그램 종료")
