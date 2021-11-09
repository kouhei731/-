public class Ensyu13 {
  public static void main(String[] args) {
    // MoreFuncクラスをインスタンス化 変数mfuncに格納する
    MoreFunc mfunc = new MoreFunc();
    // 数値を扱う変数num1 2を代入する
    int num1 = 2;
    // 数値を扱う変数num2 4を代入する
    int num2 = 4;
    // sumメソッドを呼び出し、結果を表示
    System.out.println("Sum from "+ num1 +" to "+ num2 +" = " + mfunc.sum(num1, num2));
    // averageメソッドを呼び出し、結果を表示
    System.out.println("Average " + num1 + " and " + num2 + " = " + mfunc.average(num1, num2));
    // powerメソッドを呼び出し、結果を表示
    System.out.println("Power " + num1 + " of " + num2 + " = " + mfunc.power(num1, num2));
  }
}

// MoreFuncクラス
// Ensyu08.java内のFuncsionsクラスを継承
// sumメソッド(Funcsions内)とaverageメソッド(Funcsions内)とpowerメソッドを持つ
class MoreFunc extends Functions {
  // powerメソッド
  //引数int:x,int:y  戻り値int:total
  //xのy乗の値を返却する。
  int power(int x,int y){
    // 累乗値を求めるMath.powを使用
    // 引数、戻り値がdoubleなので、doubleに変換してMath.powを呼び出し、戻り値をintにキャストして返却
    return (int)Math.pow((double)x, (double)y);
  }
}


// ---------------------------------------------------------------------- //

// Ensyu08.java Functionsクラス
// sumメソッドとaverageメソッドを持つ
class Functions {
  // sumメソッド
  //引数int:x,int:y  戻り値int:total
  //xからyまでの合計値を返却する。
  public int sum(int x,int y) {
    // 合計値を管理する変数 total
    int total = 0;
    // xからyまで繰り返す
    for(int i = x; i <= y; i++){
      // 数を一つずつ足し込む
      total += i;
    }
    // totalを返却する
    return total;
  }

  // sumメソッド
  //引数int:x,int:y  戻り値int:平均値
  //xとyの平均値を返却する。
  public int average(int x,int y) {
    // xとyを足し、2で割った値を返却する
    return (x + y)/2;
  }
  
}