package day4;

public class Node_question {
    public static void main(String[] args) {
    	Tigger c1 = new Tigger();//1.. ���췽��ִ��...1
    	/*Tigger.fun();//2,,,
    	Tigger c2 = new Tigger();//���췽��ִ��...2
    	Tigger.fun();//3,,,,
*/	}
}
//���ྲ̬����>���ྲ̬�����>=���ྲ̬����>���ྲ̬����>���ྲ̬�����>=���ྲ̬����>

//��Ա����>���췽��>��Ա����
//�������Ҫ�������࣬��̬����Ҫ���ڷǾ�̬
class Cat{
	//��̬������Ĭ�ϳ�ʼ������ѭ��Ա������Ĭ�ϳ�ʼ��ԭ��
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
		System.out.println("���췽��ִ��..."+i);
	}
}
class Tigger extends Cat{
	
}
