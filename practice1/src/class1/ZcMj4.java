package class1;
import java.util.*;
public class ZcMj4 {

	public static void main(String[] args) {
		// �����������ܳ������
		Scanner scan = new Scanner(System.in);
		System.out.println("�����������εı߳�a:");
		double a = scan.nextDouble();
		System.out.println("�����������εı߳�b:");
		double b = scan.nextDouble();
		System.out.println("�����������εı߳�c:");
		double c = scan.nextDouble();
		double d =(a+b+c)/2;
		System.out.println("�ó����ε��ܳ�Ϊ:"+2*d);
		System.out.println("�ó����ε����Ϊ:"+ Math.sqrt(d*(d-a)*(d-b)*(d-c)));
	}

}
