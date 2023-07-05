four = 4

print("four >>",four)
print("four에 저장된 주소 >>", id(four))

lt = [2,4,6]
print("lt[1] ?" ,lt[1])
print("lt[1]에 저장된 주소 ?" ,id(lt[1]))

tu = (9,2,3,4)
print("tu[-1] >>",tu[-1])
print("tu[-1]에 저장된 주소 >>",id(tu[-1]))

# 리스트 요소 수정
lt[1] = 9
print("lt[1] ?" ,lt[1])
print("lt[1]에 저장된 주소 ?" ,id(lt[1]))

print("상수 9의 주소 ", id(9))
print("tu[0] >>",tu[0])
print("tu[0]에 저장된 주소 >>",id(tu[0]))