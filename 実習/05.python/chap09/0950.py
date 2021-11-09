import random

number = int(input('学生の人数:'))

tensu = [None] * number

for i in range(number):
    tensu[i] = random.randint(0, 100)

print('全員の点数＝', tensu)
print('合格者の点数＝', list(filter(lambda n: n >= 80, tensu)))