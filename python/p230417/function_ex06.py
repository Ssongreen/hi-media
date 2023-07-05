"""
이 코드는 가변 키워드 매개 변수(variable keyword arguments)를 사용하는 예시입니다. 가변 키워드 매개 변수는 매개 변수의 개수가 가변적인 함수를 정의할 때 사용됩니다.

가변 키워드 매개 변수를 정의하려면, 매개 변수 이름 앞에 **를 붙입니다. 이 때, 매개 변수는 딕셔너리 형태로 전달됩니다. 따라서, 함수 내에서 score 매개 변수를 사용하면, 전달된 모든 키-값 쌍을 딕셔너리로써 사용할 수 있습니다.

예를 들어, 다음과 같이 student_score 함수를 정의할 수 있습니다.

python
Copy code
def student_score(**score):
    for subject, score in score.items():
        print(f"{subject}: {score}")
이 함수는 매개 변수로 여러 개의 키워드 인자를 받을 수 있습니다. 예를 들어, student_score(math=90, english=80)과 같이 함수를 호출하면, score 매개 변수는 {'math': 90, 'english': 80} 딕셔너리로 설정됩니다. 이 딕셔너리의 모든 키-값 쌍을 출력합니다.

따라서, 현재 코드에서 student_score(math=90)와 같이 함수를 호출하면, score 매개 변수는 {'math': 90} 딕셔너리로 설정되며, 이 딕셔너리와 해당 딕셔너리의 타입인 dict가 출력됩니다.
"""

#함수 정의
def student_score(**score):
        total = sum(score.values())
        arrange = (total/len(score))
        print("총점 ", total)
        print(f"평균 {arrange:.2f}")

student_score(math=90, english=99, glemmer=99)
