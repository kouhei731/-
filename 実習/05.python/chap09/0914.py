def hello(name, honorific = 'さん'):

    print('こんにちは、{}{}。'.format(name,honorific))

hello('田中')
hello('関根', '君')
hello('西田', '先生')