class pet:

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


kurt = pet('Kurt','アイ')
kurt.introduce()
print(kurt)
print('str(Kurt) = ' + str(kurt))
kurt.print()