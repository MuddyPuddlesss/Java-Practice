package person;

import java.util.*;

public class Person {
	static Scanner scan = new Scanner(System.in);
	String name;
	int age;
	String sex;

	public Person() {
		name = "未知";
		age = 0;
		sex = "未知";
	}

	public Person(String name, int age, String sex) {
		System.out.println("请输入姓名,年龄,性别:");
		name = scan.next();
		age = scan.nextInt();
		sex = scan.next();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	public void show() {
		System.out.println("姓名：" + name + " 年龄：" + age + " 性别：" + sex);
	}
}

class Child extends Person {
	String kindergarten;

	public Child() {
	}
	
	public Child(String name, int age, String sex, String kindergarten) {
		super(name,age,sex);
		System.out.println("请输入幼儿园:");
		kindergarten = scan.next();
		this.kindergarten = kindergarten;
	}

	public void show() {
		super.show();
		System.out.println(" 幼儿园:" + kindergarten);
	}

	public void game(String gameName) {
		System.out.println("小朋友们正在玩" + gameName);
	}
}

class Student extends Person {
	String stuClass;

	public Student() {
	}
	
	public Student(String name, int age, String sex, String stuClass) {
		super(name,age,sex);
		System.out.println("请输入班级:");
		stuClass = scan.next();
		this.stuClass = stuClass;
	}

	public void show() {
		super.show();
		System.out.println(" 班级:" + stuClass);
	}

	public void study(String subject) {
		System.out.println("学生们正在上" + subject);
	}
}