public class Ensyu218 {
  public static void main( String[] args ) {
      int count = Integer.parseInt(args[0]);
      String hantei;
      if (count >= 80) {
      hantei = "優";
      } else if (count >= 70) {
      hantei = "良";
      } else if (count >= 60) {
      hantei = "可";
      } else {
      hantei = "不可";
      }
      System.out.println(hantei);
  }
}