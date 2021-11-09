txt=input('文字列:')

count = {}
for ch in txt:
    if ch not in count:
        count[ch]=1
    else:
        count[ch] +=1
print('分布＝', count)