"""
readline()은 파일에서 한 줄씩 데이터를 읽어오는 함수입니다. 이 함수는 파일 객체의 메서드 중 하나로, 파일 내용을 읽어올 때 한 번에 한 줄씩 읽어옵니다. 파일의 끝에 도달하면 빈 문자열('')을 반환합니다.

예를 들어, 다음과 같이 파일을 열고 readline() 함수를 사용하여 파일에서 한 줄씩 데이터를 읽어올 수 있습니다.

with open('file.txt', 'r') as f:
    line1 = f.readline()
    line2 = f.readline()
    line3 = f.readline()
    
print(line1)
print(line2)
print(line3)
위 코드에서 file.txt 파일의 첫 번째 줄, 두 번째 줄, 세 번째 줄의 내용을 각각 line1, line2, line3 변수에 저장하고 출력합니다.

"""
"""
파일 읽기
1.open 함수 : 모드 - r
2.readline 함수, readlines(),read()
3.close 함수
"""
#open 할때 , 모드 와 함수는 일치 해야 된당

#1. open함수
gugudan = open("D:\web\python\p230418\gugudan.txt","r",encoding="UTF-8")

#2. 읽기 함수
# 불러 올때 한 코드 라인을 가지고 온당
# line1 = gugudan.readline()
# all = gugudan.read()
# print("⸜(*ˊᗜˋ*)⸝",line1 ,end=" ")
# print("all? \n", all)

lines = gugudan.readlines()

for s in lines:
    print(s,end=" ")




#타입은 문자열로 온당
# print("type ?", type(line1))

#3.close 함수
gugudan.close()