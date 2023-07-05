"""
## 문자열 함수 format

"문자열".format()
"문자열{}".format(값)

"""

apple, banana = 5,7

print('사과가',apple,'개 있어', '바나나는', banana,'개 있어')
print('사과가 %d개 있어 바나나는 %d개 있어'%(apple,banana))
#format 값 사용법
print('사과가 {}개 있어 바나나는 {}개 있어'.format(apple,banana))
#{} 괄호 안에 정수가 들어가 있어용
print('사과가 {0}개 있어 바나나는 {1}개 있어'.format(apple,banana))
print('사과가 {0}개 있어 바나나는 {0}개 있어'.format(apple))

#f문자열 포맷팅 python 3.6 부터 지원
print(f'사과가 {apple}개 있어 바나나는 {banana}개 있어'.format(apple))

fruit = f'사과가 {apple}개 있어 바나나는 {banana}개 있어'.format(apple)

print(fruit)
#사과
print(f"{apple}")
#7자리수 오른쪽 정렬
print(f"{apple:6}")
#자리수에 0이 나온당
print(f"{apple:06}")
#왼쪽 정렬 < 를 넣어줭
print(f"{apple:<6}")
#오른쪽 정렬 >를 넣어줘
print(f"{apple:>6}")
#가운데 정렬
print(f"{apple:^6}")
#가운데 정렬 공백 0
print(f"{apple:0^7}")
#공백안에 @으로
print(f"{apple:@^7}")