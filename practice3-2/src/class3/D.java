package class3;
import java.util.*;
public class D {

	public static void main(String[] args) {
		// TODO �Զ����ɷ������
		Scanner scan = new Scanner(System.in);
		int Ticket[]={0,0,0,0,0};
		int high=0;
		System.out.println("�೤��ѡ������");
		while(true) {
			System.out.print("Ոݔ������x��:");
			int t = scan.nextInt();
			if(t == 0) {
				System.out.println("ͶƱ������");
				break;
			}else if(t>=1 && t<=5){
				Ticket[t-1]++;
			}else {
				System.out.println("�����������������룡");
			}
		}
		System.out.println("ͶƱ���:");
		for(int i=0;i<Ticket.length;i++){
			System.out.print(Ticket[i]+" ");
			if(Ticket[i]>high){
				high = Ticket[i];
			}	
		}
		System.out.println("���Ʊ��Ϊ:"+high);
	}

}
