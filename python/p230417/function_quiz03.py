#문제 1
def four_rules(n1, n2):
    print(f"{n1}+{n2}={n1+n2}")
    print(f"{n1}-{n2}={n1-n2}")
    print(f"{n1}*{n2}={n1*n2}")
    print(f"{n1}/{n2}={n1/n2}")

four_rules(7, 2)

#문제 2
def star_count(s1):
    print(f"{'*'*s1}")

star_count(7)
#문제3

# def accumulator(n1,n2):
#     total = 0  
#     if n1 < n2:
#         for s in range(n1, n2+1):
#             total += s  
#     else:
#         for v in range(n2, n1+1):
#             total += v  
#     print("총합 >> ", total)  
# def accumulator(n1,n2):
#     if n1 < n2:
#         print("누적합 :", sum(range(n1, n2+1)))
#     else:
#         print("누적합 :", sum(range(n2, n1+1)))
# def accumulator(n1,n2):
#     if n1 > n2:
#         max_v, min_v = n1,n2
#     else:
#         max_v,min_v = n2,n1

    # print("누적합 :", sum(range(min_v, max_v+1)))

# 조건 검사할 때, 한 라인으로 나타 나고 꼭 묶어야 한다.
def accumulator(n1,n2):
    max_v, min_v = (n1, n2) if n1 > n2 else (n2, n1)
    print("누적합 :", sum(range(min_v, max_v+1)))

accumulator(1, 10)  
accumulator(10, 1) 
print("*"*33)
# #문제 4
#return
def positive(lst):
    result = []
    for e in lst:
        if e > 0:
            result.append(e)
    return result
    
positiveValue = positive([1, -2, 3, -4, 5])
print("결과는 ", positiveValue)


# def addInfo(**args):
#     student = {'info': {}}  
#         student['info'].update(args[i])
#         return student
# student = addInfo(name='kim', gender='female', score=2.34)
# student = addInfo(name='kang', gender='male', score=66)
# print("student", student)



# def addInfo(**args):
#     student = {'info': {}}  
#     for i in enumerate(student):        
#         student['info'][i].update(args)
#         return student

# student = addInfo(name='kim', gender='female', score=2.34)
# student = addInfo(name='kang', gender='male', score=66)
# print(student)

# def addInfo(**args):
#     student = {'info': {}}
#     # for i in enumerate(student):
#     student['info'].update(args)
#         # i += 1
#     return student
# student = addInfo (name='kim', gender='female', score=2.34)
# student = addInfo (name='kang', gender='male', score=66)
# print(student)


def addInfo(student, **args):
    addInfo.counter = addInfo.counter + 1
    student[f'info {addInfo.counter}'] = args
    return student

addInfo.counter = 0
student = {}
student = addInfo(student, name='kim', gender='female', score=2.34)
student = addInfo(student, name='kang', gender='male', score=66)
print(student)