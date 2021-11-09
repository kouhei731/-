try:
    a = int(input('整数a:'))
    b = int(input('整数b:')) 

    print('a * b は', a * b, 'です。')
    print('a / b は', a / b, 'です。')

except ValueError:
    print('整数と認識できません！')

except ZeroDivisionError:
    print('ゼロによる除算！')

else:
    print('正常終了！')

finally:
    print('お疲れさまでした。')