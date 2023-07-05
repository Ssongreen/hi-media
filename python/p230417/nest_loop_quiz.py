#문제 1 2단에서 9단

for i in range(2,10):
    for v in range(1,10):
        print(f"{i}단 {i}'*'{v}= {i*v}")
print("="*33)
#문제 짝수 구구단
for s in range(2,10,2):
    for x in range(1,10):
        print(f"{s}단 {x}'*'{s}= {s*x}")
print("="*33)
#문제 짝수 max 구구단
for y in range(2,10,2):
    for b in range(1,y+1):
        print(f"{y}'*'{b} = {y*b}")
print("="*33)