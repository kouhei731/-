n = int(input('正の整数値:'))

if n > 0:
    if n % 2 == 0:
        print('その値は正の偶数です。')
    else:
        print('その値は正の奇数です。')
else:
    print('正でない値が入力されました。')