def func(n):

    print('n:', n, id(n))
    n = 0
    print('n:', n, id(n))

x = 5
print('x:', x, id(x))
func(x)
print('x:', x, id(x))