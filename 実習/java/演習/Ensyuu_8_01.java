
import java.util.Scanner;

/**
 * 人間クラスの利用（演習8-1）
 * @author yoshiki-satoh
 *
 */
public class Ensyuu_8_01 {

	/**
	 * メインメソッド
	 * @param args　起動時に指定する値（未使用）
	 */
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		// 
		// 情報入力
		System.out.print("人数：");
		int n = stdIn.nextInt();
		
		Human[] humanArray = new Human[n];
		
		System.out.println();
		for (int i = 0; i < n; i++) {
			Human newHuman = null;
			boolean flg = false;
			
			// 入力内容に不正がある場合は何度でも再入力を促す
			do {
				System.out.println((i + 1) +"人目");
				System.out.print("　　名前：");
				String name = stdIn.next();
				System.out.print("　　身長：");
				int height = stdIn.nextInt();
				System.out.print("　　体重：");
				int weight = stdIn.nextInt();
				System.out.print("　　年齢：");
				int old = stdIn.nextInt();
				System.out.print("　　性別（1:男性／2:女性）：");
				int sex = stdIn.nextInt();
				
				// 入力内容のチェック
				flg = Human.check(name, height, weight, old, sex);
				if (!flg) {
					System.out.println();
					System.out.println("入力内容に不正があります。再度入力してください");
					System.out.println();
				} else {
					// インスタンス化
					newHuman = new Human(name, height, weight, old, sex);
				}
			} while(!flg);

			humanArray[i] = newHuman;
			
			System.out.println();
		}
		
		//
		// 入力された情報を表示
		//
		for (int i = 0; i < humanArray.length; i++) {
			
			System.out.println("===== " + (i + 1) + "人目 =====");
			humanArray[i].printStatus();
			System.out.println();
		}
		

		stdIn.close();
	}
}
