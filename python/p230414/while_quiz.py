# # 몇번째 출력, 누적합 , 입력된 값 모두
# sum = 0
# index = 1
# while(index<6):
#     num = int(input(f"{num}1이상 정수 값을 입력해주세요"))
#     sum = sum+num
#     index += 1
# print("누적합은",sum)

# sum = 0
index = 1
li = []
while index < 6:
    num = int(input(f"{index}번째 1이상 정수 값을 입력해주세요: "))
    if num <0:
        pass
    else:
        # sum = sum + num
        index += 1
        li.append(num)
        #li += [num]
# print("누적합은", sum)
print("누적합은", sum(li))
print(li)



# list = []
# total = 0
# i = 1
# while True:
#     number = int(input(f"{i}번째 1이상 정수 값을 입력하세용"))
#     if number < 0:
#         pass
#     elif i < 5:
#         total = total + number
#         i +=1
#         list +=[number]
#     else:
#         break
# print("누적합",total)
# print(list)