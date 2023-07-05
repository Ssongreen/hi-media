## 리스트 함수

numbers = [5,4,1,3,177,55,346]

#정렬 (오름차순)
## 문법 : 리스트.sort()
# print("정렬맨 전>>" , numbers)
# numbers.sort()
# print("정렬맨 hoho" , numbers)


alphabet =["j","e","u","a","r","w",]
print("정렬맨쓰",alphabet)
alphabet.sort()
print("정렬맨쓰",alphabet)

alphabet1 =["jujusecret","edo","unn","aile","rew","ww",]
print("정렬맨쓰",alphabet1)
alphabet1.sort()
print("정렬맨쓰",alphabet1)

Korph =["바나","가나","다라","도롱","짜라","크크",]
print("정렬맨쓰",Korph)
Korph.sort()
print("정렬맨쓰",Korph)


#정렬(역순)
## 문법 : 리스트.reverse()
print("정렬맨 전>>" , numbers)
numbers.reverse()
print("정렬맨 hoho" , numbers)

#정렬 (내림차순)
## 문법 : 리스트.sort(reverse=false) >> 오름 차순
## 문법 : 리스트.sort(reverse=ture) >> 내림 차순
numbers.sort(reverse=True)
print("내림차순 정렬 후 number",numbers)
