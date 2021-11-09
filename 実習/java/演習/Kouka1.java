package kouka;

public class Kouka1 {
  public static void main(String... args) {
    // 整数型変数の初期化
    int num1 = 100, num2 = 30;
    // 解答用変数の初期化
    int addAnswer = 0;
    int subAnswer = 0;
    int mulAnswer = 0;
    double divAnswer = 0.0;
    int modAnswer = 0;

    // 算術演算処理と表示
    addAnswer = num1 + num2;  // たし算
    subAnswer = num1 - num2;  // ひき算
    mulAnswer = num1 * num2;  // かけ算
    divAnswer = num1 / num2;  // わり算
    modAnswer = num1 % num2;  // 余り

    // 計算結果の表示
    // たし算
    System.out.println(num1 + " + " + num2 + " = " + addAnswer);
    // ひき算
    System.out.println(num1 + " - " + num2 + " = " + subAnswer);
    // 掛け算
    System.out.println(num1 + " * " + num2 + " = " + mulAnswer);
    // わり算
    System.out.println(num1 + " / " + num2 + " = " + divAnswer);
    // 余り
    System.out.println(num1 + " % " + num2 + " = " + modAnswer);
  }
}