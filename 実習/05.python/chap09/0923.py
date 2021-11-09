def put_person(**person):

    if 'name' in person: print('名前 =', person['name'], end=' ')
    if 'visa' in person: print('国籍 =', person['visa'], end=' ')
    if 'age'  in person: print('年齢 =', person['age'],  end=' ')
    print()

put_person(name='中田', visa='日本', age=27)
put_person(name='趙', visa='中国',)