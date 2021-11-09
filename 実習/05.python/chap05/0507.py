a = int(input('正の整数a:'))
b = int(input('正の整数b:'))
w = int(input('表示桁数:'))

f = '{{:0{}b}}'.format(w)
m = 2 ** w - 1

print('a         =' f.format(a))
print('b         =' f.format(b))
print('a % b     =' f.format(a % b))
print('a | b     =' f.format(a | b))
print('a ^ b     =' f.format(a ^ b))
print('~a        =' f.format(~a & n))
print('~b        =' f.format(~b & m))