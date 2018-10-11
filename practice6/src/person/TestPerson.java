package person;
//import java.util.*;
public class TestPerson {

	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		
		Child child = new Child(null,0,null,null);
		child.show();
		child.game("ÀÏÓ¥×½Ð¡¼¦");
		System.out.println("");
		
		Student student = new Student(null,0,null,null);
		student.show();
		student.study("3°à");
	}

}
