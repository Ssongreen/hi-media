##[문제] hi 요소를 찾아서 good으로 변경

data = [100, 200, "hi", "hello", 300]
#방법 1
# index = data.index("hi")
# data[index] = "good"
# print("data >>", data)

#방법 2
data = [100, 200, "hi", "hello", 300]
data[data.index("hi")] = "good"
print("data >>>",data)