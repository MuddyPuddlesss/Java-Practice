package list.employee;

public class Employee {
	String empName;
	int empAge;
	String empSex;
	public Employee(String empName,int empAge,String empSex){
		this.empName = empName;
		this.empAge =empAge;
		this.empSex = empSex;
	}
	public String show(){
		String xx= "����:"+empName+" ����:"+empAge + "�Ա�:"+empSex;
		return xx;

	}
}
