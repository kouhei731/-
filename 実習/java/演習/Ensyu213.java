public class Ensyu213 {
  public static void main(String[] args) {
    int i = 1;
    int sum = 0;
    do {
       sum = sum + i++;
    }while (i <= 10);
    System.out.println("合計=" + sum);
  }
}