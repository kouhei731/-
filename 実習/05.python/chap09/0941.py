def min2(a, b):

    return a if a < b else b

a = int(input('整数a:'))
b = int(input('整数b:'))

func = min2
print('最小値は', func(a, b), 'です。')

del min2
print('最小値は', func(a, b), 'です。')

del func
print('最小値は', func(a, b), 'です。')