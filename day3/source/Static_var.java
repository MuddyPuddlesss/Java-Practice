package day4;

public class Static_var {

	public static void main(String[] args) {
		double area = Circle.getArea(10);
		System.out.println(area);
		
		area = Circle.getArea(10);
	    System.out.println(area);
	}

}

class Circle{
	//被static修饰的变量，就是静态变量
	//静态变量属于类，能被类直接访问，也能被对象访问，而且是所有对象共享的数据
	//优点：因为静态变量能被所有的对象共享，因此可以不将共享的数据放在每个对象，单独放在静态方法区中，节省了堆空间
	//静态变量和成员变量的区别：
	//1.存储区域不同：静态变量存储在静态方法区中；成员变量存储在堆区中
	//2.加载时机不同：静态变量随着类的加载而加载；成员变量随着对象的加载而加载
	//3.共享范围不同：静态变量被所有对象共享；成员变量属于各自对象
	//4.方法访问不同：静态变量即能被静态方法访问，也能被成员方法访问；成员变量只能被成员方法访问
	//5.消亡方式不同：静态变量随着类的消亡而消亡;成员变量被java的GC机制在合适的时机回收
	private String name;//成员变量
	private static double pi = 3.14;//静态变量
	public void showInfo(){//成员方法
		System.out.println(this.name+pi);
	}
	public static double getArea(int r){//静态方法
		return r*r*pi;
	}
}
