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
		System.out.println("����Ա������:");
		int people = scan.nextInt();
		double[] Money = new double[people];
		System.out.println("����Ա���Ĺ���:");
		for(int i=0;i<Money.length;i++){
			double personalMoney = scan.nextDouble();
			Money[i] = personalMoney;
			if(Money[i]>high){
				high = Money[i];
			}
			if(Money[i]<low){
				low = Money[i];
			}
			sum += Money[i];
		}
		System.out.println("����Ա���Ĺ���:");
		for(int i=0;i<Money.length;i++){
			System.out.print(Money[i]+" ");
		}
		System.out.println("����Ա����ƽ������Ϊ:"+(sum/people));
		System.out.println("����Ա���Ĺ������Ϊ:"+high);
		System.out.println("����Ա���Ĺ������Ϊ:"+low);
	}
}
