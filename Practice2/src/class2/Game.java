package class2;
import java.util.*;
public class Game {

	public static void main(String[] args) {
		//����һ����Ϸ�˵���ͼ��ʾ
		Scanner Game =new Scanner(System.in);
		System.out.println("������Ϸ����");
		System.out.println("--------");
		System.out.println("1��	wow");
		System.out.println("2��	����");
		System.out.println("3��	�λ�����");
		System.out.println("4��	����֮��");
		System.out.println("5��	������ol");
		System.out.println("--------");
		System.out.println("��������ѡ�����Ϸ��");
		while(true){
			int chose = Game.nextInt();
			if(chose==1){
				System.out.println("��ѡ����*WOW*");
				break;
			}else if(chose==2){
				System.out.println("��ѡ����*����*");
				break;
			}else if(chose==3){
				System.out.println("��ѡ����*�λ�����*");
				break;
			}else if(chose==4){
				System.out.println("��ѡ����*����֮��*");
				break;
			}else if(chose==5){
				System.out.println("��ѡ����*������ol*");
				break;
			}else{
				System.out.println(">>>>>���������Ϸ�����Ч����������룡��");
				System.out.println("��������ѡ�����Ϸ��");
			}
		}
		while(true){
			System.out.println("�������������Ѿ��浽�ļ��𣺣�");
			int level = Game.nextInt();
			if(level<20 && level>0){
				System.out.println("�������³�é®��С���񣬼ӿ첽����ǰ��ɣ���");
				break;
			}else if(level>20 && level<=40){
				System.out.println("���Ѿ���ʼ���߽���������С�гɾ��ˣ����ͣ���");
				break;
			}else if(level>41 && level<=60){
				System.out.println("���Ѿ���ɨ�����ˣ��������޵л��в�࣬����Ŭ���ɣ���");
				break;
			}else if(level>60){
				System.out.println("���Ѿ������޵��ˣ�̫ţ�ˣ���");
				break;
			}else{
				System.out.println(">>>>>������ĵȼ���Ч����������룡��");
				System.out.println("�������������Ѿ��浽�ļ��𣺣�");
			}
		}
	}
}
