package day4;

public class Static_method {

	public static void main(String[] args) {
		Person p = new Person("С��");
		Person.sleep();
		

	}

}
class Person{
	private String name;
	public Person(String name){
		this.name = name;		
	}
	//��Ա�������ڶ���
	public  void showInfo(){
		System.out.println("������"+name);
	}
	//��static���εķ������Ǿ�̬����
	//�ŵ㣺ͨ������ֱ�ӷ��ʣ����贴�����������ĳ�̶ֳ��Ͽ��Խ�ʡ�ѿռ�
	//���������Ƿ���Ҫ�޸�Ϊ��̬������ԭ���Ƿ�����˶������ݡ��Ƿ����������
	//�ص㣺��̬���������࣬�����������ļ��ض����أ����ڶ������
	//��̬�����ͳ�Ա����������
	//1.��̬���������࣬��̬�����ܱ��༰���󷽷�����Ա�������ڶ���ֻ�ܱ��������
	//2.��̬����������ļ��ض����أ���Ա�������Ŷ���ļ��ض�����
	//3.��̬�������ܷ��ʳ�Ա��������Ա�����ܷ��ʳ�Ա����
	//4.
	public static void sleep(){
		System.out.println("����Zzzz....");
	}
}
