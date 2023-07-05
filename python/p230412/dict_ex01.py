"""
dictionaly 딕션너리 dict

-여러 값을 묶어서 관리 하나의 데이터 형태로 관리 (str, list, tuple, dict, set)
-{key:value, 키:값, 키:값} >> 중 괄호로 묶어용 
-저장 순서가 보장되지 않앙 -> 인덱스를 사용 안해용

"""


ddoddo = {"name":"뚜루뚜루" ,"age":16, "address": "서울시 마포구"}
print("show me",ddoddo)
print("show me",type(ddoddo))
print("show me",len(ddoddo))


#키를 통한 값 추출@
print("show me 이름 보기",ddoddo["name"])
print("show me age 보기",ddoddo["age"])
print("show me address 보기",ddoddo["address"])
#인덱스는 없어용 key를 통해서 찾아가용
# print(ddoddo[0])

#요소 추가
ddoddo["phone"]= "010-4444-5111"
print(ddoddo)
print("show me",ddoddo)
print("show me",len(ddoddo))
# 키 값에 변경
ddoddo["age"] = 100
# 함수로 더하기
ddoddo["age"] += 100
print("show me",ddoddo)

#요소 삭제
del ddoddo["address"]
print(ddoddo)

#요소 추출 : 함수
#get에 키값
print("get 함수 연락처", ddoddo.get("phone"))
#key 값
print("key 연락처", ddoddo["phone"])
#둘 차이점 None : error
print("get 함수 주소", ddoddo.get("address"))
#키가 없을 때 ::: 리턴 값을 원하는 값으로 보여짐
print("get 함수 주소", ddoddo.get("address","주소 없음"))
# print("get 함수 주소", ddoddo["address"])

# 키만 추출 나와라잉
keys = ddoddo.keys()
print("키만 추출" , keys)
print("키만 추출" , type(keys))
print("타입 list로 변경" , list(keys))
#인덱스를 사용 못해용
# print(keys[0])

keys_list = list(keys)
print("타입을 list로",list(keys_list))
print("keys_list", type(keys_list))
print("keys_list 인덱스", keys_list[0])

#값만 나와라잉
values = ddoddo.values()
print("값만 나와",values)

items = ddoddo.items()
print("키와 값을 쌍으로 추출",items)

#in 연산자 in은 type마다 다르게 사용되용
# 키를 통해서 값을 찾아 간영
# 문법 값 in 여러값(type 어느것이든)
print("ddoddo", ddoddo)
print("name" in ddoddo)
print("address" in ddoddo)
#키를 찾고 그 안에 값을 찾는 방식이당 키가 아니기에 false가 나와요 
print("뚜루뚜루" in ddoddo)
#문제 뚜루뚜루 값 존재 여부

print("뚜루뚜루" in ddoddo.values())

#1) 요소 1개 추가 
ddoddo.update({"주소":"서울시 강남구쓰"})
print("show me this address",ddoddo)

#2) 요소 여러개 추가쓰
ddoddo.update({"취미":"달리기","특기":"데쳐왔다 두룹두룹"})
print("요소 여러개 추가쓰", ddoddo)

#3) 존재하는 키 값 변경
ddoddo.update({"age":20})
print("변경쓰 ", ddoddo)

#4)다 지울꺼야
ddoddo.clear()
print("없어졋어",ddoddo)