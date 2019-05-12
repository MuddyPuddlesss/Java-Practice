package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetDemo {

	public static void main(String[] args) {
		//���ͣ��ƶ�ĳһ�����ϣ��ڳ�ʼ����ʱ���ȷ���ü����ܹ��洢���������͡���֤���ϵĴ�����
		Set<Boy> hs = new HashSet<Boy>();
		
		hs.add(new Boy("cat",2));
		
		//1.ʹ�õ�����
		Iterator<Boy> it = hs.iterator();
		while(it.hasNext()){
			Boy boy = it.next();
			System.out.println(boy);
		}
		
		System.out.println("========================");
		//2.��ǿforѭ������Ϊû������|�Ǳ꣬��˲���ʹ����ͨforѭ��
		for (Object object : hs) {
			System.out.println(object);
		}
		

	}

}

class Boy{
	private String name;
	private int age;
	public Boy(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void show(){
		System.out.println(name+":"+age);
	}
	
	
}