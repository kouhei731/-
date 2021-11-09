class Commander:

    __counter = 0

    def __init__(self, name: str) -> None:

        self.__name = name
        Commander.__counter += 1
        self.__id = Commander.__counter

    def id(self) -> int:

        return self.__id

    @classmethod
    def max_id(cls) ->int:

        return cls.__counter

    def print(self) -> None:

        print('{}:{}番'.format(self.__name, self.__id))

oda = Commander('織田信長')
toyotomi = Commander('豊臣秀吉')
tokugawa = Commander('徳川家康')

print('oda.id() = {}'.format(oda.id()))
print('toyotomi.id() = {}'.format(toyotomi.id()))
print('tokugawa.id() = {}'.format(tokugawa.id()))

print('Commander.max_id() = {}'.format(Commander.max_id()))
print('oda.max_id() = {}'.format(oda.max_id()))