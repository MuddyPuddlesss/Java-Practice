package book;

import java.util.*;

public class TestBook {

	public static void main(String[] args) {
		// ������book��������¹���
		Book book1 = new Book();
		book1.show();
		Book book2 = new Book();
		book2.show();
		Scanner scan = new Scanner(System.in);	
		System.out.println("������������ƣ�ҳ�����۸�");//�����һ������Ϣ
		String name = scan.next();
		int page = scan.nextInt();
		double price = scan.nextDouble();
		book1 = new Book(name,page,price);
		
		
		System.out.println("������������ƣ�ҳ�����۸�");//����ڶ�������Ϣ
		name = scan.next();
		page = scan.nextInt();
		price = scan.nextDouble();
		book2 = new Book(name,page,price);
		book1.show();
		book2.show();

	}
}

class Book {
	String name = "δ֪";
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