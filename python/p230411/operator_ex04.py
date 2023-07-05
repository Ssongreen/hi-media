"""
조건 연산자

true 일때 if 조건 else false 일때 

"""


n1, n2 = 7670,32151
print(" n1이 크다" if n1 > n2 else "n1 작다")
print(" n1이 크다" if n1 < n2 else "n1 작다")


##문제 

## n1 과 n2를 비교 해서 큰 값을 result 저장

result = n1 if n1 > n2 else n2 
print(result)