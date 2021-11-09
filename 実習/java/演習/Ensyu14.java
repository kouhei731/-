public class Ensyu14 {
  public static void main(String[] args) {
    // MoreFuncクラスをインスタンス化 変数mfuncに格納する
    MoreFunc mfunc = new MoreFunc();
    // 数値を扱う変数num1 5を代入する
    int num1 = 5;
    // 数値を扱う変数num2 9を代入する
    int num2 = 9;
    // averageメソッドを呼び出し、結果を表示
    System.out.println("Average " + num1 + " and " + num2 + " = " + mfunc.average(num1, num2));
  }
}

// Functionsクラス
// sumメソッドを持つ
class Functions{
  // sumメソッド
  //引数int:x,int:y  戻り値int:total
  //xとyの合計値を返却する。
  int sum(int x,int y){
    // xとyの合計値を返却する
    return x + y;
  }
}

// MoreFuncクラス
// Funcsionsクラスを継承
// sumメソッド(Funcsions内)とaverageメソッドを持つ
class MoreFunc extends Functions{
  // averageメソッド
  // 引数int:x,int:y  戻り値int:平均値
  // xとyの平均値を返却する。
  int average(int x,int y){
    // xとyを足し、2で割った値を返却する
    // 合計値の計算はFuncsionsクラスのsumメソッドを呼び出し計算をしてもらう
    return super.sum( x , y ) / 2;
  }
}