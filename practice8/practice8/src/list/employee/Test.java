package list.employee;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List list = new ArrayList();
		String empName = null;
		int empAge = 0, i = 0;
		String empSex = null;
		String next = null;
		do {
			i++;
			System.out.println("������Ա�����������䣬�Ա�");
			Employee[] emp = new Employee[20];
			emp[i] = new Employee(empName, empAge, empSex);
			emp[i].empName = scan.next();
			emp[i].empAge = scan.nextInt();
			emp[i].empSex = scan.next();
			list.add(emp[i].show());
			System.out.println("�Ƿ�Ҫ���� y---����������----�˳�");
			next = scan.next();
		} while ("y".equals(next));

		// System.out.println(list);
		Iterator it = list.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("������������ѯԱ���Ƿ����:");
		String name = scan.next();
		if (list.contains(name)) {
			System.out.println("����");
		} else {
			System.out.println("������");
		}

		// for(int j=0;j<list.size();j++){
		// System.out.println(list.get(j));
		// }
		// for(Object empl: list){
		// System.out.println(empl);
		// }
	}

}
