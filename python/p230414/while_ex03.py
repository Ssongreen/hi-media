coffee =3

# 파이썬은 조건문에서 자동 형변환을 합니당! 
#"[::-1]" 표현식은 리스트의 모든 요소를 역순
#refactoring
while True:
    money = int(input("\n돈을 넣어주세용 ?_?"))
    if money == 300:
        print("\n커피를 줍니다.")
        coffee = coffee-1

    elif money > 300:
        print(f"\n잔돈 {money-300}를 주고 커피를 줍니다")
        coffee -= 1
    else:
        print("\n돈을 더 넣어주세요")

    print(f"남은 {coffee}는 몇잔")    
    #논리로 정의 해요
    if not coffee:
        print("\nദ്ദിㆆ_ㆆ) 커피가 없어요")
        break

print("프로그램 종료")

#남은 커피는 몇잔입니까?