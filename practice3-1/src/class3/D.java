package class3;
import java.util.*;
public class D {

	public static void main(String[] args, int x) {
		// TODO �Զ����ɷ������
		Scanner scan = new Scanner(System.in);
		int a=0,b=0,c=0,d=0,e=0;
		System.out.println("Ոݔ������x��:");
		while(true) {
			int t = scan.nextInt();
			if(t == 0) {
				System.out.println("ͶƱ������");
				break;
			}else if(t<=1 && t>=5){
				ticket(t);	
			}else {
				System.out.println("�����������������룡");
			}
		}
		System.out.println(a,b,c,d,e);
	}
	public static int ticket(int x){ //ͶƱ���x�
		int a=0,b=0,c=0,d=0,e=0;
		switch(x) {
		case 1:
			a++;break;
		case 2:
			b++;break;
		case 3:
			c++;break;
		case 4:
			d++;break;
		case 5:
			e++;break;
		}
		return x;
	}

}
