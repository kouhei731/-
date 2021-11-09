def put_star(n):

    for _ in range(n):
        print('*', end='')

print('左下直角二等辺三角形')
n = int(input('短辺:'))

for i in range(1, n + 1):
    put_star(i)
    print()

print('長方形')
h = int(input('高さ:'))
w = int(input('横幅:'))

for i in range(1,　h + 1):
    put_star(w)
    print()