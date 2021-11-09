import random
#1～100の乱数を生成
a = random.randint(1, 100)
#生成した乱数を表示
print('生成した乱数は{}です。'.format(a))

import math
#体積の計算
b = 3/4*3.14*a*a*a 
#小数点の切り捨て
math.floor(5b)
#体積の表示
print('半径が{}の球の体積は{}cm3です。'.format(a, b))