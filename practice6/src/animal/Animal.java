package animal;

import java.util.*;

public class Animal {
	Scanner scan = new Scanner(System.in);
	String name;
	boolean sound;
	String color;

	public Animal() {
		name = "怪物";
		sound = true;
		color = "黑色";
	}

	public Animal(String name, boolean sound, String color) {
		System.out.println("请输入名称，是否会叫(true/false)，颜色");
		name = scan.next();
		sound = scan.nextBoolean();
		color = scan.next();
		this.name = name;
		this.sound = sound;
		this.color = color;
	}

	public void eatFood() {
		System.out.println("我是一个动物，我什么都吃");
	}

	public final void showAnimal() {
		if (sound) {
			System.out.println("这是一只" + color + "色的" + name + "，它会叫");
		} else {
			System.out.println("这是一只" + color + "色的" + name + "，它不会叫");
		}
	}
}

class Cat extends Animal {
	public Cat() {
		name = "波斯貓";
		sound = true;
		color = "白色";
	}

	public Cat(String name, boolean sound, String color) {
		super(name, sound, color);
	}

	public void eatFood() {
		System.out.println("我是一只猫，我吃鱼");
	}
}

class Fish extends Animal {
	public Fish() {
		name = "金鱼";
		sound = false;
		color = "红色";
	}

	public Fish(String name, boolean sound, String color) {
		super(name, sound, color);
	}

	public void eatFood() {
		System.out.println("我是一只鱼，我吃蚯蚓");
	}
}

class Bird extends Animal {
	public Bird() {
		name = "麻雀";
		sound = true;
		color = "褐色";
	}

	public Bird(String name, boolean sound, String color) {
		super(name, sound, color);
	}

	public void eatFood() {
		System.out.println("我是一只鸟，我吃小虫");
	}
}