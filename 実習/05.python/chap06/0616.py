a,b,n =12,35,163
f1,f2=3.14,1.23456789
s1,s2='ABC','XYZ'

print('nの10進表記=%d。'% n)
print('nの16進表記=%o。'% n)
print('%dは8進で%oで16進で%x。'% (n,n,n))

print('nは%5dでf1は%9.5fでf2は%9.5fです。' % (n,f1,f2))

print('"%s"+"%s"は"%s"です。' % (s1,s2,s1+s2))

print('%dと%dの和は%dです。' % (a,b,a+b))

print('%(no1)d+%(no2)dと%(no2)d+%(no1)dはいずれも%(sum)dです。'%
              {'no1':a,'no2':b,'sum':a+b})