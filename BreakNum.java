package class1;
import java.util.*;
public class BreakNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner x = new Scanner(System.in);
		System.out.println("������һ����λ��:");
		int xx = x.nextInt();
		int a = xx/10000;
		int b = (xx%10000)/1000;
		int c = (xx%1000)/100;
		int d = (xx%100)/10;
		int e = xx%10;
		System.out.println("��:"+a+"   "+b+"   "+c+"   "+d+"   "+e);
	}

}
