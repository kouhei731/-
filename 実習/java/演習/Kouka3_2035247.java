//鈴木航平

class Kouka3_2035247 {

  static void printSringArray(String[] s) {
    for (int i = 0; i < s.length; i++)
      System.out.println("" + i + "" + s[i]);
  }

  public static void main(String[] args) {
    String[] a = {
      "abcdefg","あいうえお","0123456"
    };

    System.out.println("文章を書き出します。");
    printSringArray(args);

    System.out.println("書き出すデータを入力してください。(終了:0)");
    printSringArray(a);
  }
}