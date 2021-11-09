def puts(n, s):

     for _ in range(n):
         print(s, end='')

d1 = {'n': 3, 's': '*'}
d2 = {'s': '+', 'n' :7}

puts(**d1)
print()
puts(**d2)