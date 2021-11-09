import java.util.*;
public class Fukusyu0203{
  public static void main(String args[]){
    for(int i=15;i<20;i+=1) {
      System.out.println(fibonacci(i));
  }
}

     static int fibonacci(int n) {
     return (n==1||n==0)?n:fibonacci(n-2)+fibonacci(n-1);
}

  }