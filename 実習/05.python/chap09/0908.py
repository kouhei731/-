import random

def confilm_retry():

    while True:
        n = int(input('もう一度？<Yes...1/No...0>:'))
        if n == 0 or n == 1:
            return n

print('暗算トレーニング開始!!')

while True:
    x = random.randint(100, 999)
    y = random.randint(100, 999)
    z = random.randint(100, 999)

    while True:
        print(x, '+', y, '+', z, '= ', end='')
        k = int(input())
        if k == x + y + z:
            break
        print('違いますよ!!')

    if not confilm_retry():
        break