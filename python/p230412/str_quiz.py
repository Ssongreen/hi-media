#문제
#문자열에 공백 제거 후 가운데 3자리 숫자 추출
numbering ="a23 -856 - bc321"

numbering = numbering.replace(" ", "")

i = numbering.split("-")[1]
print(i)

# print('|'+ st+'|')
# print('|'+ st.lstrip() +'|')
# print('|'+ st.rstrip() +'|')
# print('|'+ st.strip() +'|')