#リストにまとめられている３値の最大値を求める

def max3(a, b, c):

     max = a
     if b > max: max = b
     if c > max: max = c
     return max

lst1 = [1, 3, 5]
m = max3(*lst1)
print(lst1, 'の最大値は', m, 'です。')