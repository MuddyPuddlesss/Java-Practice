package class1;
import java.util.*;
public class ZcMj {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入长方形的长:");
		double a = scan.nextDouble();
		System.out.println("请输入长方形的宽:");
		double b = scan.nextDouble();
		System.out.println("该长方形的周长为:"+(a+b)*2);
		System.out.println("该长方形的面积为:"+ (a*b));
	}

}
