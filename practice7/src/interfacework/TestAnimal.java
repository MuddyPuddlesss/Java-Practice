package interfacework;

public class TestAnimal {

	public static void main(String[] args) {
		//è��
		Cat mao = new Cat("��˹è","��ɫ");
		mao.show();
		mao.eat("��");
		mao.sound();
		System.out.println();
		
		//����
		Fish yu = new Fish("��Ŀ��","��");
		yu.show();
		yu.eat("Ϻ��");
		yu.sound();
		yu.swim(20);
		System.out.println();
	
		//����
		Bird niao = new Bird(16);
		niao.show();
		niao.eat("С��");
		niao.sound();
		niao.fly();
	
	}

}
