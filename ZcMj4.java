package class1;
import java.util.*;
public class ZcMj4 {

	public static void main(String[] args) {
		// 计算三角形周长和面积
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入三角形的边长a:");
		double a = scan.nextDouble();
		System.out.println("请输入三角形的边长b:");
		double b = scan.nextDouble();
		System.out.println("请输入三角形的边长c:");
		double c = scan.nextDouble();
		double d =(a+b+c)/2;
		System.out.println("该长方形的周长为:"+2*d);
		System.out.println("该长方形的面积为:"+ Math.sqrt(d*(d-a)*(d-b)*(d-c)));
	}

}
