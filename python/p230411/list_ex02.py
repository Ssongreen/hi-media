# 인덱싱, 슬라이싱 2 

data = [2, 3.5, "hello"]
data1 = [2, 3.5, [7,6,2], "hello"]
print("show me this ", data)
print("리스트의 변수 data 길이", len(data1))


#인덱싱은 데이터의 자료형을 유지함
print("data[1] ", data[1])
print("data[1] ", type(data[1]))
print("date[2]", data[2])
print("date1[2][-1]", data1[2][-2])

#ie 
print([100,200,400][1])

#슬라이싱 
print("data[:2]",data[:2])
print("data[:2]", type(data[:2]))
