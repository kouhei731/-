class MyException(Exception):

    pass

def raise_my_exception() -> None:
    raise MyException

def func(sw: int) -> None:
    try:
        if sw == 0:
            raise_my_exception()
    except MyException as e:
        print('マイ例外を捕捉。')


        print('回復できませんでした。')
        raise Exception

sw = int(input('sw:'))

try:
    func(sw)
except Exception as e:
    print('例外捕捉！')
    print(type(e))