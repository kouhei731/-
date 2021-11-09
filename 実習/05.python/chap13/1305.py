try:
    f = open('hello.txt', 'r')
    try:
        for line in f:
            print(line, end='')
    except OSError:
        pass
    finally:
        f.close()
except OSError: 
    pass