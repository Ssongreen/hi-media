import os 
#경로와 파일명이 보여준다.
print(__file__)
print(os.path.dirname(__file__))#파일명 빼고 경로만 보기

current_path=os.path.dirname(__file__)
print(current_path)

print(current_path+"/gugudan.txt")
print(os.path.join(current_path,"gugudan.txt")) #역슬레시 추가

print(os.getcwd()) #현재 경로

os.chdir(r"C:\Users\hi-sinchon\Downloads\test") #경로 변경(앞에 r인 raw를 붙이면 문자열 그대로 받아라.)
print(os.getcwd()) #현재 경로