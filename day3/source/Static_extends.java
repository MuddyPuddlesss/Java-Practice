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
		System.out.println("���ྲ̬�����ִ��..."+i);//1
		i++;
	}
	Father(){
		i++;
		System.out.println("���๹�췽��ִ��"+i);//3
	}
}
class Son extends Father{
	static{
		i++;
		System.out.println("���ྲ̬�����ִ��..."+i);//2
	}
	Son(){
		i++;
		System.out.println("���๹�췽��ִ��"+i);//4
	}
}
