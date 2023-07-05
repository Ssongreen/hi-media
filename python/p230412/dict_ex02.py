
dc = {"이름": "다라", "나이":33,"이름":"보라","주소":"상암동" }
print(dc)
print(len(dc))

data = {"age":55, 1:"하루", 2:"이틀","이름":["홍씨","박씨","이씨"]}
print("data", data)
print("나이", data["age"])
# dict에서는 키를 호출해야 됑 
print("하루", data[1])
print("이름", data["이름"])
#박씨
print("이름", data["이름"][1])
