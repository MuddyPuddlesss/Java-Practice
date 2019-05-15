package day4;

public class Static_method {

	public static void main(String[] args) {
		Person p = new Person("小花");
		Person.sleep();
		

	}

}
class Person{
	private String name;
	public Person(String name){
		this.name = name;		
	}
	//成员方法属于对象
	public  void showInfo(){
		System.out.println("名字是"+name);
	}
	//被static修饰的方法就是静态方法
	//优点：通过类名直接访问，无需创建对象，因此在某种程度上可以节省堆空间
	//分析方法是否需要修改为静态方法的原则：是否访问了对象数据。是否上下文相关
	//特点：静态方法属于类，因此他随着类的加载而加载，早于对象加载
	//静态方法和成员方法的区别：
	//1.静态方法属于类，静态方法能被类及对象方法；成员方法属于对象，只能被对象访问
	//2.静态方法随着类的加载而加载；成员方法随着对象的加载而加载
	//3.静态方法不能访问成员变量；成员方法能访问成员变量
	//4.
	public static void sleep(){
		System.out.println("呼呼Zzzz....");
	}
}
