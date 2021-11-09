s=input('文 字 列s:')
s=input('探す文字c:')

print('文字{}は'.format(c), end='')

for i in range(len(s)):
    if s[i] == c:
        print('s[{}]に入っています。'.format(i))
        break
else:
    print('入っていません。')