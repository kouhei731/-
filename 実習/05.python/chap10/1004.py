import min_max

x = float(input('実数x:'))
y = float(input('実数y:'))
z = float(input('実数z:'))

print('xとyの最小値は{}で最大値は{}です。'.format(*min_max.min_max2(x, y)))
print('yとzの最小値は{}で最大値は{}です。'.format(*min_max.min_max2(y, z)))
print('xとzの最小値は{}で最大値は{}です。'.format(*min_max.min_max2(x, z)))
print('xとyとzの最小値は{}で最大値は{}です。'.format(*min_max.min_max3(x, y, z)))