package class2;
import java.util.*;
public class four {

	public static void main(String[] args) {
		//�жϸ�������������ż�������������������1~n֮��������ĵ����ͣ������ż��������2~n֮���ż�������͡�
		Scanner num = new Scanner(System.in);
		System.out.println("������һ������:");
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
