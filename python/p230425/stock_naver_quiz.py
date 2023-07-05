"""
문제 naver 증권 페이지에서 국내 증시 탭의 테이블을 stock.csv 파일에 저장해용

"""
"""
CSV는 Comma Separated Values의 약어로, 쉼표로 구분된 값(데이터)들의 집합을 의미합니다. 일반적으로 텍스트 파일로 사용되며, 각 행은 개별 데이터 레코드를 나타내고, 쉼표(또는 다른 구분자)를 사용하여 열을 구분합니다. 이러한 형식은 데이터를 다른 시스템에서 쉽게 읽고 처리할 수 있도록 합니다. CSV 파일은 스프레드시트 프로그램(예: Microsoft Excel, Google Sheets 등)에서 쉽게 열어서 데이터를 볼 수 있습니다.
"""

# -*- coding: euc-kr -*-
import pandas as pd
import os

# 코드 작성
url = "https://finance.naver.com/sise/lastsearch2.naver"
table = pd.read_html(url, encoding="euc-kr")[1]
path_name = os.path.join(os.path.dirname(__file__),"stock.csv")
print(path_name)
table.to_csv(path_name, index=False, mode="a", encoding="euc-kr")
print("저장 완료")

