"""
(10진수)
정수 -> 논리
0         false
0이외     true
"""

## 정수 - > 논리
print("정수 0의 논리값 ", bool(0))
print("정수 0의 논리값 ", bool(1))
print("정수 0의 논리값 ", bool(5))
print("정수 0의 논리값 ", bool(-5))

#문자열 - >논리
print("문자열 hi의 논리값 >> ", bool("hi"))
print("빈 문자열 hi의 논리값 >> ", bool(""))

# 리스트 - > 논리
print("리스트 [2,4]의 논리값",bool([2,4]))
print("빈 리스트의 논리값",bool())