import java.util.Scanner; //スキャナークラスをインポート

public class Ensyu15 {
  public static void main(String[] args) {
    //スキャナークラスをインスタンス化
    Scanner scn = new Scanner(System.in);

    //ゲームで使用する文字列をconstant変数として宣言、初期化しておく
    // 空欄を表す文字列 -
    final String BRANK = "-";
    // プレイヤー１のお名前 A
    final String PLAYER_NAME1 = "A";
    // プレイヤー２のお名前 B
    final String PLAYER_NAME2 = "B";

    // ○×ゲームのフィールドを表す2重配列(3×3)
    // BRANKで初期化しておく
    String[][] fields = {{BRANK,BRANK,BRANK},{BRANK,BRANK,BRANK},{BRANK,BRANK,BRANK}};

    // 先攻のターンなのか、後攻のターンなのかを管理する変数 turn
    // true → 先攻、false → 後攻
    boolean turn = true;
    // 入力された座標を管理する変数
    // X軸 inputX
    int inputX = 0;
    // Y軸 inputY
    int inputY = 0;

    // 最大9回までしかターンが回らないので、9回ループさせる
    // 1ループ分は1ターンに相当する
    for(int i = 0; i < 9; i++){
      // ---------------------------現状の表示-------------------------------------//
      System.out.println("★ 現在の表★");
      // フィールドの座標案内(横軸)
      System.out.println("  0 1 2");
      System.out.println("  -----");
      // 2重ループを使って、配列を平面上に描画する
      // 外のループは行(縦軸)のループ　1周 = 1行
      for(int j = 0; j < 3; j++){
        // フィールドの座標案内(縦軸)
        System.out.print(j+"|");
        // 内のループは列(横軸)のループ　1周 = 1マス
        for(int k = 0; k < 3; k++){
          // フィールドの状態を1マスずつ描画(改行なし)
          System.out.print(fields[j][k]+" ");
        }
        // 改行
        System.out.println();
      }
      
      // ---------------------------座標の入力-------------------------------------//
      // 入力を促す文字列を出力(横軸)
      // 先攻なら先攻プレイヤー名を、後攻なら後攻プレイヤー名を表示する
      System.out.print( turn ? "先攻：" + PLAYER_NAME1 : "後攻：" + PLAYER_NAME2 );
      System.out.print("さんの横(x)座標を入力：");
      // 入力(横軸)
      inputX = scn.nextInt();

      // 入力を促す文字列を出力(縦軸)
      // 先攻なら先攻プレイヤー名を、後攻なら後攻プレイヤー名を表示する
      System.out.print( turn ? "先攻：" + PLAYER_NAME1 : "後攻：" + PLAYER_NAME2 );
      System.out.print("さんの縦(y)座標を入力：");
      // 入力(縦軸)
      inputY = scn.nextInt();

      // 2重配列に指定されたプレイヤー名を代入
      fields[inputY][inputX] = turn ? PLAYER_NAME1 : PLAYER_NAME2;

      // ---------------------------------------------勝敗判定--------------------------------------------- //
      // 先攻のプレイヤーが勝っているかどうかの判定
      // フィールド上の縦横斜めのいずれかがそろっていれば勝利
      if((fields[0][0] == PLAYER_NAME1 && fields[0][1] == PLAYER_NAME1 && fields[0][2] == PLAYER_NAME1) // 縦1列目
      || (fields[1][0] == PLAYER_NAME1 && fields[1][1] == PLAYER_NAME1 && fields[1][2] == PLAYER_NAME1) // 縦2列目
      || (fields[2][0] == PLAYER_NAME1 && fields[2][1] == PLAYER_NAME1 && fields[2][2] == PLAYER_NAME1) // 縦3列目
      || (fields[0][0] == PLAYER_NAME1 && fields[1][0] == PLAYER_NAME1 && fields[2][0] == PLAYER_NAME1) // 横1列目
      || (fields[0][1] == PLAYER_NAME1 && fields[1][1] == PLAYER_NAME1 && fields[2][1] == PLAYER_NAME1) // 横2列目
      || (fields[0][2] == PLAYER_NAME1 && fields[1][2] == PLAYER_NAME1 && fields[2][2] == PLAYER_NAME1) // 横3列目
      || (fields[0][0] == PLAYER_NAME1 && fields[1][1] == PLAYER_NAME1 && fields[2][2] == PLAYER_NAME1) // 斜め1列目
      || (fields[0][2] == PLAYER_NAME1 && fields[1][1] == PLAYER_NAME1 && fields[2][0] == PLAYER_NAME1)){ // 斜め2列目
        // そろっていた場合は勝利
        // 勝利と表示し、最後の状態をプリントする
        System.out.println("★★ 勝利★★");
        System.out.println("  0 1 2");
        System.out.println("  -----");
        for(int j = 0; j < 3; j++){
          System.out.print(j+"|");
          for(int k = 0; k < 3; k++){
            System.out.print(fields[j][k]+" ");
          }
          System.out.println();
        }
        // ゲーム終了なので、ループから抜け出す
        break;

        // 先攻のプレイヤーが負けているかどうかの判定
        // フィールド上の縦横斜めのいずれかがPLAYER_NAME2でそろっていれば敗北
      }else if((fields[0][0] == PLAYER_NAME2 && fields[0][1] == PLAYER_NAME2 && fields[0][2] == PLAYER_NAME2) // 縦1列目
            || (fields[1][0] == PLAYER_NAME2 && fields[1][1] == PLAYER_NAME2 && fields[1][2] == PLAYER_NAME2) // 縦2列目
            || (fields[2][0] == PLAYER_NAME2 && fields[2][1] == PLAYER_NAME2 && fields[2][2] == PLAYER_NAME2) // 縦3列目
            || (fields[0][0] == PLAYER_NAME2 && fields[1][0] == PLAYER_NAME2 && fields[2][0] == PLAYER_NAME2) // 横1列目
            || (fields[0][1] == PLAYER_NAME2 && fields[1][1] == PLAYER_NAME2 && fields[2][1] == PLAYER_NAME2) // 横2列目
            || (fields[0][2] == PLAYER_NAME2 && fields[1][2] == PLAYER_NAME2 && fields[2][2] == PLAYER_NAME2) // 横3列目
            || (fields[0][0] == PLAYER_NAME2 && fields[1][1] == PLAYER_NAME2 && fields[2][2] == PLAYER_NAME2) // 斜め1列目
            || (fields[0][2] == PLAYER_NAME2 && fields[1][1] == PLAYER_NAME2 && fields[2][0] == PLAYER_NAME2)) { // 斜め2列目
        // そろっていた場合は敗北
        // 敗北と表示し、最後の状態をプリントする
        System.out.println("★★ 敗北★★");
        System.out.println("  0 1 2");
        System.out.println("  -----");
        for(int j = 0; j < 3; j++){
          System.out.print(j+"|");
          for(int k = 0; k < 3; k++){
            System.out.print(fields[j][k]+" ");
          }
          System.out.println();
        }
        // ゲーム終了なので、ループから抜け出す
        break;
      
      // 勝利でも敗北でもなく9ターン目な場合、すなわち引き分け
      }else if(i == 8){
        // 引き分けと表示し、最後の状態をプリントする
        System.out.println("★★ 引き分け★★");
        System.out.println("  0 1 2");
        System.out.println("  -----");
        for(int j = 0; j < 3; j++){
          System.out.print(j+"|");
          for(int k = 0; k < 3; k++){
            System.out.print(fields[j][k]+" ");
          }
          System.out.println();
        }
      }
      // 上記のどのパターンにも該当しない場合、ゲーム続行

      // 先攻後攻のターンを入れ替える
      turn = !turn;

      // ループの始めに戻る　Line.35
    }

    // ループを抜け出した　→　ゲーム終了
    //Scannerをクローズする。
    scn.close();
  }
}
