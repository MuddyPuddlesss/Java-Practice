package class3;
import java.util.*;
public class D {

	public static void main(String[] args, int x) {
		// TODO 自动生成方法存根
		Scanner scan = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0;
		System.out.println("請輸入你的選擇:");
		while(true) {
			int t = scan.nextInt();
			if(t == 0) {
				System.out.println("投票结束！");
				break;
			}else if(t<=1 && t>=5){
				ticket(t);	
			}else {
				System.out.println("输入有误，请重新输入！");
			}
		}
		System.out.println(a,b,c,d,e);
	}
	public static int ticket(int x){ //投票的選項
		int a=0,b=0,c=0,d=0,e=0;
		switch(x) {
		case 1:
			a++;break;
		case 2:
			b++;break;
		case 3:
			c++;break;
		case 4:
			d++;break;
		case 5:
			e++;break;
		}
		return x;
	}

}
