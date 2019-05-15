package day4;

public class Child_play {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child.play();
		Child.play();
		System.out.println(Child.getCount()+"个小孩在堆雪人");
	}

}

class Child{
	private static int count;
	
	public static void play(){
		System.out.println("小孩堆雪人..");
		count++;
	}
	public static int getCount(){
		return count;
	}
}
