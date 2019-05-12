package employee;

import java.util.Scanner;

public class Employeee {

		static Scanner scan = new Scanner(System.in);
		private String name;
		private int age;
		private String position;
		private double salary;

		public Employeee() {
			name = null;
			age = 18;
			position = "�ۺ����";
			salary = 1000;
		}

		// ��������
		public String getName() {
			setName();
			return name;
		}

		public void setName() {
			System.out.println("����������:");
			String name = scan.next();
			this.name = name;
		}

		// ��������
		public int getAge() {
			System.out.println("����������:");
			int age = scan.nextInt();
			this.age = age;
			setAge();
			return age;
		}

		public void setAge() {
			if (age < 18) {
				this.age = 18;
			}
		}

		// ����ְλ
		public String getPosition() {
			System.out.println("������ְλ:");
			String position = scan.next();
			setPosition(position);
			this.position = position;
			return position;
		}

		public void setPosition(String x) {
			if (x != "�ۺ����" && x != "����Ա") {
				x = "�ۺ����";
			}
		}

		// ���ù���
		public double getSalary() {
			double salary = setSalary();
			this.salary = salary;
			return salary;
		}

		public double setSalary() {
			if (age >= 18 && age <= 20) {
				salary = 1000;
			} else if (age >= 21 && age <= 25) {
				salary = 1500;
			} else if (age >= 26 && age <= 30) {
				salary = 2000;
			} else if (age >= 31 && age <= 40) {
				salary = 3000;
			} else if (age >= 41 && age <= 50) {
				salary = 3500;
			} else {
				salary = 4000;
			}
			return salary;
		}

		public void show() {
			System.out.println("ְԱ:" + name + " ����:" + age + " ְλ:" + position + " ����:" + salary);
		}
}
