"""
re 모듈은 파이썬에서 정규표현식을 사용하기 위한 내장 모듈입니다. 정규표현식은 문자열에서 특정한 패턴을 찾거나, 변경하거나, 추출하는데 매우 유용합니다.

re 모듈에서 가장 자주 사용되는 함수와 메소드는 다음과 같습니다.

re.compile(pattern): 정규표현식 패턴을 컴파일하여 객체를 반환합니다. 이후 매칭 검색에 사용됩니다.

re.match(pattern, string): 문자열의 시작부터 정규표현식 패턴과 매칭되는지 확인합니다.

re.search(pattern, string): 문자열에서 첫 번째로 정규표현식 패턴과 매칭되는 부분을 검색합니다.

re.findall(pattern, string): 문자열에서 정규표현식 패턴과 매칭되는 모든 부분을 찾아 리스트로 반환합니다.

re.finditer(pattern, string): 문자열에서 정규표현식 패턴과 매칭되는 모든 부분을 찾아 반복 가능한 객체로 반환합니다.

re.sub(pattern, repl, string): 문자열에서 정규표현식 패턴과 매칭되는 부분을 대체 문자열(repl)로 변경합니다.

re.split(pattern, string): 문자열에서 정규표현식 패턴을 기준으로 분리하여 리스트로 반환합니다.

이 외에도 re 모듈은 다양한 메소드와 함수를 제공합니다. 정규표현식을 사용하면 문자열을 처리하는데 있어서 매우 강력한 도구가 되며, 파이썬에서 re 모듈을 사용하면 정규표현식을 쉽게 사용할 수 있습니다.
"""

'''
[정규 표현식] ===============================================
<< 문법 >>
import re

변수 = re.compile('정규 표현식')
변수.함수명('문자열')

<< 함수 >>
match()     : 문자열 첫번째에서만 추출
search()    : 문자열 전체를 기준으로 처음 검색된 데이터 추출
findall()   : 일치하는 모든 데이터를 리스트로 리턴
finditer()  : 일치하는 모든 데이터를 객체로 리턴

<< 메타문자 >>
- 메타문자  : 원래 문자가 갖는 의미가 아닌 특별한 용도로 사용하는 문자

- 반복 (메타 문자, 기호)
    *       : 0개 이상
    +       : 1개 이상
    {n}     : n개
    {m,n}   : m~n개
    ?       : 0~1개
    .       : 한자리, 모든 문자(\n은 제외)
            :[.] 대가로 안에 점은 문자 점이다.    
    ^       :^ 다음 문자 시작하는 문자열  
-문자 표현식 
    \w          :[a-zA-Z0-9]
    \W(capatil) :[^a-zA-Z0-9] ^는 부정을 의미해용
    \d          :[0-9]
    \D          :[^0-9]
    \s          :[\t(수평태그)\n\r\f\v]
    \S          :[^\t\n\r\f\v]
[문제]
1) 단어 추출        : re.compile('[a-zA-Z0-9]+') #모든 붙어있는 글자 숫자 찾아 준다.
2) 숫자 추출        : re.compile('[0-9]+') 
3) 숫자+문자 추출   : re.compile('[0-9]+[a-z]+')
4) 문자+숫자 추출   : re.compile('[a-z]+[0-9]+')
5) 한글 추출        : 
=========================================================================

'''
import re

data = '''abc mart food2 
10  dayt 퇴근! 야호@@@ at'''

#[] 가로는 or라는 의미를 담고 있어요
# cp = re.compile('[가-힣]+') #한글의 모든 글자를 말함.
# cp = re.compile('\w+') 
cp = re.compile('\d+') 
cp = re.compile('\s+') 
cp = re.compile('a.t') # .은 자리를 의미해용
cp = re.compile('^a') # a로 시작하는 문자열 중
cp = re.compile('^안') # 안 으로로 시작하는 문자열 중

# print('1) match :', cp.match(data))
# print('2) search :', cp.search(data))
print('3) findall :', cp.findall(data))
# print('4) finditer :', cp.finditer(data))

# for info in cp.finditer(data):
#     print(info)