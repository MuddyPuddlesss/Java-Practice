package class4;

import java.util.Scanner;

public class Game {

	public static String choose(int a) {
		String x =null;
		switch(a) {
			case 1:
				x = "石头";break;
			case 2:
				x = "剪刀";break;
			case 3:
				x = "布";break;
		}
		return x;
	}
	
	public static int user() {
		int chose = 0;
		while(true){
			System.out.println("请出拳:");
			Scanner game = new Scanner(System.in);
			chose = game.nextInt();
			String x = choose(chose);
			if(chose>0 && chose<4) {
				System.out.println("玩家的出拳:"+x);
				break;
			}else {
				System.out.println("出拳无效，请重新输入！");
				System.out.println("=====================");
			}
		}
		return chose;
	}
	
	public static int computer(int num) {
		num=(int) (Math.random()*3+1);
		String x = choose(num);
		System.out.println("电脑的出拳:"+x);
		return num;
	}
	
	public static void compare(int chose,int num) {
		if(chose>0 && chose<4) {
			if( (chose==1&&num==2) || (chose==2&&num==3) || (chose==3&&num==1)){
				System.out.println("玩家赢！");
			}else if( (chose==2&&num==1) || (chose==3&&num==2) || (chose==1&&num==3)) {
				System.out.println("电脑赢！");
			}else {
				System.out.println("打平！");
			}
		}
	}
	
	public static void main(String[] args) {
		// 1 - 石头 2 - 剪刀 3 - 布
//		Scanner scan = new Scanner(System.in);
//		int chose = scan.nextInt();
//		int chose =0;
		int num = 0 ;
		compare(user(),computer(num));
	}

}
