def outer():
    n = 1
    def inner():
    
        n = 2
        print('n =', n)

    print('n = ', n)
    inner()
    print('n = ', n)

outer()