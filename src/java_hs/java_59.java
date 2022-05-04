package java_hs;

class Employee {
	private String name;
	private int age;
	private String address;
	private String department;
	private int money;
	
	public String getName(String name) {
		this.name = name;
		return name;
	}
	
	public int getAge(int age) {
		this.age = age;
		return age;
	}
	
	public String getAddress(String address) {
		this.address = address;
		return address;
	}
	
	public String getDepartment ( String department) {
		this.department = department;
		return department;
	}
	
	public void printInfo() {
		System.out.println(name +" "+ age +" "+ address +" "+ department);
		
	}
	
}

class Regular extends Employee {
	
}

class Temporary extends Employee {
	
	
}

public class java_59 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
