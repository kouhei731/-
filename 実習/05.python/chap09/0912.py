def change(lst, idx, val):

    lst[idx] = val

x = [11,22,33,44,55]
print('x =', x)

index = int(input('インデックス :'))
value = int(input('新しい値     :'))

change(x, index, value)
print('x =', x)