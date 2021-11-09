f = open('hello.txt')

line1 = f.readline()
line2 = f.readline()

print(line1, end='')
print(line2, end='') 

f.close()