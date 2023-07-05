"""
논리 연산자
and :교집합(이항)
or  :합집합(이항)
not :여집합(단항)
"""
n1 , n2 = 7, 8
print("and 교집합", n1 > 4 and n1 > 8)
print("or 합집합", n1 > 6 or n2 < 7)
print("not 교집합", not n1 > 6)
print(not 0)
print(not 4)
print(not 0.623)
print(not -4)
print(not n1)
"""
2진수 - > 논리값
0         false
1         ture

논리값 -> 2진수
false     0
true      1

논리값 -> 정수(10)
false     0
true      1
"""