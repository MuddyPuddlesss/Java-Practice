package class4;
import java.util.*;
public class Add {

	public static double evenAdd(int n) {
		double sum = 0;
		for(int i=2;i<=n;i+=2){
			sum += (1.0/i);
		}
		System.out.println("sum="+sum);
		return sum;
	}
	
	public static double oddAdd(int n) {
		double sum = 0;
		for(int i=1;i<=n;i+=2){
			sum += (1.0/i);
		}
		System.out.println("sum="+sum);
		return sum;
	}
	
	public static void main(String[] args) {
		// 求奇数和偶数的和
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int num = scan.nextInt();
		if( num%2 != 0) {
			oddAdd(num);
		}else {
			evenAdd(num);
		}
	}

}
