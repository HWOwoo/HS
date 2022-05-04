package java_hs;

class Employee {
	private String name;
	private int age;
	private String address;
	private String dept;
	
	public Employee (String name, int age, String addresss, String dept) {
		this.address = addresss;
		this.name = name;
		this.age = age;
		this.dept = dept;
	}
	
	public void printInfo() {
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("주소 : "+address);
		System.out.println("부서 : "+dept);
	}
}

public class java_36 {
	public static void main(String[] args) {
		
		Employee employee = new Employee("홍길동", 10, "서울시", "개발 1팀");
		employee.printInfo();
		
		concat();
		
	}

}
