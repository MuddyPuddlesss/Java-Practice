package interfacework;

import java.util.*;
//1、	创建接口Animal
public interface Animal {
	String city ="大连";
	
	void eat(String food);
	
	void sound();
}
//2、	创建类Cat，实现Animal接口
class Cat implements Animal{
	String name;
	String color;
	
	public Cat(String name,String color){
		this.name = name;
		this.color = color;
	}
	
	public void show() {
		System.out.println("我是"+city+"的一只猫，我叫"+name+","+color+"的");
	}
	@Override
	public void eat(String food) {
		System.out.println("猫吃"+food);
	}

	@Override
	public void sound() {
		System.out.println("我会喵喵喵！");
	}
	
}
//3、	创建类Fish，实现Animal接口
class Fish implements Animal{
	String race;
	String color;
	
	public  Fish(String race,String color){
		this.race = race;
		this.color = color;
	}
	
	public void show() {
		System.out.println("我是"+city+"的一只鱼，我是"+race+","+color+"的");
	}
	@Override
	public void eat(String food) {
		System.out.println("鱼吃"+food);
	}

	@Override
	public void sound() {
		System.out.println("我不会叫！");
	}
	
	public void swim(int speed) {
		System.out.println("鱼游的速度为每小时"+speed+"公里");
	}
	
}
//4、	创建类Bird，实现Animal接口
class Bird implements Animal{
	double length;
	
	public  Bird(double length){
		this.length = length;
	}
	
	public void show() {
		System.out.println("我是"+city+"的一只鸟，我体长"+length+"CM");
	}
	@Override
	public void eat(String food) {
		System.out.println("鸟吃小虫");
	}

	@Override
	public void sound() {
		System.out.println("我会叽叽喳喳！");
	}
	public void fly() {
		System.out.println("我煽动翅膀起飞");
	}
	
}