package class1;

import java.util.Scanner;

public class Order {

	public static void main(String[] args) {
		// 点餐系统
		Scanner order = new Scanner(System.in);
		String username = null , username1 = null;
		String password = null , password1 = null;
		String again = null;
		System.out.println("程序启动中...");
		System.out.println("用户注册:");
		System.out.println("*************************");
		while(true) {
			System.out.println("用户名:");
			username = order.next();
			System.out.println("密码:");
			password = order.next();
			System.out.println("确认密码:");
			again = order.next();
//			System.out.println(password);
//			System.out.println(again);
			if(password.equals(again)) {
				System.out.println("注册成功！");
				while(true) {
					System.out.println("*************************");
					System.out.println("用户登录:");
					System.out.println("请输入用户名");
					username1 = order.next();
					System.out.println("请输入密码");
					password1 = order.next();
					if((username1.equals(username)) && (password1.equals(password))) {
						System.out.println("登陆成功");
						break;
					}else {
						System.out.println("用户名或密码错误，请重新登录！");
					}
				}
				break;
			}else {
				System.out.println("注册失败，请重新注册！！！");
				System.out.println("*************************");
			}
		}
		System.out.println("*************************");
		System.out.println("您需要炒饼还是炒面? 1--炒饼 2--炒面 其它--放弃用餐");
		int option = order.nextInt();
		int option1;
		if(option == 1) {
			System.out.println("选择1-鱿鱼炒饼 2-鸡蛋炒饼?");
			option1 = order.nextInt();
			while(true) {
				if(option1 == 1) {
					System.out.println("你选择了鱿鱼炒饼，请稍后！");
					break;
				}else if(option1 == 2) {
					System.out.println("你选择了鸡蛋炒饼，请稍后！");
					break;
				}else {
					System.out.println("输入有误，请重新输入");
				}
			}
		}else if(option == 2) {
			System.out.println("选择1-肉丝炒面 2-蔬菜烧面?");
			option1 = order.nextInt();
			while(true) {
				if(option1 == 1) {
					System.out.println("你选择了肉丝炒面，请稍后！");
					break;
				}else if(option1 == 2) {
					System.out.println("你选择了蔬菜烧面，请稍后！");
					break;
				}else {
					System.out.println("输入有误，请重新输入");
				}
			}
		}else {
			System.out.println("祝您生活愉快，欢迎下次光临！");
		}
	}

}
