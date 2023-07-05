"""
문제 gugudan 파일 마지막 위치에 리스트 변수 data 추가 
요소 1개가 한라인

"""

data = ["one","two","three"]

#방법 1
# with open("D:\web\python\p230418\gugudan.txt","a",encoding="UTF-8") as gugudan:
#     for s in data:
#         gugudan.write(s+"\n")

# 방법2
with open("D:\web\python\p230418\gugudan.txt", "a", encoding="UTF-8") as gugudan:
    gugudan.write('\n'.join(data) + '\n')

with open("D:\web\python\p230418\gugudan.txt", "r", encoding="UTF-8") as gugudan:
    lines = gugudan.read()
    print(lines)
