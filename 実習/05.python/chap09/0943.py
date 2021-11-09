def mul2(x, y):
    return x * y

def add2(x, y):
    return x + y

a = int(input('整数a:'))
b = int(input('整数b:'))

func = mul2
print('aとbの積は', func(a, b), 'です。')

func = add2
print('aとbの和は', func(a, b), 'です。')