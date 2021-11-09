with open('binfile.bin', 'br')as f:
    bin = f.read()
    for c in bin:
        print(int(c))