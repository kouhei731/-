 8lass pet:

    def __init__(self, name: str, master: str) -> None:

        self._name = name
        self._master = master

    def introduce(self) -> None:

        print('僕の名前は{}です！'.format(self._name))
        print('ご主人様は{}です！'.format(self._master))

    def __str__(self) -> str:

        return self._name + ' <<' + self._master + '>>'

    def print(self) -> None:

        print(self.__str__())

class RobotPet(pet):

    def __init__(self, name: str, master: str, type_no: str) -> None:

        super().__init__(name, master)
        self._type_no = type_no

    def introduce(self) -> None:

        print('僕はロボット。名前は{}。'.format(self._name))
        print('型番は{}。'.format(self._type_no))
        print('僕の主人は{}。'.format(self._master))

    def __str__(self) -> str:

        return(self._name + ' [[' + self._type_no + ']]'
                          + ' <<' + self._master + '>>')

    def work(self, sw: int) -> None:
       
        if   sw == 0: print('掃除します。')
        elif sw == 1: print('洗濯します。')
        elif sw == 2: print('炊事します。')


kurt = pet('Kurt', 'アイ')
kurt.introduce()
print(kurt)

r2d2 = RobotPet('R2D2', 'ルーク', 'R2')
r2d2.introduce()
print(r2d2)

def self_introduce(obj: object) -> None:

    obj.introduce()

self_introduce(kurt)
self_introduce(r2d2)

kurt.print()

r2d2.print()
r2d2.work(1)