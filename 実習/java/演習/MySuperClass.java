class MySuperClass {
    void mySuperMethod() {
        System.out.println("super class");
    }
}
class MySubClass extends MySuperClass{
    void mySubMethod() {
        System.out.println("sub class");
    }
}
public class MyExtends {
    public static void main(String[] args) {
        MySubClass obj = new MySubClass();
        System.out.println("main");
        obj.mySubMethod();
        obj.mySuperMethod();
    }
}