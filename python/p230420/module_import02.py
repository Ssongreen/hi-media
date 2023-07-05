"""
모듈 읽기
2)  from 모듈명          import 클래스, 함수, 변수
    from 패키지명.모듈명 import 클래스, 함수, 변수
    from 패키지명        import 모듈명
    from 패키지명        import 모듈명 as 별칭

                                            - from 다음 모듈명은 사용할때는 사용하지 않아용
"""

#방법2
from pack.module import value,show,Increment 

# from pack.module import * 

#전역 변수
print(value)

# from module import show

show()


# from module import Increment
# ic = Increment()
# ic.showNumber(7)
Increment().showNumber(5)

# #방법2
# from pack import module 
# # from pack.module import * 

# #전역 변수
# print(module.value)

# # from module import show

# module.show()

# # from module import Increment
# # ic = Increment()
# # ic.showNumber(7)
# module.Increment().showNumber(5)


# #방법2
# from pack import module as md 

# # from pack.module import * 

# #전역 변수
# print(md.value)

# # from module import show

# md.show()

# # from module import Increment
# # ic = Increment()
# # ic.showNumber(7)
# md.Increment().showNumber(5)