x = int(input('整数:'))
n = int(input('シフトするビット数:'))

print('x      = {:b}' .format(x))
print('x << n = {:b}' .format(x << n))
print('x >> n = {:b}' .format(x >> n))