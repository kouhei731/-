import java.util.Scanner;
class SearchString {
  public static void main(String[] args){
    Scanner stdIn = new Scanner(System.in);

  System.out.print("文字列s1:"); String s1 = stdIn.next();
  System.out.print("文字列s2:"); String s2 = stdIn.next();
  
  int idx = s1.indexOf(s2);
  if (idx == -1)
    System.out.println("s1" + (s1) + ":");
  else
    System.out.println("s2" + (s2) + ":");
  }
}