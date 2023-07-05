coffee =3
money = 300

# 파이썬은 조건문에서 자동 형변환을 합니당! 
while money:
    print("커피를 줍니다.")
    coffee = coffee-1

    if not coffee:
        print("커피가 없어요")
        break

print("프로그램 종료")