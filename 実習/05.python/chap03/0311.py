n= int(input('整数値:'))

if n ==0:
    print('その値はゼロです。')
elif n >= -9 and n <=9:
    print('その値は１桁です。')
else:
    print('その値は２桁以上です。')
