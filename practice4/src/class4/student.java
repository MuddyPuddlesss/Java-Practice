package class4;

import java.util.Scanner;

public class student {

	public static boolean validate(int score) {
		if (score>0 && score<=100) {
			return true;
		}else {
			return false;
		}
	}
	
	public static void convert(int score) {
		if(score>=90 && score<=100) {
			System.out.println("��ѧ���ĳɼ�"+score+"��:A�ȼ�");
		}else if(score>=80 && score<90) {
			System.out.println("��ѧ���ĳɼ�"+score+"��:B�ȼ�");
		}else if(score>=70 && score<80) {
			System.out.println("��ѧ���ĳɼ�"+score+"��:C�ȼ�");
		}else if(score>=60 && score<70) {
			System.out.println("��ѧ���ĳɼ�"+score+"��:D�ȼ�");
		}else {
			System.out.println("��ѧ���ĳɼ�"+score+"��:X�ȼ�");
		}
	}
	
	public static void main(String[] args) {
		//�ж�ѧ���ɼ�����Ч�Լ��ɼ�ת���Ĺ���
		System.out.println("������ѧ���ĳɼ�:");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		boolean test = validate(score);
		if(test) {
			convert(score);
		}else {
			System.out.println("�ɼ���Ч");
		}
	}

}
