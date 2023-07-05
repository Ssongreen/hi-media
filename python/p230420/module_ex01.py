"""
파이썬 모듈(module)은 파이썬 프로그래밍에서 코드의 재사용성을 높이기 위해 사용하는 기능입니다. 모듈은 함수, 클래스, 변수 등의 정의가 포함된 파일입니다. 다른 파일에서 이러한 정의를 불러와 사용할 수 있습니다.

파이썬에서는 기본적으로 많은 모듈이 제공되며, 이러한 모듈을 사용하면 추가적인 작업 없이도 많은 기능을 제공받을 수 있습니다. 모듈을 사용하여 자신만의 코드를 작성할 수도 있습니다.

모듈을 불러오는 방법은 import를 사용하는 것입니다. import문 다음에 모듈 이름을 쓰면 해당 모듈을 불러와 사용할 수 있습니다. 예를 들어, import math를 사용하면 파이썬의 수학 모듈인 math를 불러와 사용할 수 있습니다.

모듈을 사용하여 자신만의 코드를 작성할 때는, 모듈 내에서 정의한 함수나 클래스 등을 다른 파일에서 불러와 사용할 수 있습니다. 이를 통해 코드를 재사용하고, 유지보수를 쉽게 할 수 있습니다.

"""
"""
모듈 읽기
@@방법@@ 

1) import 모듈명
-파이썬 설치 할 때 기본적으로 설치되는 모듈이에요 

2) from 모듈명 import 클래스, 함수, 변수
- from 다음 모듈명은 사용할때는 사용하지 않아용

3)import 모듈명 as 별명

"""
#방법 1
# import random

# print("radom value",random.random())

#방법 2
# from random import random

# print("radom value", random())

#방법 3

# import random as rd

# print("radom value", rd.random())

# 랜덤 값 변경
import random
# print("random.uniform(min, max)",random.uniform(1,99999999))
#정수값
# print("random.randrange(min, max)",random.randrange(1,99999999))
#시작 값이 없으면 0 부터 시작
# print("random.randrange(min, max)",random.randrange(9))

print("random.choice(여러값)",random.choice([2,5,6,7]))