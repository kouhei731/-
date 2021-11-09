import java.util.Scanner;

class IsoscelesTriangle {

  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);

    System.out.println("直角三角形を描画します。");
    System.out.print("底辺の長さを入力:");
    int n = stdIn.nextInt();

    for (int i = 1; i <=n; i++) {
      for (int j = 1; j <= i; j++)
        System.out.print('*');
      System.out.println();   
   }
  }  
}
