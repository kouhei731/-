def kuku(func):

    for i in range(1, 10):
        for j in range(1, 10):
            print('{:3d}'.format(func(i, j)), end='')
    
        print()

def mul2(x, y):
    return x * y

def add2(x, y):
    return x + y

n = int(input('掛け算[0]/足し算[1]:'))

if n == 0:
    print('九九の掛け算表')
    kuku(mul2)
elif n == 1:
    print('九九の足し算表')
    kuku(add2)