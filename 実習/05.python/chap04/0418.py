import time

print('長方形')
h = int(input('高さ:'))
w = int(input('横幅:'))

for i in range(h):
    for j in range(w):
        print('*', end='')
        time.sleep(0.01)
    print()