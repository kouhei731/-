a = int(input('整数a:'))
b = int(input('整数b:'))

if a > b:
    t = a
    a = b
    b = t

print('a≦bとなるようにソートしました。')
print('変数aの値は', a, 'です。')
print('変数bの値は', b,'です。')    