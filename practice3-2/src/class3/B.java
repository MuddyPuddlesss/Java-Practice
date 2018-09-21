package class3;
import java.util.*;
public class B {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		double sum = 0,high = 0,low=100000;
		String highN = null , lowN = null;
		System.out.println("输入员工个数:");
		int people = scan.nextInt();
		double[] Money = new double[people];
		String[] Name = new String[people];
		for(int i=0;i<Money.length;i++){
			System.out.println("==============");
			System.out.print("输入员工的姓名:");
			String personalName = scan.next();
			System.out.print("输入员工的工资:");
			double personalMoney = scan.nextDouble();
			Name[i] = personalName;
			Money[i] = personalMoney;
			if(Money[i]>high){
				high = Money[i];
				highN = Name[i];
			}
			if(Money[i]<low){
				low = Money[i];
				lowN = Name[i];
			}
			sum += Money[i];
		}
		System.out.println("所有员工的工资:");
		for(int i=0;i<Money.length;i++){
			System.out.print(Name[i]+":"+Money[i]+" ");
		}
		System.out.println();
		System.out.println("所有员工的平均工资为:"+(sum/people));
		System.out.println();
		System.out.println("所有员工的工资最高为:"+highN+"的"+high);
		System.out.println();
		System.out.println("所有员工的工资最低为:"+lowN+"的"+low);
	}
}
