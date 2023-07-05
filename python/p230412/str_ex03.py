#문자열 함수
st = "  Alla  "
# 문자열의 길이
print("st 길이 ", len(st))

#문자열에서 특정 문자의 개수

#문법 : 문자열.count(문자)
print("l의 개수>>", st.count("l"))
#문자열의 길이 
print("al의 개수",st.count("al"))

#@ 제거 문자 사이에 공백은 지워지지 않아용
## 공백 
## 왼쪽       :문자열.lstrip()
## 오른쪽     :문자열.rstrip()
## 양쪽       :문자열.strip()
print('|'+ st+'|')
print('|'+ st.lstrip() +'|')
print('|'+ st.rstrip() +'|')
print('|'+ st.strip() +'|')

#대소문자 변경
#대문자 변경 : 문자열.upper()
#소문자 변경 : 문자열.lower()
print("대문자 ", st.upper())
print("소문자 ", st.lower())

#특정 문자의 인덱스(대소문자 구분)
# 문자열.find(찾고자 하는 문자열)
# 문자열.index(찾고자 하는 문자열)
# 위치 인덱스 리턴해줘용
print("a찾아줘" , st.find("a"))
print("l찾아줘" , st.index("l"))
#find는 없어서 -1 를 리턴해서 없다는 의미에용
print("e찾아줘" , st.find("e"))
#index는 error로 알려줘 
# print("e찾아줘" , st.index("e"))

print("Al를 찾아라 ", st.find("Al"))

##특정 문자를 변경
# 문법: 문자열.replace("old","new")
print("복사본",st.replace("A", "U"))
print("원본",st)
#문자열 쪼개기
#문법 : 문자열.split(나누고자 하는 문자)
print(st.split("l"))
#특정 문자 추가
#문법 :'추가할 문자'.join(문자열)
#문법 :'추가할 문자'.join(문자열)
print("@_@",st.join(st))
