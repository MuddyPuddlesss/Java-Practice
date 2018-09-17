package class1;

import java.util.Scanner;

public class ZcMj3 {

	public static void main(String[] args) {
		// 计算圆的周长和面积
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入圆的半径:");
		double R = scan.nextDouble();
		System.out.println("该圆形的周长为:"+(Math.PI*R)*2);
		System.out.println("该圆形的面积为:"+ (Math.PI*R*R));

	}

}
