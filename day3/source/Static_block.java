package day4;

public class Static_block {

	public static void main(String[] args) {
		Dog d1 = new Dog();
		Dog d2 = new Dog();
	}

}
class Dog{
	Dog(){
		System.out.println("���췽��ִ��...");
	}
	//��̬����������࣬���ڹ��췽��ִ�У�������ļ��ض����أ���ִֻ��һ��
	//������Ӧ�ã�jdbc�������ݿ��ע������
	static{
		System.out.println("��̬�����ִ��....");
	}
}
