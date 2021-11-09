class Member:

    pass

Yamada = Member()
Yamada.no = 15
Yamada.name = '山田太郎'
Yamada.weight = 72.7

sekine = Member()
sekine.no = 37
sekine.name = '関根信彦'
sekine.weight = 65.3

print('{}: {} {}kg'.format(Yamada.no, Yamada.name,Yamada.weight))
print('{}: {} {}kg'.format(sekine.no, sekine.name,sekine.weight))