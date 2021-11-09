def max3(a, b, c):

    max = a
    if b > max: max = b
    if c > max: max = c
    return max

n1 = int(input('整数n1:'))
n2 = int(input('整数n2:'))
n3 = int(input('整数n3:'))

print('最大値は',max3(n1, n2, n3), 'です。')

x1 = float(input('実数x1:'))
x2 = float(input('実数x2:'))
x3 = float(input('実数x3:'))

print('最大値は', max3(x1, x2, x3), 'です。')

print('n1とn2とx1の最大値は', max3(n1,n2,x1),'です。')