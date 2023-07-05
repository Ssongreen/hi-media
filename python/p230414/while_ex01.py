prompt = """
-------------------
1. 추가
2. 삭제
3. 목록
4. 종료

번호 선택 = " "

"""
# number = 0
# 논리값에서 4와 다르면 무한 반복할 수있게 해용
#방법 1
# while number != 4:
#     print(prompt)
#     number = int(input("번호 선택 = "))

# 방법 2
while True:
    print(prompt, end=" ") 
    number = int(input())
    if number == 4:
        break