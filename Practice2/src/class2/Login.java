package class2;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		//ģ���¼����
		Scanner login = new Scanner(System.in);
		String user = null;
		String password = null;
		for(int i=1;i<5;i++){
			if(i==4){
				System.out.println("����3�ε�¼ʧ�ܣ��������ٵ�¼");
				break;
			}
			System.out.println("�������û���:");
			user = login.next();
			System.out.println("����������:");
			password = login.next();	
			if(("admin".equals(user)) && ("asjy".equals(password))){
				System.out.println("��½�ɹ�����");
				break;
			}else{
				System.out.println("�����µ�½��");
			}
		}
	}

}
