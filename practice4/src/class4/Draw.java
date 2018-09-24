package class4;
import java.util.*;
public class Draw {

	public static void TestDraw(int a,int b,int c) {
		if(a+b>c && a+c>b && b+c>a) {
			calculateArea(a,b,c);
		} else{
			System.out.println("这三条边无法构成三角形！");	
		}
	}
	
	public static double calculateArea(int a,int b,int c) {//计算三角形面积
		double p = (a+b+c)/2.0;
		double area = Math.sqrt(p*(p-a)*(p-b)*(p-c));
		System.out.println("该三角形面积为:"+area);
		return area;
	}
	
	public static void main(String[] args) {
		//给出三角形说三边，计算出三角形的面积！
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三角形三条边:");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		TestDraw(a,b,c);
	}
	
}
