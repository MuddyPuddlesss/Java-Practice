package day2;

public class Demo {
	public static void main(String[] args) {
		
		try {
			System.out.println("字符串索引越界异常");
			String str = args[0];
			System.out.println("第四个字符为 " + str.charAt(3));
			int aa = Integer.parseInt(args[0]);
			System.out.println("平方为" + aa * aa);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(NumberFormatException e1){
			e1.printStackTrace();
		}


	}
}
