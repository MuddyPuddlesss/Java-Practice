package day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


public class HashSetDemo {

	public static void main(String[] args) {
		//泛型：制定某一个集合，在初始化的时候就确定该集合能够存储的数据类型。保证集合的纯洁性
		Set<Boy> hs = new HashSet<Boy>();
		
		hs.add(new Boy("cat",2));
		
		//1.使用迭代器
		Iterator<Boy> it = hs.iterator();
		while(it.hasNext()){
			Boy boy = it.next();
			System.out.println(boy);
		}
		
		System.out.println("========================");
		//2.增强for循环，因为没有索引|角标，因此不能使用普通for循环
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