"""ある年の日数を求める"""

def is_leapyear(year: int) -> bool:
    """西暦はyear年は閏年か"""
    return y % 4 == 0 and y % 100 != 0 or y % 400 == 0

print('ある年の日数を求めます。')
y = int(input('何年:'))
print('その年は{}日です。'.format(365 + is_leapyear(y)))