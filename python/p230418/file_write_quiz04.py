"""
[문제] 사용자가 입력한 데이터가 파일에 저장되도록 하시오.
파일이 없으면 새로 생성하고, 기존에 있는 파일이면 데이터가 추가되어 저장
파일명 : userInputData.txt
입력 데이터가 없으면 입력 종료

"""
with open("D:/web/python/p230418/userInputData.txt", "a", encoding="UTF-8") as userInfo:
    while True:
        one = input("기록할 데이터 입력!")
        if one:
            userInfo.write(one + "\n")
        else:
            break



