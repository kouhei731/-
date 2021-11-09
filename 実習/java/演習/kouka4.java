package kouka;

public class Kouka4 {
  public static void main(String... args) {
    // 合計の初期化
    int total = 0;
    // 100から200まで繰り返す
    for (int i = 100; i <= 200; i++) {
      // 合計を求める
      total = total+=i;
    }
    // 合計を表示
    System.out.println("１００から２００までの合計 = " + total);
  }
}