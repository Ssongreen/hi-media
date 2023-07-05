# 문제 1 
#구구단 2단 하기
for r in range(1,10):
    print(f"2*{r}={2*r}",end=" ")

print("end")

#문제 2
#데이터가 많아도 되도록 
# 60점 이상인 학생의 점수와 번호 출력
# 1번 학생은 90점으로 합격입니다. 
math = [90, 45, 60, 75, 50]

# for i in range(len(math)):
#     if math[i] >= 60:
#         print(f"{i+1}번 학생은 {math[i]}점으로 합격입니다.")   

print("="*33)

#방법 1
# idx = 1
# for m in math:
#     if m >= 60:
#         print(f"{idx}번 학생은 {m}점으로 합격")
#     idx +=1

#방법 2-1         enumerate는 자동 증가 값이면서 값을 tuple로 출력해용 !!끝 값은 필요 없어요, 시작값만 넣어주세용 두번째에다가 넣기!
for r,m in enumerate(math, 1):
    if m >= 60:
        print(f"{r}번 학생은 {m}점으로 합격")
print("="*33)        
#방법 2-2
for s in enumerate(math, 1):
    if s[1] >= 60:
        print(f"{s[1]}번 학생은 {s}점으로 합격")


#문제 3 60점 이상인 학생의 이름과 점수 출력

# 홍짱은 학생은 90점으로 합격입니다.
#키 : value 
math = {"홍짱":90, "박씨":45, "이미자":60, "이길동":75,"하하":50}
print("="*33)

for r in math.keys():
    if math[r] >= 60:
        print(f"{r} 학생은 {math[r]}점으로 합격입니다.")   
print("="*33)


for key in math:
    if math[key] >= 60:
        print(f"{key} 학생은 {math[key]} 점 이에용")

print("="*33)
for s,v in math.items():
    if v >= 60:
        print(f"{s} 학생은 {v} 점으로 합격")

for m in math.items():
    if m[1] >= 60:
        print(f"{m[0]} 학생은 {m[1]} 점으로 합격")

