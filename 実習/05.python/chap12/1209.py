class RangeException(Exception):

    pass

class ParamaterRangeException(RangeException):

    pass

class ResultException(RangeException):

    pass

def is_valid(value: int) -> bool:

    return 0 <= value <= 9

def add(a: int, b: int) -> int:





    if not is_valid(a):
        raise ParamaterRangeException
    if not is_valid(b):
        raise ParamaterRangeException

    result = a + b

    if not is_valid(result):
        raise ResultException
    return result

a = int(input('整数a:'))
b = int(input('整数b:'))

try:
    print('それらの和は{}です。'.format(add(a, b)))
except ParamaterRangeException:
    print('仮引数の値が範囲外です。')
except ResultException:
    print('返却値の値が範囲外です。')
except: 
    print('何らかの例外が発生しました')
finally:
    print('お疲れさまでした')