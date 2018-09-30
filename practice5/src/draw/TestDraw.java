package draw;

import java.util.*;

public class TestDraw {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Draw draw1 = new Draw();
		double r = 0;
		int length = 0, width = 0;
		String draw = null;

		while (true) {
			System.out.println("请输入你想计算的形状周长:(圆形/长方形/正方形/三角形)");
			draw = scan.next();
			if ("圆形".equals(draw)) {
				draw1.round(r);
				break;
			} else if ("长方形".equals(draw)) {
				draw1.round(length, width);
				break;
			} else if ("正方形".equals(draw)) {
				draw1.round(length);
				break;
			} else if ("三角形".equals(draw)) {
				int a = 0, b = 0, c = 0;
				draw1.round(a, b, c);
				break;
			} else {
				System.out.println("输入有误，请重新输入！");
				System.out.println("=====================");
			}
		}
		}
		

}
