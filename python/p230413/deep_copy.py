even = [2,4,6,8]
print("even[1]",even[1])

# 얕은 복사
"""
카피 변수를 만들어서 원본 변수에 영향을 주지 않으려면, 카피 변수에 원본 변수의 값을 복사해야 합니다. 이를 "얕은 복사(shallow copy)"라고 합니다.
파이썬에서는 리스트, 딕셔너리 등의 컬렉션 자료형에서도 동일한 문제가 발생합니다. 이 경우에는 copy 모듈을 사용하여 복사하면 됩니다.
다른 컬렉션 자료형에서도 copy() 메소드를 호출하여 얕은 복사를 할 수 있습니다. 단, 내부적으로 참조하는 객체에 대해서는 여전히 얕은 복사가 적용되므로 주의가 필요합니다.
"""
even_copy = even
print("\n 얕은 카피햇어?", even_copy)
print("original ?", even)
print("original id ?", id(even))
print("original id ? copy", id(even_copy))

even_copy[1] = 10
print("카피가 바뀌었어?",even_copy)
print("original 도 바뀌였어? ",even)

#깊은 복사
"""
깊은 복사(deep copy)는 원본 객체와 완전히 별개의 객체를 생성하면서 해당 객체 내부에 있는 모든 요소들을 재귀적으로 복사하는 것을 말합니다. 즉, 카피 변수와 원본 변수가 서로 다른 메모리 주소를 가리키며, 카피 변수의 값이 변경되어도 원본 변수에는 영향을 주지 않습니다.

파이썬에서는 copy 모듈의 deepcopy() 함수를 사용하여 깊은 복사를 수행할 수 있습니다. 이 함수는 복사 대상 객체의 내부 구조를 모두 분석하여, 객체의 모든 요소를 새로운 객체로 복사합니다.

"""
#1) 함수 :copy 
even_deep_copy = even.copy()
print("\n깊은 복사 했어?")
print("원본 복사:함수 >> " , even)
print(" 깊은 복사:함수 >> " , even_deep_copy)
print(" 깊은 복사 주소래 :함수 >> " , id(even_deep_copy))
print("원본 복사 주소래 :함수 >> " , id(even))

even_deep_copy[-1] = 9 
print("원본 복사:함수 >> " , even)
print(" 깊은 복사:함수 >> " , even_deep_copy)

# 2) 슬라이싱
print("\n 슬라이싱 이래")
even_slicing = even[:]
print("원본:슬라이싱 >> " , even)
print("슬라이싱 >> " , even_slicing)
print("원본:슬라이싱 >> " , id(even))
print("슬라이싱 >> " , id(even_slicing))