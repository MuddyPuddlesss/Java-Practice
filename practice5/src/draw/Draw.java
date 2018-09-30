package draw;

import java.util.Scanner;

public class Draw {
	
	static Scanner scan = new Scanner(System.in);
	private double drawRound;

	public Draw() {
		drawRound = 0;
	}
	
	public double getRoud() {
		return drawRound;
	}

	//计算圆形的周长，参数表示圆的半径
	public void round(double r) {
		System.out.println("请输入圆的半径:");
		r = scan.nextDouble();
		drawRound = 2*r*Math.PI;
		System.out.println("圆的周长:"+drawRound);
	}
	
	//计算长方形的周长，参数表示长方形的长与宽
	public void round(int length,int width) {
		System.out.println("请输入长方形长和宽:");
		length = scan.nextInt();
		width = scan.nextInt();
		drawRound = (length+width)*2;
		System.out.println("长方形的周长:"+drawRound);
	}
	
	//计算正方形的周长，参数表示正方形的边长
	public void round(int length) {
		System.out.println("请输入正方形边长:");
		length = scan.nextInt();
		drawRound = 4*length;
		System.out.println("正方形的周长:"+drawRound);
	}
	
	//计算三角形的周长，参数表示三角形的三条边。
	public void round(int a,int b,int c) {
		System.out.println("请输入三角形三边:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a+b>c && a+c>b && b+c>a) {
			drawRound = a+b+c;
			System.out.println("三角形的周长:"+drawRound);
		}else {
			System.out.println("输入的三条边不能构成三角形,不能计算!");
		}
	}
}
