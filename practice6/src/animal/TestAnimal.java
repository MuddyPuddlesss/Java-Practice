package animal;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("����è����Ϣ");
		Cat cat = new Cat(null,true,null);
		cat.showAnimal();
		cat.eatFood();
		
		System.out.println("���������Ϣ");
		Fish fish = new Fish(null,true,null);
		fish.showAnimal();
		fish.eatFood();
		
		System.out.println("���������Ϣ");
		Bird bird = new Bird(null,true,null);
		bird.showAnimal();
		bird.eatFood();
	}

}
