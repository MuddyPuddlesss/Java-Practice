package book;

import java.util.*;

public class TestBook {

	// ����main()����������Book����󣬵���Ĭ�Ϲ��췽��Ϊ����
	// ����ʵ������
	// ��ʾ�����������Ϣ����ͨ��������������Ϊ������������Ը�ֵ��
	// ����ʾ�����������Ϣ��
	public static void main(String[] args) {
		// ������book��������¹���
		Scanner scan = new Scanner(System.in);	
		System.out.println("������������ƣ�ҳ�����۸�");//�����һ������Ϣ
		String name = scan.next();
		int page = scan.nextInt();
		double price = scan.nextDouble();
		Book book1 = new Book(name,page,price);
		book1.show();
		
		System.out.println("������������ƣ�ҳ�����۸�");//����ڶ�������Ϣ
		name = scan.next();
		page = scan.nextInt();
		price = scan.nextDouble();
		Book book2 = new Book(name,page,price);
		book2.show();

	}
}

// 1�� ������Book���������³�Ա��
// a) ���ԣ�������ҳ�����۸�
// b) ������
// i. Ĭ�Ϲ��췽�������������Ը���ʼֵΪ��δ֪����0ҳ��0Ԫ
// ii. show()����ʾ��������ֵ
class Book {
	String name = null;
	int page = 0;
	double price = 0;

	public Book(){
		
	}
	
	public Book(String name, int page, double price) {
		this.name = name;
		this.page = page;
		this.price = price;
	}

	public void show() {
		System.out.println(name + "��" + page + "ҳ���۸�Ϊ��" + price + "Ԫ");
	}
}