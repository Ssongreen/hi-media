"""
문제 numberTwo.txt 파일 생성후 1-100까지 정수를 파일에 쓰기
모드 : 추가 쓰기 

"""

#1.open 함수
# open("경로/파일명.확장자 or 파일명.확장자", "모드")
# 파일명하고 변수를 같은 이름이 좋아용
numberTwo = open("numberTwo.txt","a", encoding="utf-8")
"""
"binary"는 라틴어의 "이분법적인"을 뜻하는 "binarius"에서 유래된 용어로서, 컴퓨터 과학에서는 0과 1의 두 가지 값을 사용하여 정보를 나타내는 이진법을 가리킵니다. 이진법은 컴퓨터에서 데이터를 처리하고 저장하는 데 매우 중요합니다. 이진법은 0과 1로 숫자, 문자, 그림 등 모든 종류의 데이터를 표현할 수 있습니다. 2진수는 각 자리의 값을 2의 제곱수로 표현하여 값을 나타냅니다. 예를 들어, 이진법에서 "1010"은 0x2^3 + 1x2^2 + 0x2^1 + 1x2^0으로 계산되며, 이는 10진법에서 "10"으로 표현됩니다.
"""
#2.write 함수 "문자로 취급하기에 문자로 사용해요요"
# for n in range(1,101):
#     print(end=" ")
#     if n % 10 ==0:
#         numberTwo.write(f"{n}\n")
#     elif n <11:
#         numberTwo.write(f" {n} ")
#     else:
        # numberTwo.write(f"{n} ")

for n in range(1,101):
    print(end=" ")
    # numberTwo.write(f"{n:3}")
    numberTwo.write(f"{n:<3}")
    if n % 10 ==0:
        numberTwo.write(f"\n")

#3.close 함수
numberTwo.close
print("프로그램 종료")
