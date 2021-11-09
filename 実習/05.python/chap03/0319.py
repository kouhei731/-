month = int(input('季節を求めます。　/n何月ですか:'))

if month in {3,4,5}:
    print('それは春です。')
elif month in {6,7,8}:
    print('それは夏です。')  
elif month in {9,10,11}:
    print('それは秋です。')  
elif month in {1,2,12}:
    print('それは冬です。')      
else:
    print('そんな月はありませんよ。') 