package class3;
import java.util.*;
public class E {

	public static void main(String[] args, int x) {
		// TODO 自动生成方法存根
		Scanner scan = new Scanner(System.in);
		int Ticket[]={0,0,0,0,0};
		System.out.println("班长竞选！！！");
		while(true) {
			System.out.println("請輸入你的選擇:");
			int t = scan.nextInt();
			if(t == 0) {
				System.out.println("投票结束！");
				break;
			}else if(t>=1 && t<=5){
				Ticket[t-1]++;
			}else {
				System.out.println("输入有误，请重新输入！");
			}
		}
		for(int i=0;i<Ticket.length;i++){
			System.out.println(Ticket[i]);
		}
		
	}

}
