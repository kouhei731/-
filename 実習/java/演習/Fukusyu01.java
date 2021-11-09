public class Fukusyu01{
    public static void main(String[] args) {
       int x = 5;
       int y = 6;

       int w = x;
       x = y;
       y = w;


       System.out.println("x =" + x + ",y = " + y);
    }
  }