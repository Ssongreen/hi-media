#문제4 제비뽑기 하기
# 랜덤이라는 파일 안에 함수중 셔플 
# 1번부터 나중까지 순차적으로 꽝이 나오면 끝
#사은품을 추첨하여 고객님께 제공하려고 합니다.
#사은품은 랜덤으로 추첨하되 꽝이 나오는 순간 더이상 추첨안해용

import random

castLots = ["생수", "지갑", "꽝", "커피", "과자", "도서", "핸드폰", "노트북"]
random.shuffle(castLots)

for i in range(len(castLots)):
    item = castLots[i]
    if item == "꽝":
        print(f"{i}번은 {item}은(는) 꽝입니다.")
        break
    else:
        print(f"{i}번은 뽑은 {item}당첨! 축하!")
print("@"*77)

for i,c in enumerate(castLots, 1):
    if c == "꽝":
        print(f"{i}는 {c}는 꽝입니다")
        break
    else:
        print(f"{i}는 {c} 당첨 ! ")
print("@"*77)