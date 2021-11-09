class Janken {
	public static void main(String[] args){

		System.out.println("じゃんけんスタート");

		HumanPlayer hp = new HumanPlayer();
		hp.print();
		ComputerPlayer cp = new ComputerPlayer();
		cp.print();
		int hn = hp.getNum();
		int cn = cp.getNum();
		if ((hn == 1 && cn == 1) || (hn == 2 && cn == 2) || (hn == 3 && cn == 0))
			System.out.println("あなたの勝ちです！");
		else if ((hn == 1 && cn == 2) || (hn == 2 && cn == 0) || (hn == 3 && cn == 1))
			System.out.println("あなたの負けです…");
		else
			System.out.println("あいこです。");
	}
}

public abstract class Player{
	public abstract String toString();
	public void print(){
		System.out.println(toString());
	}
}
import java.util.Scanner;

public class HumanPlayer extends Player {
	Scanner stdIn = new Scanner(System.in);
	private int num;
	public HumanPlayer() {
		System.out.print("グー…1/チョキ…2/パー…3 :");
		int hn = stdIn.nextInt();
		this.num = hn;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		if(num == 1){
			return "あなた：パー";
		}
		if(num == 2){
			return "あなた：チョキ";
		}
		if(num == 3){
			return "あなた：グー";
		}
		else{
			return "エラー: 指定された値を入力してください";
		}
	}
}

import java.util.Random;

public class ComputerPlayer extends Player{
	Random rand  = new Random();

	private int num;
	public ComputerPlayer() {
		int cn  = rand.nextInt(3);
		this.num = cn;
	}
	public int getNum() {
		return num;
	}
	public String toString() {
		if(num == 0) {
			return "コンピュータ：パー";
		}
		if(num == 1) {
			return "コンピュータ：チョキ";
		}
		else {
			return "コンピュータ：グー";
		}
	}
}
