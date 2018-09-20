package class3;
import java.util.*;
public class C {

	public static void main(String[] args) {
		// 商场采购
		Scanner shop = new Scanner(System.in);
		String Goon = null;
		int i=0,j=0,sum=0,high=0,h=0,low=100000000,l=0;
		do{
			i++;
			System.out.println("请输入您的消费金额:");
			int pay = shop.nextInt();
			if(pay<2000) {
				System.out.println("您的消费金额不足2000，只能使用现金支付，不能享受任何打折的优惠，您的实际支付金额为"+pay+"元");
			}else {
				System.out.println("请输入您是否为会员（1 - 会员，0 - 非会员）：");
				int isVip = shop.nextInt();
				switch(isVip) {
				case 1:
					System.out.println("请输入您的支付方式（1-现金支付 2-信用卡支付 其它-借记卡支付）：");
					int PayWay = shop.nextInt();
					switch(PayWay) {
					case 1:
						System.out.println("您消费"+pay+"元，并且为会员，选择了现金支付，可以享受8折优惠，您的实际支付金额为"+(pay*0.8)+"元");
						pay *=0.8;
						break;
					case 2:
						System.out.println("您消费"+pay+"元，并且为会员，选择了信用卡支付，可以享受8.5折优惠，您的实际支付金额为"+(pay*0.85)+"元");
						pay *=0.85;
						break;
					case 3:
						System.out.println("您消费"+pay+"元，并且为会员，选择了借记卡支付，可以享受9折优惠，您的实际支付金额为"+(pay*0.9)+"元");
						pay *=0.9;
						break;
					default:
						System.out.println("请重新输入数字[1-3]选择支付方式：");
					}
					break;
				case 0:
					System.out.println("您消费"+pay+"元，但不是会员，只能使用现金支付方式，可以享受9.5折优惠，您的实际支付金额为"+(pay*0.95)+"元");
					pay *=0.95;
					break;
				default:
					System.out.println("请重新输入数字[0-1]选择会员识别");
				}
			}
			System.out.println("是否继续为下一位顾客结账----y.继续  其他.退出");
			int[] pays = new int[i];
			pays[j] = pay;
			if(pays[j]>high){
				high = pays[j];
				h=j+1;
			}
			if(pays[j]<low){
				low = pays[j];
				l=j+1;
			}
			j++;
			Goon = shop.next();
			sum += pay;
		}while("y".equals(Goon));
		
		System.out.println("今日商场收入总金额为:"+sum);
		System.out.println("所有员工的工资最高为:"+high+",是第"+h+"位顾客");
		System.out.println("所有员工的工资最高为:"+low+",是第"+l+"位顾客");
	}

}
