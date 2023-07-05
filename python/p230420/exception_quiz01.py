list_value = ['100', 'good', '5', '250', 'hi', '500']
list_number = []

for value in list_value:
    try:
        int(value)
        list_number.append(value)
    except:
        pass

print('list_number >>', list_number)