a = int(input('整数a:'))
b = int(input('整数b:'))

a ,b = sorted([a ,b])

counter = a
while counter <= b:
    print(counter, end='')
    counter = counter + 1
print('\ncounterの値は', counter, 'です。')