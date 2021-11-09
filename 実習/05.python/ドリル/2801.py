class Teacher:

     pass 

suzuki = Teacher()
suzuki.name = '鈴木一郎'
suzuki.age = 42
suzuki.subject = 'Pythonプログラミング'

print('こんにちは、{}です。'.format(suzuki.name))
print('年齢は、{}歳です。'.format(suzuki.age))
print('担当科目は、{}です。'.format(suzuki.subject))

class Student:

    pass

hirose = Student
hirose.name = '広瀬すず'
hirose.age = 18
hirose.grade = 2


print('こんにちは、{}です。'.format(hirose.name))
print('年齢は、{}歳です。'.format(hirose.age))
print('学年は、{}年生です。'.format(hirose.grade))

teacher = suzuki
student = hirose
