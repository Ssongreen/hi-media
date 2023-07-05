"""
파이썬에서 with문은 파일이나 네트워크 연결과 같은 리소스를 사용한 후 반드시 해제(close)해야 하는 경우에 유용하게 사용됩니다. with문은 이러한 리소스들을 열고(open) 사용한 후에 자동으로 닫아줍니다.

예를 들어, 파일을 열어서 내용을 읽은 후 파일을 닫아야 하는 경우, 일반적으로는 다음과 같은 코드를 작성합니다.

f = open('file.txt', 'r')
contents = f.read()
f.close()
하지만 이렇게 작성하면 파일을 닫지 않는 실수를 할 가능성이 있습니다. 이를 방지하기 위해 with문을 사용하면 파일을 열고 사용한 후 자동으로 닫아줍니다.

with open('file.txt', 'r') as f:
    contents = f.read()
with문에서 파일 객체를 as 키워드를 이용하여 변수에 할당하면, with 블록 안에서만 해당 변수를 사용할 수 있습니다. 블록을 벗어나면 파일 객체는 자동으로 닫힙니다. 이렇게 함으로써 파일을 닫지 않는 실수를 방지할 수 있습니다.
"""
"""
!! with는 open이 다 진행되면 with문이 실행 되며, close로 된다.
문법 
with open() as 변수:
    명령어
    명령어
"""
# close() 함수를 호출하기 전에 이미 with 함수에 넘어가기 전에
with open("D:\web\python\p230418\gugudan.txt","r",encoding="UTF-8") as gugudan:
    lines = gugudan.read()
    print(lines[:8])
    
print("프로그램 종료")


