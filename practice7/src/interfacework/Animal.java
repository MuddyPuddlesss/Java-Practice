package interfacework;

import java.util.*;
//1��	�����ӿ�Animal
public interface Animal {
	String city ="����";
	
	void eat(String food);
	
	void sound();
}
//2��	������Cat��ʵ��Animal�ӿ�
class Cat implements Animal{
	String name;
	String color;
	
	public Cat(String name,String color){
		this.name = name;
		this.color = color;
	}
	
	public void show() {
		System.out.println("����"+city+"��һֻè���ҽ�"+name+","+color+"��");
	}
	@Override
	public void eat(String food) {
		System.out.println("è��"+food);
	}

	@Override
	public void sound() {
		System.out.println("�һ���������");
	}
	
}
//3��	������Fish��ʵ��Animal�ӿ�
class Fish implements Animal{
	String race;
	String color;
	
	public  Fish(String race,String color){
		this.race = race;
		this.color = color;
	}
	
	public void show() {
		System.out.println("����"+city+"��һֻ�㣬����"+race+","+color+"��");
	}
	@Override
	public void eat(String food) {
		System.out.println("���"+food);
	}

	@Override
	public void sound() {
		System.out.println("�Ҳ���У�");
	}
	
	public void swim(int speed) {
		System.out.println("���ε��ٶ�ΪÿСʱ"+speed+"����");
	}
	
}
//4��	������Bird��ʵ��Animal�ӿ�
class Bird implements Animal{
	double length;
	
	public  Bird(double length){
		this.length = length;
	}
	
	public void show() {
		System.out.println("����"+city+"��һֻ�����峤"+length+"CM");
	}
	@Override
	public void eat(String food) {
		System.out.println("���С��");
	}

	@Override
	public void sound() {
		System.out.println("�һ�ߴߴ������");
	}
	public void fly() {
		System.out.println("��ɿ��������");
	}
	
}