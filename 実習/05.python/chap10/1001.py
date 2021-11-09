def min_max2(a, b):

    return (a, b) if a < b else (b, a)

n1 = int(input('整数n1:'))
n2 = int(input('整数n2:'))

minimum, maximum = min_max2(n1, n2)
print('最小値は', minimum, 'で最大値は', maximum, 'です。')