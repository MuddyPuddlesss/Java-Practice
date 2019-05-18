package day4;

public class Static_block {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
	}

}
class Dog{
	Dog(){
		System.out.println("构造方法执行...");
	}
	//静态代码块属于类，先于构造方法执行，随着类的加载而加载，但只执行一次
	//开发中应用：jdbc链接数据库的注册驱动
	static{
		System.out.println("静态代码块执行....");
	}
}
