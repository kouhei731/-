import java.util.Scanner;

public class Ensyu03 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int bottom = 0;

    while(true){
      System.out.print("底辺の長さを入力：");
      bottom = scn.nextInt();

      if((bottom >= 2) && (bottom <= 20)){

        break;
      }else{
      
        System.out.println("値が正しくありません。2～20までの値を入力して下さい。");
      }
    }

    for(int i = 0; i < bottom ; i++){

      for(int j = 0; j <= i; j++){
        System.out.print("＊");
      }
      System.out.println("");
    }
  }
}