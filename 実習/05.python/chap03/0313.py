n= int(input('整数値:'))

if not (n <= -10 or n >= 10):
    print('その値は２桁未満です。')

else:
    print('その値は２桁以上です。')