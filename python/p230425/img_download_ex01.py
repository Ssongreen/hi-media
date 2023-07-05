"""
[urllib] package 
request 라이블러리, 모듈
    urlopen() : 요청하면 메모리에 기록
    urlretrive() 요청한 것을 파일로 바로 저장
"""
"""
이 코드는 인터넷에서 이미지를 다운로드하고 지정된 파일 경로에 저장하는 간단한 예제입니다.

먼저 urllib.request 모듈과 os 모듈을 임포트합니다. os 모듈은 파일 경로를 조작하는 데 사용됩니다.

img_url 변수에는 다운로드할 이미지의 URL이 지정됩니다.

file_path 변수는 현재 스크립트 파일의 경로와 "Golden.jpg" 파일 이름을 결합하여 이미지를 저장할 파일의 전체 경로를 생성합니다.

urllib.request.urlopen 함수를 사용하여 이미지 URL에서 요청을 보내고 응답을 받습니다. read() 메소드를 사용하여 응답 본문을 읽습니다. 이제 이미지가 request_img 변수에 저장됩니다.

open() 함수를 사용하여 파일을 열고, "wb"(바이너리 쓰기) 모드로 이미지 파일을 작성합니다. 그 다음, write() 메소드를 사용하여 이미지 바이트를 파일에 작성합니다.

마지막으로, 이미지 파일을 닫고 "이미지 다운 로드 완료" 메시지를 출력합니다.

따라서 이 코드는 인터넷에서 이미지를 다운로드하고, 해당 이미지를 지정된 파일 경로에 저장합니다.
"""
import urllib.request as request
import os

img_url = r"https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA5MDVfMTMg%2FMDAxNjYyMzY5MTcwNDI1.dkMGLAkJifdBsUkGfgVrbeBO6MYzoswyouAKqu417Rcg.sCSsKsyMkintUPgYWs55eLIXQf52dxluh8y3VL6u3kUg.JPEG.egfjp1217%2F%25BF%25CF1.jpg&type=sc960_832"

file_path = os.path.join(os.path.dirname(__file__), "Golden.jpg")

#1. 이미지 요청
request_img = request.urlopen(img_url).read()

#2. open 함수
#이미지는 바이너리 모드이다. wb,bw 는 쓰기 작업하는 바이너리이다. 
img = open(file_path, "wb")
#3. write 함수
img.write(request_img)

#4. close 함수
img.close()
print("이미지 다운 로드 완료")