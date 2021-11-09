class MyOverload2C {
void myArea(int r) {
System.out.println("円の面積=" + (3.14 * r * r));
}
void myArea(int v, int h) {
System.out.println("長方形の面積=" + (v * h));
}
}
public class MyOverload2ln {
public static void main(String[] args) {
int[] ip = new int[2];
int len = args.length;
for (int i=0; i<len; i++) {
ip[i] = Integer.parseInt(args[i]);
}
MyOverload2C obj = new MyOverload2C();
if (len == 1) {
obj.myArea(ip[0]);
} else {
obj.myArea(ip[0], ip[1]);
}
}
}