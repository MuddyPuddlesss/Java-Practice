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

	//����Բ�ε��ܳ���������ʾԲ�İ뾶
	public void round(double r) {
		System.out.println("������Բ�İ뾶:");
		r = scan.nextDouble();
		drawRound = 2*r*Math.PI;
		System.out.println("Բ���ܳ�:"+drawRound);
	}
	
	//���㳤���ε��ܳ���������ʾ�����εĳ����
	public void round(int length,int width) {
		System.out.println("�����볤���γ��Ϳ�:");
		length = scan.nextInt();
		width = scan.nextInt();
		drawRound = (length+width)*2;
		System.out.println("�����ε��ܳ�:"+drawRound);
	}
	
	//���������ε��ܳ���������ʾ�����εı߳�
	public void round(int length) {
		System.out.println("�����������α߳�:");
		length = scan.nextInt();
		drawRound = 4*length;
		System.out.println("�����ε��ܳ�:"+drawRound);
	}
	
	//���������ε��ܳ���������ʾ�����ε������ߡ�
	public void round(int a,int b,int c) {
		System.out.println("����������������:");
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();
		if(a+b>c && a+c>b && b+c>a) {
			drawRound = a+b+c;
			System.out.println("�����ε��ܳ�:"+drawRound);
		}else {
			System.out.println("����������߲��ܹ���������,���ܼ���!");
		}
	}
}
