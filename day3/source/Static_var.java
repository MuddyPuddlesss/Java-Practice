package day4;

public class Static_var {

	public static void main(String[] args) {
		double area = Circle.getArea(10);
		System.out.println(area);
		
		area = Circle.getArea(10);
	    System.out.println(area);
	}

}

class Circle{
	//��static���εı��������Ǿ�̬����
	//��̬���������࣬�ܱ���ֱ�ӷ��ʣ�Ҳ�ܱ�������ʣ����������ж����������
	//�ŵ㣺��Ϊ��̬�����ܱ����еĶ�������˿��Բ�����������ݷ���ÿ�����󣬵������ھ�̬�������У���ʡ�˶ѿռ�
	//��̬�����ͳ�Ա����������
	//1.�洢����ͬ����̬�����洢�ھ�̬�������У���Ա�����洢�ڶ�����
	//2.����ʱ����ͬ����̬����������ļ��ض����أ���Ա�������Ŷ���ļ��ض�����
	//3.����Χ��ͬ����̬���������ж�������Ա�������ڸ��Զ���
	//4.�������ʲ�ͬ����̬�������ܱ���̬�������ʣ�Ҳ�ܱ���Ա�������ʣ���Ա����ֻ�ܱ���Ա��������
	//5.������ʽ��ͬ����̬���������������������;��Ա������java��GC�����ں��ʵ�ʱ������
	private String name;//��Ա����
	private static double pi = 3.14;//��̬����
	public void showInfo(){//��Ա����
		System.out.println(this.name+pi);
	}
	public static double getArea(int r){//��̬����
		return r*r*pi;
	}
}
