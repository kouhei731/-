class MyOverloadC {
  void showType(int i) {
  System.out.println("引数" + i + "は整数です。");
  }
  void showType(String s) {
  System.out.println("引数" + s + "は文字列です。");
  }
  }
  public class MyOverload {
  public static void main(String[] args) {
  MyOverloadC obj = new MyOverloadC();
  obj.showType(2000);
  }
  }