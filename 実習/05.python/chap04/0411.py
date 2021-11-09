a = int(input('整数a:'))
b = int(input('整数b:'))

a,b = sorted([a,b])

for counter in range(a, b + 1):
    print(counter,end='')
print()