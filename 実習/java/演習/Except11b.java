public class Except11b {
  public static void main(String[] args) {
      int i = 0,j = 1;
      try { j = 10 / i; }
      catch (ArithmeticException errInf) {
          j = 999;
          System.out.println("eerInf=" + errInf);
      }
      finally { System.out.println("i=" + i + ", j=" + j); }
  }
}