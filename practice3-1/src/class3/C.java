package class3;
import java.util.*;
public class C {

	public static void main(String[] args) {
		// �̳��ɹ�
		Scanner shop = new Scanner(System.in);
		String Goon = null;
		int i=0,j=0,sum=0,high=0,h=0,low=100000000,l=0;
		do{
			i++;
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
						pay *=0.8;
						break;
					case 2:
						System.out.println("������"+pay+"Ԫ������Ϊ��Ա��ѡ�������ÿ�֧������������8.5���Żݣ�����ʵ��֧�����Ϊ"+(pay*0.85)+"Ԫ");
						pay *=0.85;
						break;
					case 3:
						System.out.println("������"+pay+"Ԫ������Ϊ��Ա��ѡ���˽�ǿ�֧������������9���Żݣ�����ʵ��֧�����Ϊ"+(pay*0.9)+"Ԫ");
						pay *=0.9;
						break;
					default:
						System.out.println("��������������[1-3]ѡ��֧����ʽ��");
					}
					break;
				case 0:
					System.out.println("������"+pay+"Ԫ�������ǻ�Ա��ֻ��ʹ���ֽ�֧����ʽ����������9.5���Żݣ�����ʵ��֧�����Ϊ"+(pay*0.95)+"Ԫ");
					pay *=0.95;
					break;
				default:
					System.out.println("��������������[0-1]ѡ���Աʶ��");
				}
			}
			System.out.println("�Ƿ����Ϊ��һλ�˿ͽ���----y.����  ����.�˳�");
			int[] pays = new int[i];
			pays[j] = pay;
			if(pays[j]>high){
				high = pays[j];
				h=j+1;
			}
			if(pays[j]<low){
				low = pays[j];
				l=j+1;
			}
			j++;
			Goon = shop.next();
			sum += pay;
		}while("y".equals(Goon));
		
		System.out.println("�����̳������ܽ��Ϊ:"+sum);
		System.out.println("����Ա���Ĺ������Ϊ:"+high+",�ǵ�"+h+"λ�˿�");
		System.out.println("����Ա���Ĺ������Ϊ:"+low+",�ǵ�"+l+"λ�˿�");
	}

}
