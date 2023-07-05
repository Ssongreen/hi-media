"""
모듈 읽기
@@방법@@ 

1) import 모듈명
-파이썬 설치 할 때 기본적으로 설치되는 모듈이에요 
import 패키지명.모듈명

"""


#방법 1

import pack.module
#알리 아스 써용
module = pack.module
print("values", pack.module.value)
module.show()
ic = module.Increment()
ic.showNumber(5)
module.Increment().showNumber(77)

#import 된 파일에 뭐가 있는지 ?
print(dir(module))