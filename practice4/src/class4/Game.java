package class4;

import java.util.Scanner;

public class Game {

	public static String choose(int a) {
		String x =null;
		switch(a) {
			case 1:
				x = "ʯͷ";break;
			case 2:
				x = "����";break;
			case 3:
				x = "��";break;
		}
		return x;
	}
	
	public static int user() {
		int chose = 0;
		while(true){
			System.out.println("���ȭ:");
			Scanner game = new Scanner(System.in);
			chose = game.nextInt();
			String x = choose(chose);
			if(chose>0 && chose<4) {
				System.out.println("��ҵĳ�ȭ:"+x);
				break;
			}else {
				System.out.println("��ȭ��Ч�����������룡");
				System.out.println("=====================");
			}
		}
		return chose;
	}
	
	public static int computer(int num) {
		num=(int) (Math.random()*3+1);
		String x = choose(num);
		System.out.println("���Եĳ�ȭ:"+x);
		return num;
	}
	
	public static void compare(int chose,int num) {
		if(chose>0 && chose<4) {
			if( (chose==1&&num==2) || (chose==2&&num==3) || (chose==3&&num==1)){
				System.out.println("���Ӯ��");
			}else if( (chose==2&&num==1) || (chose==3&&num==2) || (chose==1&&num==3)) {
				System.out.println("����Ӯ��");
			}else {
				System.out.println("��ƽ��");
			}
		}
	}
	
	public static void main(String[] args) {
		// 1 - ʯͷ 2 - ���� 3 - ��
//		Scanner scan = new Scanner(System.in);
//		int chose = scan.nextInt();
//		int chose =0;
		int num = 0 ;
		compare(user(),computer(num));
	}

}
