print('５人の点数の合計点と平均点を求めます。')

tensu1=int(input('１番の点数:'))
tensu2=int(input('２番の点数:'))
tensu3=int(input('３番の点数:'))
tensu4=int(input('４番の点数:'))
tensu5=int(input('５番の点数:'))

total=0
total+=tensu1
total+=tensu2
total+=tensu3
total+=tensu4
total+=tensu5

print('合計は{}点です。'.format(total))
print('平均は{}点です。'.format(total/5))