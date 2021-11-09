n = 1

def func():
    global n
    n = 2
    print('n =', n)

print('n = ', n)
func()
print('n = ', n)