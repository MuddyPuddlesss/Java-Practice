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
			System.out.println("����������������״�ܳ�:(Բ��/������/������/������)");
			draw = scan.next();
			if ("Բ��".equals(draw)) {
				draw1.round(r);
				break;
			} else if ("������".equals(draw)) {
				draw1.round(length, width);
				break;
			} else if ("������".equals(draw)) {
				draw1.round(length);
				break;
			} else if ("������".equals(draw)) {
				int a = 0, b = 0, c = 0;
				draw1.round(a, b, c);
				break;
			} else {
				System.out.println("�����������������룡");
				System.out.println("=====================");
			}
		}
		}
		

}
