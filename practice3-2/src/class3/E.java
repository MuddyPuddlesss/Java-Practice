package class3;
import java.util.*;
public class E {

	public static void main(String[] args, int x) {
		// TODO �Զ����ɷ������
		Scanner scan = new Scanner(System.in);
		int Ticket[]={0,0,0,0,0};
		System.out.println("�೤��ѡ������");
		while(true) {
			System.out.println("Ոݔ������x��:");
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
		for(int i=0;i<Ticket.length;i++){
			System.out.println(Ticket[i]);
		}
		
	}

}
