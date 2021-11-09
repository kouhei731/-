a = int(input('整数a:'))
b = int(input('整数b:'))
c = int(input('整数c:'))

if a > b: a, b = b ,a
if b > c: b, c = c, b
if a > b: a, b =b, a

print('a≦b≦cとなるようにソートしました。')
print('変数aの値は', a, 'です。')
print('変数bの値は', b,'です。')  
print('変数cの値は', c,'です。')