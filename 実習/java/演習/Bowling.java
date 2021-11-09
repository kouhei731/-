import java.util.Scanner;
class Bowling {
   public static void main(String[] args){
//フレーム数の繰り返し
   for(int i = 1; i < 3; i++){
   for(int j = 1; i < 2; j++){
   System.out.print("1フレーム　第"+ j + "投目のピンを倒した本数を入力してください　：");
   Scanner scanner = new Scanner(System.in);
   int num1 = scanner.nextInt();
   
//一投目
System.out.println("【スコアを表示】");
System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+--------+");
System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |   10   |");
System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+");
System.out.println("|" + num1 + " |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |");
System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+");
System.out.println("|     |     |     |     |     |     |     |     |     |        |");
System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+--------+");

//二投目
System.out.print("1フレーム　第2投目のピンを倒した本数を入力してください　：");
   int num2 = scanner.nextInt();
   int sum = num1 + num2;

System.out.println("【スコアを表示】");
System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+--------+");
System.out.println("|  1  |  2  |  3  |  4  |  5  |  6  |  7  |  8  |  9  |   10   |");
System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+");
System.out.println("|"  + num1 + " |" + num2 + " |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |  |");
System.out.println("+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+--+");
System.out.println("|" + sum +"    |     |     |     |     |     |     |     |     |        |");
System.out.println("+-----+-----+-----+-----+-----+-----+-----+-----+-----+--------+");
   }
   }
}
}