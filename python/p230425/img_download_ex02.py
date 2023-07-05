"""
"request"는 Python에서 HTTP 요청을 보내는 데 사용되는 내장 모듈입니다. 이 모듈은 간단하고 쉬운 방법으로 웹 서버에 요청을 보내고, 응답을 받을 수 있습니다.

urlopen() 함수는 URL을 열고 HTTP 응답을 받아들이는 객체를 반환합니다. 반환된 객체를 사용하여 응답 본문에 액세스하고, 헤더를 읽을 수 있습니다. 응답은 메모리에 저장되며, 이를 분석하고 처리할 수 있습니다.

urlretrieve() 함수는 지정된 URL에서 파일을 다운로드하고 지정된 로컬 파일에 저장합니다. 이 함수는 다운로드된 파일의 이름과 함께 로컬 파일 경로를 인수로 받습니다. 이 함수는 파일 다운로드와 저장을 모두 수행하므로 편리합니다.

예를 들어, 다음과 같이 사용할 수 있습니다.
"""

"""
[urllib] package 
request 라이블러리, 모듈
    urlopen() : 요청하면 메모리에 기록
    urlretrive() 요청한 것을 파일로 바로 저장
"""
"""
#방법 1
# from urllib import request 
#방법 2
# from urllib.request import urlretrieve
#방법3
import urllib.request
"""
import urllib.request

import os

img_url = r"https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2F20140219_283%2Fartboynhw_13928087644258DPh4_JPEG%2FP20140219_030449000_E0FCE138-8697-422C-8B7D-975022AEA067.PNG&type=sc960_832"
file_path = os.path.join(os.path.dirname(__file__),"Duck4.jpg")
print("경로",__file__)
#방법 1
# request.urlretrieve(img_url, file_path)
#방법 2
# urlretrieve(img_url, file_path)
#방법 3
urllib.request.urlretrieve(img_url, file_path)
print("이미지 다운로드 완료")