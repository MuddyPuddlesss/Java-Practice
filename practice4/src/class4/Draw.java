package class4;
import java.util.*;
public class Draw {

	public static void TestDraw(int a,int b,int c) {
		if(a+b>c && a+c>b && b+c>a) {
			calculateArea(a,b,c);
		} else{
			System.out.println("���������޷����������Σ�");	
		}
	}
	
	public static double calculateArea(int a,int b,int c) {//�������������
		double p = (a+b+c)/2.0;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("�����������Ϊ:"+area);
		return area;
	}
	
	public static void main(String[] args) {
		//����������˵���ߣ�����������ε������
		Scanner scan = new Scanner(System.in);
		System.out.println("������������������:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		TestDraw(a,b,c);
	}
	
}
