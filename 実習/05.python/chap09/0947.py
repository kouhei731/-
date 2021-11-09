def kuku(func):

    for i in range(1, 10):
        for j in range(1, 10):
            print('{:3d}'.format(func(i, j)), end='')
        print()

n = int(input('掛け算[0]/足し算[1]:'))

if n == 0:
    print('九九の掛け算表')
    kuku(lambda x, y: x * y)
elif n == 1:
    print('九九の足し算表')
    kuku(lambda x, y: x + y)