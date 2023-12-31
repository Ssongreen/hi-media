value = 7

# 문제1 value에 저장된 값이 짝수/홀수 인지 출력

# if(value % 2 == 0): 보기 편하게 한다
# 논리 값으로 0으로 취급되지 않기에 Ture로 홀수로 받는다.
if value % 2:
    print("홀수")
else:
    print("짝수")


#문제2 value에 저장된 값의 범위 출력
# 범위 0 미만의 수, 0이상 10미만의 수 ,10이상 20미만의 수 20이상 30미만의 수 , 30이상의 수

if value<0:
    print("음수")
elif value<10:
    print("0이상 10미만의 수")
elif value<20:
    print("10이상 20미만의 수")
elif value<30:
    print("20이상 30미만의 수")
else:
    print("30이상")

#문제3  n1과 n2 비교 하여 큰값
n1,n2 =5,3
# n1, n2 = eval(input("숫자 2개 입력 쓰 "))
# if(n1 > n2):
#     print(n1,"커용")
# elif(n1 < n2):
#     print(n2,"커용")    
# else:
#     print("서로 같아용")

"""
Iterable(이터러블)은 원소들의 집합으로, 반복 가능한 객체를 말합니다. 이터러블 객체는 for 문이나 다른 반복문에서 사용할 수 있습니다.

파이썬에서는 리스트, 튜플, 문자열 등의 시퀀스 타입, 딕셔너리, 집합 등의 컬렉션 타입, 그리고 파일 등이 이터러블 객체입니다. 이터러블 객체는 모두 iter() 함수를 통해 반복자(Iterator) 객체를 생성할 수 있습니다.
"""
#max 큰값 찾기 
print("큰 값",max(n1,n2))
#문제 4 복숭아가 있으면 복숭아 갯수를 출력 하고, 복숭아가 없으면 복숭아 없습니다.를 출력

fruit = {"사과":5,"복숭아":7,"바나나":3}
print(type(fruit))
if("복숭아" in fruit):
    print("복숭아 :" , fruit["복숭아"], "개 입니다")
    print("복숭아 :" + str(fruit["복숭아"]) + "개 입니다")
    print("복숭아 : %d개 입니다" %fruit["복숭아"])
    print("복숭아 : {}개 입니다" .format(fruit["복숭아"]))
    print(f"복숭아 개수는 {fruit['복숭아']}개입니다")
    # print(f"복숭아 개수는 {fruit[\"복숭아\"]}개입니다")
    #문자열 내에 있는 복숭아가 아니라서 앙되용 문자열이 아니에용
    """
    문자열 내에 중괄호({})를 사용하면서 중괄호 안에 변수를 포함시키는 경우, 문자열 앞에 접두사 'f'를 붙여서 f-string을 만들어야 합니다. f-string은 파이썬 3.6부터 도입된 문자열 포맷팅 방식으로, 중괄호 안에 변수를 바로 넣을 수 있습니다.
    하지만 주어진 코드에서는 f-string을 만들 때 딕셔너리 키에 대한 인덱싱을 잘못 사용하고 있습니다. 딕셔너리 키는 문자열이어야 하기 때문에, 딕셔너리에서 값을 가져오기 위해서는 문자열 형태의 키를 사용해야 합니다.
    """
else:
    print("복숭아 없데용")

"""
cf + 연산자는 type이 같아야 해용
정수    +   정수
실수    +   실수
문자열  +   문자열 

파이썬에서 print() 함수는 인자로 전달된 값들을 문자열로 변환하여 출력합니다. 따라서 print() 함수의 인자로 문자열과 정수를 함께 전달하면 파이썬은 이를 문자열로 변환하여 출력하려고 시도합니다.

하지만 문자열과 정수는 서로 다른 데이터 타입입니다. 따라서 파이썬은 이 두 값을 자동으로 형변환할 수 없기 때문에 타입 에러(TypeError)가 발생합니다.

예를 들어, 다음과 같은 코드를 실행하면 타입 에러가 발생합니다.

python
Copy code
name = "John"
age = 30
print(name + age)

위 코드에서 name은 문자열 타입이고 age는 정수 타입입니다. print() 함수는 이 두 값을 함께 출력하려고 하지만, 문자열과 정수는 서로 다른 타입이므로 타입 에러가 발생합니다.

따라서 문자열과 정수를 함께 출력하려면 먼저 정수를 문자열로 변환해야 합니다. 이를 위해서는 str() 함수를 사용하면 됩니다. 다음은 위 코드를 수정하여 문자열과 정수를 함께 출력하는 방법입니다.

python
Copy code
name = "John"
age = 30
print(name + " " + str(age))
위 코드에서 age 변수는 str(age)로 변환하여 문자열로 바꿔주었습니다. 이제 print() 함수는 문자열과 문자열을 함께 출력하므로 정상적으로 출력됩니다.
"""