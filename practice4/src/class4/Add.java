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
		// ��������ż���ĺ�
		Scanner scan = new Scanner(System.in);
		System.out.println("������һ������:");
		int num = scan.nextInt();
		if( num%2 != 0) {
			oddAdd(num);
		}else {
			evenAdd(num);
		}
	}

}
