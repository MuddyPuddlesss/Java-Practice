package class3;
import java.util.*;
public class A {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Fruit = {"0-����","1-����","2-����","3-ƻ��","4-�㽶","5-⨺���","6-����","7-���ܹ�","8-ʥŮ��","9-����"};
		Scanner scan = new Scanner(System.in);
		for(int i=0;i<Fruit.length;i++){
			System.out.print(Fruit[i]+" ");
		}
		System.out.println();
		
		while(true){
			System.out.println("����������ѡ�� ��ˮ�����:");
			int chose = scan.nextInt();
			if(chose>=0 && chose<Fruit.length){
				System.out.println("��ѡ���ˮ��Ϊ:"+Fruit[chose]);
				break;
			} else {
				System.out.println("����������������룡");
			}
		}
	}
}
