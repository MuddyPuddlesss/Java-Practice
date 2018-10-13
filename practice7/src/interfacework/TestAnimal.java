package interfacework;

public class TestAnimal {

	public static void main(String[] args) {
		//猫类
		Cat mao = new Cat("波斯猫","褐色");
		mao.show();
		mao.eat("鱼");
		mao.sound();
		System.out.println();
		
		//鱼类
		Fish yu = new Fish("比目鱼","红");
		yu.show();
		yu.eat("虾米");
		yu.sound();
		yu.swim(20);
		System.out.println();
	
		//鸟类
		Bird niao = new Bird(16);
		niao.show();
		niao.eat("小虫");
		niao.sound();
		niao.fly();
	
	}

}
