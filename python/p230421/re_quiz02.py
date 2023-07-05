"""
문제 gangnam.txt 에서 연락처에서만 추출하여 파일에 쓰시오
-쓰기 파일 phoneNumber.txt
-쓰기 모드 추가 쓰기
- 전체 연락처 개수 >> 50
연락처 추출 및 파일 기록 완료 끝

"""

import re

# with open('D:/web/python/p230421/gangnam.txt', 'r') as file:
#     content = file.read()
#     matches = re.findall(r'\d{2,3}-\d{3,4}-\d{4}',content)
        
    
# with open('D:/web/python/p230421/phoneNumber.txt', 'a',encoding="euc-kr") as wit:
#     total = 1 
#     for wite in matches:
#         total += 1
#         wit.write(wite+"\n")
# print(f"전체 연락처 개수는 ?? {total}")
# print("연락처 추출 및 파일 기록 완료")



#파일 읽기
with open('D:/web/python/p230421/gangnam.txt', "r") as gangnam:
    gangnam_read = gangnam.read()
    
#연락처 추출 
cp = re.compile("\d{0,3}-?\d{3,4}-\d{4}",)
phone_number = cp.findall(gangnam_read)
#연락처 기록
with open('D:/web/python/p230421/phoneNumber.txt', 'a') as phone_number_wirte:
    for idx,number in enumerate (phone_number,1):
        phone_number_wirte.write(f"{idx}.{number}\n")
print("전체 연락처 개수는 ?",idx)
print("연락처 추출 및 파일 기록 완료")