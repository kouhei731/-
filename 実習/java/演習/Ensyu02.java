import java.util.Scanner; 

public class Ensyu02 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int row = 0;
    int column = 0;

    while(true){
      System.out.print("行数の入力：");
      row = scn.nextInt();
      System.out.print("列数の入力：");
      column = scn.nextInt();

      if(row < 1 || row > 20 || column < 1 || column > 20){
        System.out.println("値が正しくありません。1~20までの値を入力してください。");
      }else{
        break;
      }
    }

    for(int i = 0; i < row ; i++){
      for(int j = 0; j < column; j++){
        System.out.print("＊");
      }
      System.out.println("");
    }
  }
}
