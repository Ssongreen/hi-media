
# 문제 

number = [100,200,100,500,200,600,300]

#1 중복된 요소를 제거 후 오름차순 정렬
number = sorted(set(number))
print(number)
print(type(number))

#2) 요소 300 다음에 400 추가 
number.insert(number.index(300)+1, 400)

print(number)
