'''
[문제] 리스트 변수 list_data의 요소를 writeText.txt 파일에 쓰시오.
- writeText.txt는 새 파일로 생성
- writeText.txt가 이미 존재한다면, 에러 발생되도록 하고 예외처리
- 에러가 발생하면, '파일이 이미 존재합니다.' 출력
- with문 사용

<< writeText.txt >>===
1. one
2. two
3. three
4. four
======================
'''

list_data = ['one', 'two', 'three', 'four']

## open 함수
## 쓰기 모드 : a - 추가, w - 덮어쓰기, x - 파일이 존재하지 않을 때, 파일 생성
file_path = "D:\\web\\python\\p230420\\writeText.txt"

try:
    with open(file_path, 'x') as file:
        for idx, data in enumerate(list_data,1):
            file.write(f"{idx}.{data}\n")
except:
    print("파일이 이미 존재합니당")

print("프로그램 종료") 