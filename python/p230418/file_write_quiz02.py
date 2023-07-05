"""
문제 number.txt 파일 생성후 1-100까지 정수를 파일에 쓰기
모드 : 추가 쓰기 

"""

#1.open 함수
# open("경로/파일명.확장자 or 파일명.확장자", "모드")
# 파일명하고 변수를 같은 이름이 좋아용
number = open("number.txt", "a")
# number = open("number.txt", "a", encoding="utf-8")
# print("file", file)
#2.write 함수 "문자로 취급하기에 문자로 사용해요요"
for s in range(1,101):
    number.write(f"{s}\n")
    # number.write(str(s) +"\n")


#3.close 함수
number.close
print("프로그램 종료")
