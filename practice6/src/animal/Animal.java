package animal;

import java.util.*;

public class Animal {
	Scanner scan = new Scanner(System.in);
	String name;
	boolean sound;
	String color;

	public Animal() {
		name = "����";
		sound = true;
		color = "��ɫ";
	}

	public Animal(String name, boolean sound, String color) {
		System.out.println("���������ƣ��Ƿ���(true/false)����ɫ");
		name = scan.next();
		sound = scan.nextBoolean();
		color = scan.next();
		this.name = name;
		this.sound = sound;
		this.color = color;
	}

	public void eatFood() {
		System.out.println("����һ�������ʲô����");
	}

	public final void showAnimal() {
		if (sound) {
			System.out.println("����һֻ" + color + "ɫ��" + name + "�������");
		} else {
			System.out.println("����һֻ" + color + "ɫ��" + name + "���������");
		}
	}
}

class Cat extends Animal {
	public Cat() {
		name = "��˹؈";
		sound = true;
		color = "��ɫ";
	}

	public Cat(String name, boolean sound, String color) {
		super(name, sound, color);
	}

	public void eatFood() {
		System.out.println("����һֻè���ҳ���");
	}
}

class Fish extends Animal {
	public Fish() {
		name = "����";
		sound = false;
		color = "��ɫ";
	}

	public Fish(String name, boolean sound, String color) {
		super(name, sound, color);
	}

	public void eatFood() {
		System.out.println("����һֻ�㣬�ҳ����");
	}
}

class Bird extends Animal {
	public Bird() {
		name = "��ȸ";
		sound = true;
		color = "��ɫ";
	}

	public Bird(String name, boolean sound, String color) {
		super(name, sound, color);
	}

	public void eatFood() {
		System.out.println("����һֻ���ҳ�С��");
	}
}