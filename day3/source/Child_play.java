package day4;

public class Child_play {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Child.play();
		Child.play();
		System.out.println(Child.getCount()+"��С���ڶ�ѩ��");
	}

}

class Child{
	private static int count;
	
	public static void play(){
		System.out.println("С����ѩ��..");
		count++;
	}
	public static int getCount(){
		return count;
	}
}
