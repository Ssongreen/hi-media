import os 

#현재 경로
print(os.getcwd())
print(os.listdir())

current_path = os.path.dirname(__file__) #현재 폴더에 있는 파일을 리스트
print(os.listdir(current_path))