package book;

import java.util.*;

public class TestBook {

	public static void main(String[] args) {
		// 创建包book，完成如下功能
		Book book1 = new Book();
		book1.show();
		Book book2 = new Book();
		book2.show();
		Scanner scan = new Scanner(System.in);	
		System.out.println("请输入书的名称，页数，价格");//输入第一本书信息
		String name = scan.next();
		int page = scan.nextInt();
		double price = scan.nextDouble();
		book1 = new Book(name,page,price);
		
		
		System.out.println("请输入书的名称，页数，价格");//输入第二本书信息
		name = scan.next();
		page = scan.nextInt();
		price = scan.nextDouble();
		book2 = new Book(name,page,price);
		book1.show();
		book2.show();

	}
}

class Book {
	String name = "未知";
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
		System.out.println(name + "共" + page + "页，价格为：" + price + "元");
	}
}