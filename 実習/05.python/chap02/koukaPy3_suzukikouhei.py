x = int(input('元の整数を入力してください。'))
n = int(input('シフトするビット数を整数で入力してください。'))

print('100 ×2の5乗は = {:d}'.format(x << n))
print('100÷2の5乗は = {:d}'.format(x >> n))