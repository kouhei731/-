s1 = input('文字列を入力してください:')
s2 = input('別の文字列を入力してください:')

print('結合した文字列は',s1 + s2,'です')

print('文字数は',len(s1+s2),'です')

for i, ch in enumerate(s1+s2,1):
    print('{}番目の文字は{}です'.format(i, ch))