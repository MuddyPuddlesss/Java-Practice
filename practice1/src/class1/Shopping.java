package class1;
import java.util.*;
public class Shopping {

	public static void main(String[] args) {
		// 商场采购
		Scanner shop = new Scanner(System.in);
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
					break;
				case 2:
					System.out.println("您消费"+pay+"元，并且为会员，选择了信用卡支付，可以享受8.5折优惠，您的实际支付金额为"+(pay*0.85)+"元");
					break;
				case 3:
					System.out.println("您消费"+pay+"元，并且为会员，选择了借记卡支付，可以享受9折优惠，您的实际支付金额为"+(pay*0.9)+"元");
					break;
				default:
					System.out.println("请重新输入数字[1-3]选择支付方式：");
				}
				break;
			case 0:
				System.out.println("您消费"+pay+"元，但不是会员，只能使用现金支付方式，可以享受9.5折优惠，您的实际支付金额为"+(pay*0.95)+"元");
				break;
			default:
				System.out.println("请重新输入数字[0-1]选择会员识别");
			}
		}
	}

}
