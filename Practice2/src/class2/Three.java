package class2;
import java.util.*;
public class Three {

	public static void main(String[] args) {
		//����forѭ����1��n֮���ż����ƽ����
		Scanner num = new Scanner(System.in);
		int n = num.nextInt();
		int sum = 0;
		if(n>1){
			for(int i=2;i<=n;i+=2){
				sum += i*i; 
			}
			System.out.println(sum);
		}else{
			System.out.println("�������");
		}
		
	}

}
