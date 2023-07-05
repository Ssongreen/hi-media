import pandas

url = "https://finance.naver.com/"

table = pandas.read_html(url,encoding="cp949")
# print(type(table))
# print(len(table))
# print(table[1]) #인덱스로 상항가를 추출 한다. 

top = table[0]
print(type(top))# dataframe 타입은 인덱스 