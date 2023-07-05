#문제1 인수 2개 받은 후 몫과 나머지를 출력

#함수명 = add , 매개변수 = 2개, 리턴 없음
#출력 형태
#1) 덧셈 결과 :7
#2) 덧셈 결과 : 하나둘
#3) 타입이 달라서 덧셈 불가능

# 함수 정의
def add(n1,n2):
    if type(n1) != type(n2):
        print("타입이 달라서 덧셈 불가능")
    # if isinstance(n1,int):
    #     print("타입이 달라서 덧셈 불가능")
    else:    
        print(f"{n1+n2}")
    # print(isinstance(n1,int))
    # print("타입이 달라서 덧셈 불가능")

#함수 호출
add(2,5)
add("하나","둘")
add("하나",2)
add(2,5.2)