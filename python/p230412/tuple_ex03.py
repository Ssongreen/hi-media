even = (2,4,6,8)
print("튜플 변수 even",even)
print("타입 알려줭",type(even))

even = list(even)
even.sort()
print("변수 even",even)
print("타입 알려줭",type(even))

even[2] = 100 
print("인덱스 2의 값을 100으로 변경 even",even)

even = tuple(even)
print("변수 even",even)
print("타입 알려줭",type(even))
