openfile = open('a.txt')
writefile = open('b.txt', 'w')

for line in openfile:
  tbl = line.split(",")
  sum = int(tbl[1])+int(tbl[2])
  line = line.strip("\n")
  writefile.write(line+","+str(sum)+"\n")

openfile.close()
writefile.close()