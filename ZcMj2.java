package class1;

import java.util.Scanner;

public class ZcMj2 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			System.out.println("请输入正方形的边长:");
			double a = scan.nextDouble();
			System.out.println("该正方形的周长为:"+(a*4));
			System.out.println("该正方形的面积为:"+ (a*a));
	}

}
