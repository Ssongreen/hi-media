"""
1. open 함수 : 모드 - w, a
Python에서 파일 쓰기를 위해서는 open() 함수를 사용하여 파일을 열고, write() 함수를 사용하여 파일에 내용을 씁니다.

아래는 간단한 예시입니다.
def write_to_file(filename, content):
    with open(filename, 'w') as f:
        f.write(content)
이 함수는 filename으로 지정한 파일을 쓰기 모드('w')로 열고, content 내용을 파일에 씁니다.

with 구문을 사용하면 파일을 자동으로 닫을 수 있습니다.

이 함수를 호출할 때 filename과 content 인자를 전달하여 파일 쓰기를 수행할 수 있습니다. 예를 들어, 다음과 같이 호출할 수 있습니다.

python
Copy code
write_to_file('example.txt', 'This is an example.')
이 코드는 example.txt 파일을 생성하고, 파일에 This is an example. 내용을 씁니다.

2. write 함수 :
3. close 함수 : 

"""

#1.open 함수
# open("경로/파일명.확장자 or 파일명.확장자", "모드")
file = open("new.txt","w")

#2.write 함수

#3.close 함수
file.close
print("프로그램 종료")