package class2;
import java.util.*;
public class ChengAdd {

	public static void main(String[] args) {
		// ����1*2*3+4*5*6+��+100*101*102��ֵ
		int sum=0;
		for(int i=1;i<=102;i++){
			sum += i*(i+1)*(i+2);
			i=i+2;
		}
		System.out.println(sum);
	}

}
