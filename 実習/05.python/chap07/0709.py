print('合計点と平均点を求めます。')
number=int(input('学生の人数:'))

tensu=[None]*number

for i in range(number):
    tensu[i]=int(input('{}番の点数:'.format(i+1)))

total=0
for i,point in enumerate(tensu):
    total += point

print('合計は{}点です。'.format(total))
print('平均は{}点です。'.format(total / number))