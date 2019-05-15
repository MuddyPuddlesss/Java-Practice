package day4;

public class Static_extends {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Son s = new Son();
	}

}
class Father{
	static int i;
	static{
		System.out.println("父类静态代码块执行..."+i);//1
		i++;
	}
	Father(){
		i++;
		System.out.println("父类构造方法执行"+i);//3
	}
}
class Son extends Father{
	static{
		i++;
		System.out.println("子类静态代码块执行..."+i);//2
	}
	Son(){
		i++;
		System.out.println("子类构造方法执行"+i);//4
	}
}
