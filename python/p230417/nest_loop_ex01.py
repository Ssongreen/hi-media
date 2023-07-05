# 중첩 반복문

for i in range(1, 4):
    print(f"out loop : {i}번 실행")
    for j in range(1,4):
        print(f"\tInner Loop {j}번 실행")
print(f"outer loop : {j}")

#한번 for문에서 쓰이면 계속 쓰일 수 있어용