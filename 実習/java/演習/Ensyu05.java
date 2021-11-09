public class Ensyu05{
    public static void main(String args[]){
      //乱数を管理する変数num0で初期化
      int num = 0;
      //乱数を保管しておくリストnumList
      int[] numList = new int[10];
      //最大値を管理する変数maxNum
      int maxNum = 0;
      //合計値を管理する変数total
      int total = 0;
      
      //numListの要素数分繰り返す
      for(int i = 0; i < numList.length; i++){
        
        //Math.random()は0.0~1.0未満の乱数を生成するメソッド
        //100を掛けてint型にキャストして0～99の乱数(整数)を生成する
        num = (int)(Math.random() * 100);
        //numListに生成した乱数を詰める
        numList[i] = num;
        //totalに生成した乱数の値を足し込む
        total += num;
        //もし今まで生成した乱数寄りも大きかった場合
        if(maxNum < num)  {
        //最大値を上書きする
           maxNum = num;
        }
      }
        System.out.println("Total="  + total);
        System.out.println("Max="  + maxNum);
        
        // 各乱数を表示
        // numListの要素数分繰り返す
        for(int j = 0; j < numList.length; j++ ) {
        System.out.print("num["+j+"] : " + numList[j]);
        }
        
      } 
}