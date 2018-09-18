package class2;
import java.util.*;
public class four {

	public static void main(String[] args) {
		//判断该数是奇数还是偶数，如果是奇数，则求1~n之间的奇数的倒数和，如果是偶数，则求2~n之间的偶数倒数和。
		Scanner num = new Scanner(System.in);
		System.out.println("请输入一个数字:");
		int n = num.nextInt();
		double sum =  0;
		if(n%2 == 0){
			for(int i=2;i<=n;i+=2){
				sum += (1.0/i);
			}
		}else{
			for(int i=1;i<=n;i+=2){
				sum += (1.0/i);
			}
		}
		System.out.println("sum="+sum);
	}

}
