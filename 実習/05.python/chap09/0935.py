"""乗算表を表示(内部関数)"""

upper = int(input('1から何まで:'))

def multiplication_table(n: int) -> bool:
    """1~nまでの乗算表を表示"""
    def put_bar(n: int) -> None:
        """n個の'-'を連続表示して改行"""
        print('-' * n)
    if    1 <= n <=  3: w = 2
    elif  4 <= n <=  9: w = 3
    elif 10 <= n <= 31: w = 4
    else              : return False

    f = '{{:{}d}}'.format(w)
    put_bar(n * w)
    for i in range(1, n + 1):
        for j in range(1, n + 1):
            print(f.format(i * j), end='')
        print()
    put_bar(n * w)
    return True

multiplication_table(upper)