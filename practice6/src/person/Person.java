package person;

import java.util.*;

public class Person {
	static Scanner scan = new Scanner(System.in);
	String name;
	int age;
	String sex;

	public Person() {
		name = "δ֪";
		age = 0;
		sex = "δ֪";
	}

	public Person(String name, int age, String sex) {
		System.out.println("����������,����,�Ա�:");
		name = scan.next();
		age = scan.nextInt();
		sex = scan.next();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void show() {
		System.out.println("������" + name + " ���䣺" + age + " �Ա�" + sex);
	}
}

class Child extends Person {
	String kindergarten;

	public Child() {
	}
	
	public Child(String name, int age, String sex, String kindergarten) {
		super(name,age,sex);
		System.out.println("�������׶�԰:");
		kindergarten = scan.next();
		this.kindergarten = kindergarten;
	}

	public void show() {
		super.show();
		System.out.println(" �׶�԰:" + kindergarten);
	}

	public void game(String gameName) {
		System.out.println("С������������" + gameName);
	}
}

class Student extends Person {
	String stuClass;

	public Student() {
	}
	
	public Student(String name, int age, String sex, String stuClass) {
		super(name,age,sex);
		System.out.println("������༶:");
		stuClass = scan.next();
		this.stuClass = stuClass;
	}

	public void show() {
		super.show();
		System.out.println(" �༶:" + stuClass);
	}

	public void study(String subject) {
		System.out.println("ѧ����������" + subject);
	}
}