public class Except12 {
  public static void main(String[] args) {
      double d, e = 1.0;
      d = 0.0;
      try {
          e = 10.0 / d;

      }
      catch (ArithmeticException errInf) {
          e = 999.9;
          System.out.println("errInf=" +errInf);

      }
      finally {
            System.out.println("d=" + d + ", e=" + e);
      }
   }
}