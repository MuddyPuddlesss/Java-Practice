package day2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class User {
	public static void main(String[] args) {
		UserBizImpl ub = new UserBizImpl();
		try {
			ub.register("admin88", "123", "123", "Admi", "11@163.com");
		    ub.login("admin999", "123");
		} catch (RegisterException e) {
			e.printStackTrace();
		} catch (LoginException e){
			e.printStackTrace();
		}
	}
	private String username;
	private String password;
	private String name;
	private String email;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}

class LoginException extends Exception{
	public LoginException(String msg){
		super(msg);
	}
}
class RegisterException extends Exception{
	public RegisterException(String msg){
		super(msg);
	}
}

interface UserBiz{
	void register(String username, String password, String password2,  String name, String email) throws RegisterException;
	void login(String username, String password) throws LoginException;
}

class UserBizImpl implements UserBiz{
	Map<String,User> m_user = null;
	public UserBizImpl(){
		m_user = new HashMap<String,User>();
		User user1 = new User();
		user1.setUsername("admin");
		user1.setPassword("admin");
		user1.setName("Administrator");
		user1.setEmail("admin@123.com");
		
		User user2 = new User();
		user2.setUsername("tom");
		user2.setPassword("cat");
		user2.setName("tomcat");
		user2.setEmail("tomcat@cat.com");
		
		m_user.put(user1.getUsername(), user1);
		m_user.put(user2.getUsername(), user2);
	}


	@Override
	public void register(String username, String password, String password2,String name, String email) throws RegisterException{
		Set<String> keys = m_user.keySet();
		Iterator<String> it = keys.iterator();
		//�ж��û����Ƿ����
		while(it.hasNext()){
			String key = it.next();
			if(username.equals(key)){
				throw new RegisterException("�û����Ѵ���");
			}
		}
		//�ж����������Ƿ�һ��
		if(!password.equals(password2)){
			throw new RegisterException("�������벻һ��");
		}
		//�������
		User u = new User();
		u.setUsername(username);
		u.setPassword(password);
		u.setName(name);
		u.setEmail(email);
		m_user.put(u.getUsername(), u);
		
		
		
	}

	@Override
	public void login(String username, String password) throws LoginException {
		Set<String> keys = m_user.keySet();
		Iterator<String> it = keys.iterator();
		//�ж��û����Ƿ����
		while(it.hasNext()){
			String key = it.next();
			if(!username.equals(key)){
				throw new LoginException("�û���������");
			}
		}
		
		//�ж��û����������Ƿ���ȷ
		while(it.hasNext()){
			String key = it.next();
			if(username.equals(key)){
				if(!password.equals(m_user.get(key).getPassword()))
				   throw new LoginException("�û������������");
			}
			if(password.equals(m_user.get(key).getPassword())){
				if(!username.equals(key))
				   throw new LoginException("�û������������");
			}
		}
		
		
		
		
		
	}
	
}