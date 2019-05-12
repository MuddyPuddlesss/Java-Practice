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
		String xx= "姓名:"+empName+" 年龄:"+empAge + "性别:"+empSex;
		return xx;

	}
}
