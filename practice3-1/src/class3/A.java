package class3;
import java.util.*;
public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Fruit = {"0-葡萄","1-橘子","2-柚子","3-苹果","4-香蕉","5-猕猴桃","6-西瓜","7-哈密瓜","8-圣女果","9-香梨"};
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<Fruit.length;i++){
			System.out.print(Fruit[i]+" ");
		}
		System.out.println();
		
		while(true){
			System.out.println("请输入你想选择 的水果编号:");
			int chose = scan.nextInt();
			if(chose>=0 && chose<Fruit.length){
				System.out.println("你选择的水果为:"+Fruit[chose]);
				break;
			} else {
				System.out.println("输入错误，请重新输入！");
			}
		}
	}
}
