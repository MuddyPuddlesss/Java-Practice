package class1;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// ���ϵͳ
		Scanner order = new Scanner(System.in);
		String username = null , username1 = null;
		String password = null , password1 = null;
		String again = null;
		System.out.println("����������...");
		System.out.println("�û�ע��:");
		System.out.println("*************************");
		while(true) {
			System.out.println("�û���:");
			username = order.next();
			System.out.println("����:");
			password = order.next();
			System.out.println("ȷ������:");
			again = order.next();
//			System.out.println(password);
//			System.out.println(again);
			if(password.equals(again)) {
				System.out.println("ע��ɹ���");
				while(true) {
					System.out.println("*************************");
					System.out.println("�û���¼:");
					System.out.println("�������û���");
					username1 = order.next();
					System.out.println("����������");
					password1 = order.next();
					if((username1.equals(username)) && (password1.equals(password))) {
						System.out.println("��½�ɹ�");
						break;
					}else {
						System.out.println("�û�����������������µ�¼��");
					}
				}
				break;
			}else {
				System.out.println("ע��ʧ�ܣ�������ע�ᣡ����");
				System.out.println("*************************");
			}
		}
		System.out.println("*************************");
		System.out.println("����Ҫ�������ǳ���? 1--���� 2--���� ����--�����ò�");
		int option = order.nextInt();
		int option1;
		if(option == 1) {
			System.out.println("ѡ��1-���㳴�� 2-��������?");
			option1 = order.nextInt();
			while(true) {
				if(option1 == 1) {
					System.out.println("��ѡ�������㳴�������Ժ�");
					break;
				}else if(option1 == 2) {
					System.out.println("��ѡ���˼������������Ժ�");
					break;
				}else {
					System.out.println("������������������");
				}
			}
		}else if(option == 2) {
			System.out.println("ѡ��1-��˿���� 2-�߲�����?");
			option1 = order.nextInt();
			while(true) {
				if(option1 == 1) {
					System.out.println("��ѡ������˿���棬���Ժ�");
					break;
				}else if(option1 == 2) {
					System.out.println("��ѡ�����߲����棬���Ժ�");
					break;
				}else {
					System.out.println("������������������");
				}
			}
		}else {
			System.out.println("ף��������죬��ӭ�´ι��٣�");
		}
	}

}
