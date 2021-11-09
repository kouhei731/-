month = int(input('季節を求めます。　/n何月ですか:'))

if 3 <=month and month <=5:
    print('それは春です。')
elif 6 <=month and month <=8:
    print('それは夏です。')  
elif 9 <=month and month <=11:
    print('それは秋です。')  
elif (month == 1 or
      month == 2 or
      month == 12
     ):
    print('それは冬です。')      
else:
    print('そんな月はありませんよ。') 