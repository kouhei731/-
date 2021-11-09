txt=input('文字列txt:')
ptn=input('文字列ptn:')

c = txt.count(ptn)
if c ==0:
     print('ptnはtxtに含まれません。')
elif c ==1:
     print('ptnがtxtに含まれるインデックス:', txt.find(ptn))
else:
     print('ptnがtxtに含まれる先頭インデックス:', txt.find(ptn))
     print('ptnがtxtに含まれる末尾インデックス:', txt.rfind(ptn))