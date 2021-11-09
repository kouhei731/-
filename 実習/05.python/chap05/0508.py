a = int(input('0～255:'))

print('その値 = {:08b}' .format(a))
print('マスク = {:08b}' .format(a & 0b11110000))
print('セット = {:08b}' .format(a | 0b00001111))
print('反転 = {:08b}' .format(a ^ 0b00001111))