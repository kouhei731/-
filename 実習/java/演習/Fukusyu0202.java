import java.util.*;
public class Fukusyu0202{
  public static void main(String args[]) {

    Scanner sc = new Scanner(System.in);

    int x[] = new int[10];
    for (int i = 0; i < 10; i++) {
            x[i] = sc.nextInt(); 
    }

    for(int i = 9; i >=0; i--) {
      System.out.print(x[i] +"");
    }
  }
  