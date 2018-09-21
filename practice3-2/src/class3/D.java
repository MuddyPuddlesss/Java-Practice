package class3;
import java.util.*;
public class D {

	public static void main(String[] args) {
		// TODO 自动生成方法存根
		Scanner scan = new Scanner(System.in);
		int Ticket[]={0,0,0,0,0};
		int high=0;
		System.out.println("班长竞选！！！");
		while(true) {
			System.out.print("請輸入你的選擇:");
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
		System.out.println("投票结果:");
		for(int i=0;i<Ticket.length;i++){
			System.out.print(Ticket[i]+" ");
			if(Ticket[i]>high){
				high = Ticket[i];
			}	
		}
		System.out.println("最高票数为:"+high);
	}

}
