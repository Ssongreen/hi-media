"""
문제 gugudan.txt 파일 생성후 2-9단 쓰시오
모드 : 추가 쓰기 
경로 상대 경로

"""

#1.open 함수
# open("경로/파일명.확장자 or 파일명.확장자", "모드")
# 파일명하고 변수를 같은 이름이 좋아용
#절대 경로 설정 "디스크 에서 경로 설정해준 것"
#덮어 쓰기 "w"
gugudan = open("D:\web\python\p230418\gugudan.txt", "w" , encoding="UTF-8")

# number = open("number.txt", "a", encoding="utf-8")
# print("file", file)
#2.write 함수 "문자로 취급하기에 문자로 사용해요요"

for s in range(2,10):
    for y in range(1,10):
        gugudan.write(f"{s} * {y} = {s*y}\n")
    gugudan.write("\n")
        

#3.close 함수
gugudan.close
print("프로그램 종료")



# 파일에서 기존에 입력된 데이터를 읽어와서 set에 저장
with open("D:/web/python/p230418/file_path", "r", encoding="UTF-8") as f:
    existing_data = set(f.read().splitlines())

# 새로운 데이터를 입력 받고, 중복 체크하여 파일에 저장
with open("D:/web/python/p230418/file_path", "a", encoding="UTF-8") as f:
    while True:
        new_data = input("기록할 데이터 입력!")
        if new_data:
            if new_data not in existing_data:  # 중복 여부 체크
                existing_data.add(new_data)   # set에 새로운 데이터 추가
                f.write(new_data + "\n")
            else:
                print("이미 입력된 데이터입니다.")
        else:
            break