package class1;
import java.util.*;
public class Shopping {

	public static void main(String[] args) {
		// �̳��ɹ�
		Scanner shop = new Scanner(System.in);
		System.out.println("�������������ѽ��:");
		int pay = shop.nextInt();
		if(pay<2000) {
			System.out.println("�������ѽ���2000��ֻ��ʹ���ֽ�֧�������������κδ��۵��Żݣ�����ʵ��֧�����Ϊ"+pay+"Ԫ");
		}else {
			System.out.println("���������Ƿ�Ϊ��Ա��1 - ��Ա��0 - �ǻ�Ա����");
			int isVip = shop.nextInt();
			switch(isVip) {
			case 1:
				System.out.println("����������֧����ʽ��1-�ֽ�֧�� 2-���ÿ�֧�� ����-��ǿ�֧������");
				int PayWay = shop.nextInt();
				switch(PayWay) {
				case 1:
					System.out.println("������"+pay+"Ԫ������Ϊ��Ա��ѡ�����ֽ�֧������������8���Żݣ�����ʵ��֧�����Ϊ"+(pay*0.8)+"Ԫ");
					break;
				case 2:
					System.out.println("������"+pay+"Ԫ������Ϊ��Ա��ѡ�������ÿ�֧������������8.5���Żݣ�����ʵ��֧�����Ϊ"+(pay*0.85)+"Ԫ");
					break;
				case 3:
					System.out.println("������"+pay+"Ԫ������Ϊ��Ա��ѡ���˽�ǿ�֧������������9���Żݣ�����ʵ��֧�����Ϊ"+(pay*0.9)+"Ԫ");
					break;
				default:
					System.out.println("��������������[1-3]ѡ��֧����ʽ��");
				}
				break;
			case 0:
				System.out.println("������"+pay+"Ԫ�������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Żݣ�����ʵ��֧�����Ϊ"+(pay*0.95)+"Ԫ");
				break;
			default:
				System.out.println("��������������[0-1]ѡ���Աʶ��");
			}
		}
	}

}
