## 문제

ex = (2,4,(1,3),[10,20,30])

##1) 튜플 변수 ex 길이
print(len(ex))


## 2) 튜플 변수 ex의 마지막 요소에 40을 추가 마지막

# ex = list(ex)
# print(type(ex))
# ex[3] = ex[3] + [40] 
# print(ex)
# ex = tuple(ex)
# print(type(ex))

print(ex[-1].append(40))
print("ex>>?", ex)