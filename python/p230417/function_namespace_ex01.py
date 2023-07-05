"""
지역 변수 안에 변수를 찾다가 없으면 전역 변수를 가져 온다

namespace (공간에 이름을 붙인것) 공간을 할애하여, 이름을 붙인다
순서 -> 지역 에서 -> 전역 변수로 넘어간다 
"""

num = 5 # 전역 변수
# 전역 변수 보기
print("globals() >> ", globals())

def change():
    #지역(local namespace)
    # num = 100
    num += 1
    print("지역 변수 안에서 globals() >> ", globals())
    print("함수내에서 ", num)
    print("함수내에서 locals() ", locals())

print(change())

print("num",num)