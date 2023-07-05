# 문제 while 문  이용하여 1 -100 출력

num = 0

while num <= 100:
    num +=1
    if num == 101:
        break
    print(num, end=" ")

print("1번 끝났어유")

#2단을 출력 하시옹
# 출력 형태

num = 1   
while num < 10:
    # print(2,"*" ,num,"=",2*num , end=" ")
    print(f"2*{num}={2*num}", end=" ")
    num+=1
print("2번 끝났어유")

#1 + 10 누적합 
#출력 형태 1-10 누적합 55
#자바 version
summ =0
num = 1
while num <= 4523:
    summ += num
    num += 1

print("1부터10 까지의 정수의 합은", summ)
# python 문법쓰 파이썬은 간결하고 감각적이고 보기 쉽네에에
# range로 리스트 여러값을 펼쳐줘용
print(range(1, 11))                 # (첫값, 끝값(하나전 까지)) 펼쳐줘요요
print("누적합 ", sum(range(1,115)))  # sum 더하기 값


# 리스트 변수 number의 모든 요소의 합을 출력
number = [2,5,9,7,11]
summ=0
i=0
while i < len(number):
    summ = summ+number[i]
    i += 1
print("리스트 안의 값 덧셈 ", summ)

#방법 2
print("전체합", sum(number))

total = 0
for n in number:
    total = total +n
print("전체값 ", total)