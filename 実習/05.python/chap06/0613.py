txt=input('文字列txt:')
ptn=input('文字列ptn:')

try:
    print('txt[{}]にptnが含まれます。'.format(txt.index(ptn)))
except ValueError:
    print('ptnはtxtに含まれません。')