"""
집합 set 
-여러값을 묶어서 하나의 데이터 형태로 관리
-{요소1,요소2,요소3}
-저장 순서 보장되지 않음 = > 인덱스 사용 불가능
-교집합 , 합집합, 차집합 
-중복된 값을 저장 불가능 (중복값 제외)
-집합은 인덱스로 접근 해서는 앙되용
-오름차순으로 정렬되어 있는 것이 아니에용
"""

seting = {4,1,5,4,8,2,1}
print("길이 " , len(seting))
print(seting)
# print(seting[1])

#함수
# 요소 추가 1개 추가
#문법 집합.add(값)

seting.add(111)
print("111 추가했져 ?" , seting)

seting.add(4)
print("4 추가 후 setting" ,seting)
print("4 추가 후 setting" ,len(seting))

#요소 여러개 추가
#문법 집합.update(여러값) 집합 튜플 리스트
#clean code book에서 나오는 가독성 높이는 코드 알려쥼

seting.update([2, 3, 9, 1])
print("여러 요소 추가 후 ", seting)

#특정요소 제거
#문법 집합 .remove(요소)
seting.remove(2)
print("요소 2 제거 후" , seting)