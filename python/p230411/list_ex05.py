## 리스트 함수2

data = ["one","two","three","four","six"]

## 특정 요소의 인덱스
## 문법: 리스트.index(요소)

print("요소 two의 인덱승 >>" , data.index("two"))
# print("요소 two의 인덱승 >>" , data.index("ten"))

#요소 추가 : 마지막 위치
# 문법 : 리스트.append(값)
print("seven 추가 전 요소 수 ",len(data))
data.append("seven")
print("seven 추가 후 요소 수 ",len(data))
print("seven 추가 후 요소 수 ",(data))

#요소 추가 : 특정 위치
# 문법 : 리스트.insert(인덱스, 값) 옆으로 이동 해용 하나 증가한 상태롱
print("five 추가 전 요소 수 ",len(data))
data.insert(4,"five")
print("five 추가 후 요소 수 ",len(data))
print("five 추가 후 요소 수 ",(data))

#요소 추가 : 여러 요소 추가
#문법 : 리스트.extend(리스트)
even = [2,4]
## 문제 + 연산자를 사용하여 extend와 같은 결과가 되도록
# data.extend(even)
# data = data+even
data += even
print("추가 했져 ?",data)

##요소 삭제
## 문법 : 리스트.remove(요소)
data.remove(2)
print("2 삭제 해줘", data)
element = data.remove("one")
print("remove 뭐 삭제 ? " , element)
##요소 삭제
## 문법 :리스트.pop()
## 문법 : 리스트.pop(리스트)
element = data.pop()
print("마지막 요소 삭제 해줘", data)
print("삭제된 요소 ", element)
data.pop(1)
print("idex의 요소 1 삭제 해줘 ", data)

##요소 삭제
##문법 :del 리스트[인덱스]
## 여러개를 삭제 가능 인덱싱, 슬라이싱 둘다 가능
del data[0]
print("del data[0] 로 삭제 했어" , data)
del data[-1:]
print("인덱스 -1에서 끝까지 데이터", data)
##특정 요소 개수
##문법 :리스트.count(요소)
six_count = data.count("six")
print("six 몇개야 ???", six_count)

