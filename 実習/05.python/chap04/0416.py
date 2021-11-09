import random

n = int(input('乱数は何個:'))

for _ in range(n):
    r = random.randint(10, 99)
    if (r == 13):
        print('\n事情により中断します。')
        break
    print(r, end='')
else:
    print('\n乱数生成終了。')