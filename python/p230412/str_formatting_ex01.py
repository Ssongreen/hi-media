"""
@@문자열 포맷 코드@@

%s 문자열(String)
%c 문자
%d 정수
%f 실수
%% 문자 %
"""

apple, banana = 5,7
print('사과가',apple,'개 있어', '바나나는', banana,'개 있어')
print('사과가 %d개 있어 바나나는 %d개 있어'%(apple,banana))

fm = '사과가 %d개 있어 바나나는 %d개 있어'%(apple,banana)
print("변수 지정하공vvv",fm)

#출력되는 형식이 하나 일때 괄호를 지울 수 있어
print("%d"%apple)
#출력 할 때 자리수를 지정할 수 잇어(4자리 중에 한자리만 차지 왼쪽 정렬로 공백을 만든다)
print("%4d"%apple)
#자리를 정하면 왼쪽 정렬
print("%-4d"%apple)
#양수기호 + 가 붙어서 나와용
print("%+4d"%apple)
#합쳐서
print("%+-4d"%apple)
#0으로 공백을 채워용
print("%04d"%apple)

num = 12356
print("%d"%num)
print("%5d"%num)
print("%7d"%num)

num = -5
print("%d"%num)
print("%+d"%num)

fo = 2.34
print("실수는 %f인데용"%fo)
#소수 자리수를 .으로 붙여서 보일 수 있어용
print("실수는 %.4f인데용"%fo)
print("실수는 %.3f인데용"%fo)
print("실수는 %.7f인데용"%fo)
print('%f'%fo)
# 전체 자리수 5.소수 자리수2
print('%5.2f'%fo)

#문자 : %c

c1, c2 = "A",'a'
c1, c2 = 562, 346 #문자로 아스키코드로 나와용
# 서식 문자로 c1:@ 표현하세용  c2 : @ 표현하세요 꼭 %()를 괄호를 넣어주세요
print("c1:%c,c2:%c"%(c1,c2))

#문자열 %s
s1 ="Arrrees"
print("문자열 s1에 저장된 값은 %s입니다"%s1)
print("문자열 c1에 저장된 값은 %s입니다"%c1)
## 문자열 :%s
success =93
#퍼센트 뒤에 문자열이에용
print("성공률은 %d%%입니다"%success)
print("성공률은", success,"입니다")