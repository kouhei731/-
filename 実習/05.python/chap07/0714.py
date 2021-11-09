print('最低点と最高点を求めます。')
print('注:"End"で入力終了。')

number=0
tensu=[]

while True:
    s=input('{}番の点数:'.format(number+1))
    if s == 'End':
        break
    tensu.append(int(s))
    number += 1

minimum = min(tensu)
maximum = max(tensu)

print('合計は{}点です。'.format(minimum))
print('平均は{}点です。'.format(maximum))