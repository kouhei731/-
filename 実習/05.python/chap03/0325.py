a = int(input('整数a:'))
b = int(input('整数b:'))

if a < b:
    min2 = a
    max2 = b
else:
    min2 = b
    max2 = a

print('小さいほうの値は', min2, 'です。')
print('大きいほうの値は', max2, 'です。')