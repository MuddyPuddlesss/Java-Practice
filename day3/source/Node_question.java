package day4;

public class Node_question {
    public static void main(String[] args) {
    	Tigger c1 = new Tigger();//1.. 构造方法执行...1
    	/*Tigger.fun();//2,,,
    	Tigger c2 = new Tigger();//构造方法执行...2
    	Tigger.fun();//3,,,,
*/	}
}
//父类静态变量>父类静态代码块>=父类静态方法>子类静态变量>子类静态代码块>=子类静态方法>

//成员变量>构造方法>成员方法
//父类加载要先于子类，静态加载要先于非静态
class Cat{
	//静态变量有默认初始化，遵循成员变量的默认初始化原则
	private static int i;//1
	static{
		  i++;
		  System.out.println(i+"...");	
	}
	public static void fun(){
		i++;
		System.out.println(i+",,,,");
	}
	public Cat(){
		System.out.println("构造方法执行..."+i);
	}
}
class Tigger extends Cat{
	
}
