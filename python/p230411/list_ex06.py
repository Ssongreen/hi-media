## 리스트 요소 수정

## 인덱싱 ##
## 문법 리스트[idex 위치] = 수정값
data = ["one","two","three","four","five",]
print("요소 수정전 data", data)
data[1] = "둘"
data[2] = ["둘"]
print("요소 수정후 data", data)

#슬라이싱
data[:2] = [1]
#>> 복합 타입만 가능해용
print("슬라이싱 요소로 수정후 data", data)