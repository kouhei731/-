#可変個引数の情報を表示する
def print_args(*args):
    
    print('type(args) =', type(args))
    print('len(args)  =',  len(args))
    print('args       =', args)

print_args()
print()
print_args(1, 2, 3)