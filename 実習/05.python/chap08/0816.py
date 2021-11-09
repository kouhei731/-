txt=input('文字列:')

count ={ch: txt.count(ch) for ch in txt} 

print('分布＝', count)