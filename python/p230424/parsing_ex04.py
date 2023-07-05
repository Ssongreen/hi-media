from bs4 import BeautifulSoup

html ="""

<!DOCTYPE html>
<html lang="kr">
<head>
    <p id="wrap">
        <a class="website" id="naver" href="https://www.naver.com">NAVER</a>
        <a class="website" id="daum" href="https://www.daum.net">DAUM</a>
        <a class="website" id="google" href="https://www.google.com">GOOGLE</a>
    </p>
</head>
<body>
    
</body>
</html>
"""

soup = BeautifulSoup(html, "html.parser")

"""
find() 메서드는 BeautifulSoup 객체에서 가장 먼저 매칭되는 요소를 찾아 반환합니다. 이 메서드는 다음과 같은 매개 변수를 가질 수 있습니다:

name: 찾을 태그의 이름 (문자열), 정규 표현식, 리스트 등으로 지정할 수 있습니다.
attrs: 태그의 속성을 지정하는 딕셔너리입니다.
recursive: 기본적으로 True로 설정되며, 하위 요소에서도 검색할 것인지를 결정합니다.
string: 태그 안에 포함된 문자열 중에서 찾을 문자열을 지정합니다.
kwargs: 다른 속성들도 지정할 수 있습니다.

문법
find(name,attrs,recursive, string, kwargs)
recursive : true(default) - 모든 자손 탐색
            false         - 직계 자손 탐색

"""
#모든 a 추출
#1. 태그 : 모든 a 엘리먼트 추출
a_all_01 = soup.find_all("a")
print(a_all_01)
print(type(a_all_01))
print(len(a_all_01))

#2.1 속성 : class가 website인 엘리먼트 추출
#css 와 python 클래스를 다르다라고 표현하는 것이 class_ 이다
a_all_02 = soup.find_all(class_="website")
print(a_all_02)
#2.2 속성:
a_all_03 = soup.find_all(id="naver")
#id가 있는 모든 것을 다 뽑아 올래
a_all_03 = soup.find_all(id=True)
#a태그를 넣어서 키워드여서 id중에서 a 키워드만 뽑쟈
a_all_03 = soup.find_all("a",id=True)
print(a_all_03)
print(len(a_all_03))

#2.3 속성을 여러개 가능
#문자열로 넣을때는 클래스로 하지만, 변수 취급은 class_ 이다 
#K:V, Key:Value 이다
a_all_04 = soup.find_all(attrs={"class": "website", "id":"naver"})
print(a_all_04)

#3. 태그와 속성
a_all_05 = soup.find_all("a",class_="website")
print(a_all_05)

#4. content로도 엘리멘트 추출이에요
a_all_06 = soup.find_all("a",string="GOOGLE")
print(a_all_06)

## a 하나만 추출
a_one_01 = soup.find("a")
print("a_one_01",a_one_01)

a_one_02 = soup.find(class_="website")
print(a_one_02)

#태그를 꼭넣어야 되용
a_one_03 = soup.find("a", id=True)
print(a_one_03)

p_one = soup.find(id=True)
# 태그는 접근이 가능한 엘리먼트
print(p_one.find_all())