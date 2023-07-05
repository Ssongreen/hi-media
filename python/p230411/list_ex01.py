
"""
list

-여러 값을 묶어서 관리 (str, list, tuple, dict, set)
-[요소1, 요소2, 요소3] >> 대가로로 묶어용 
-index로 통해 요소에 접근 (0부터 시작)
-저장 순서가 보장  
"""

num = 5

data = [2,4,6,8,10]
print("date ??? ? ? ?" , data)
print("date ??? ? ? ?" , type(data))

#인덱싱 : 하나의 요소 추출
print("첫번째 요소 추출" , data[0])
print("첫번째 요소 추출: 자료형 " , type(data[0]))

print("2번째 추출", data[2])
#마지막 요소 뽑기 "음수" 인덱스 가능
print("오른쪽 기준으로 마지막 ", data[-1])

#슬라이싱 : 연속된 여러 개 요소 추출 data[시작:끝]
#끝 값을 끝값 제외하고 보여줘용 
print("시작 끝이 있어용", data[0:-1])
print("첫번째 ~ 두번째 요소 추출: 자료형 " , type(data[0:2]))
#끝 값을 생략하면 끝까지 이에용
print("두번 째 마지막", data[1:])
print(" 끝값 전까지", data[:-1])
print("전체", data[:])
print("data[:1] ??", data[:1])

print("data[1:]",data[::-1])