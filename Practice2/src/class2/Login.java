package class2;
import java.util.*;
public class Login {

	public static void main(String[] args) {
		//模拟登录功能
		Scanner login = new Scanner(System.in);
		String user = null;
		String password = null;
		for(int i=1;i<5;i++){
			if(i==4){
				System.out.println("连续3次登录失败，不允许再登录");
				break;
			}
			System.out.println("请输入用户名:");
			user = login.next();
			System.out.println("请输入密码:");
			password = login.next();	
			if(("admin".equals(user)) && ("asjy".equals(password))){
				System.out.println("登陆成功！！");
				break;
			}else{
				System.out.println("请重新登陆：");
			}
		}
	}

}
