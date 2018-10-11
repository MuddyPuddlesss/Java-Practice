package animal;

public class TestAnimal {

	public static void main(String[] args) {
		System.out.println("输入猫的信息");
		Cat cat = new Cat(null,true,null);
		cat.showAnimal();
		cat.eatFood();
		
		System.out.println("输入鱼的信息");
		Fish fish = new Fish(null,true,null);
		fish.showAnimal();
		fish.eatFood();
		
		System.out.println("输入鱼的信息");
		Bird bird = new Bird(null,true,null);
		bird.showAnimal();
		bird.eatFood();
	}

}
