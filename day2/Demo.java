package day2;

public class Demo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		try {
			System.out.println("�ַ�������Խ���쳣");
			String str = args[0];
			System.out.println("���ĸ��ַ�Ϊ " + str.charAt(3));
			int aa = Integer.parseInt(args[0]);
			System.out.println("ƽ��Ϊ" + aa * aa);
		} catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		} catch(NumberFormatException e1){
			e1.printStackTrace();
		}


	}
}
