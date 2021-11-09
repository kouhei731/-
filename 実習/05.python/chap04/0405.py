print('正の整数値を加算します　(終了は-9999)。')
 
sum = 0
while True:
    n = int(input('整数値:'))
    if n == -9999:
        break
    if n <= 0:
        continue
    sum += n
print('正の整数の合計は' , sum, 'です。')