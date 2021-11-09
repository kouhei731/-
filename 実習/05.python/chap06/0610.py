s=input('文字列:')

for i, ch in enumerate (reversed(s), 1):
    print('後ろから{}番目の文字: {}'.format(i, ch))