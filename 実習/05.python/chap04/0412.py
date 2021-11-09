start = int(input('開始:'))
end = int(input('終了:'))
step = int(input('増分:'))

for count in range(start, end, step):
    print(count, end='')
print()