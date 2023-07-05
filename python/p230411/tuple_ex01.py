"""
튜플 
-여러 값을 묶어서 하나의 데이터 형태로 관리
-(요소1,요소2,요소3)
-인덱스로 요소에 접근(0부터 시작)
-저장 순서가 보장
-요소의 추가, 삭제, 수정이 불가능능
"""

lt = [1,3,5]
tu = (2,4,6)

print("lt",lt)
print("lt",type(lt))
print("tu",tu)
print("tu",type(tu))

#인덱싱
print("첫번쨰 요소 추출", tu[0])
print("마지막 요소 추출", tu[-1])

#슬라이싱
print("첫번 - > 두번째 요소",tu[:2])

## 연산자 : + 
tu2 = (100,200,300)
print("+ 연산자",tu + tu2)

## 연산자 : * 복사본이에용
print("* 연산자",tu*3)

#[문제] 4 -> 400 교체
# tu.index[1] = "400" 앙되용
# tu.append(500) 없엉용
#del tu[1]              앙되용