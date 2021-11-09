def factorial(n):

    if n > 0:
        return n * factorial(n - 1)
    else:
        return 1

n = int(input('何の階乗:'))
print(n, 'の階乗は', factorial(n), 'です。')