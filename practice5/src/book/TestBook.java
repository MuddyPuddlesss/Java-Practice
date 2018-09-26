package book;

import java.util.*;

public class TestBook {

	// 包含main()，创建两个Book类对象，调用默认构造方法为对象
	// 进行实例化，
	// 显示出两本书的信息。再通过键盘输入重新为这两本书的属性赋值，
	// 再显示出两本书的信息。
	public static void main(String[] args) {
		// 创建包book，完成如下功能
		Scanner scan = new Scanner(System.in);	
		System.out.println("请输入书的名称，页数，价格");//输入第一本书信息
		String name = scan.next();
		int page = scan.nextInt();
		double price = scan.nextDouble();
		Book book1 = new Book(name,page,price);
		book1.show();
		
		System.out.println("请输入书的名称，页数，价格");//输入第二本书信息
		name = scan.next();
		page = scan.nextInt();
		price = scan.nextDouble();
		Book book2 = new Book(name,page,price);
		book2.show();

	}
}

// 1、 创建类Book，包含如下成员：
// a) 属性：书名、页数、价格
// b) 方法：
// i. 默认构造方法：给三个属性赋初始值为“未知”、0页、0元
// ii. show()：显示三个属性值
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
		System.out.println(name + "共" + page + "页，价格为：" + price + "元");
	}
}