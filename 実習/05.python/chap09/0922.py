def print_kwaegs(s, **kwargs):

    print(s)
    print('type(kwargs) =', type(kwargs))
    print('len(kwargs)  =', len(kwargs))
    print('kwqrgs       =', kwargs)

print_kwaegs('1番', spring='春', summer='夏')
print()
print_kwaegs('2番', spring='春')