package class1;
import java.util.*;
public class EatApple {

	public static void main(String[] args) {
		// 摘苹果
		Scanner pg = new Scanner(System.in);
		System.out.println("请输入小红摘的苹果数:");
		int a = pg.nextInt();
		System.out.println("1个小朋友一共摘了"+a+"个苹果");
		System.out.println("请输入小刚摘的苹果数:");
		int b = pg.nextInt();
		System.out.println("2个小朋友一共摘了"+(a+b)+"个苹果");
		System.out.println("请输入小胖摘的苹果数:");
		int c = pg.nextInt();
		System.out.println("3个小朋友一共摘了"+(a+b+c)+"个苹果");
		System.out.println("请输入小李摘的苹果数:");
		int d = pg.nextInt();
		System.out.println("4个小朋友一共摘了"+(a+b+c+d)+"个苹果");
	}

}
