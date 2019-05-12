package day8;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Person> hs = new TreeSet<Person>(new MyComparator());
		
		hs.add(new Person("tom",22));
		hs.add(new Person("jerry",18));
		hs.add(new Person("lucy",100));
		hs.add(new Person("zhangsan",18));
		hs.add(new Person("petter",0));
		
		
		
		
		
		//1.ʹ�õ�����
		Iterator<Person> it = hs.iterator();
		while(it.hasNext()){
			Person p = it.next();
			p.show();
		}
		
		
	}

}

//�ڲ��Ƚ���
class Person implements Comparable<Person>{
	private String name;
	private int age;
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//�Լ���д�ȽϹ���
	@Override
	public int compareTo(Person p) {
		return  p.age-this.age==0?this.name.compareTo(p.name):p.age-this.age;//�������ֵΪ���������������У����� ��������
	}
	public void show(){
		System.out.println(name+":"+age);
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	
	
	
}
