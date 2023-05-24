package inheritances;

class Company {

	String name;

	Company(String name) {
		this.name = name;
	}

	void display() {
		System.out.println("Company Name:" + this.name);
	}

	public static void main(String[] args) {
		System.out.println("program starts");

	}
}

class Employee extends Company {
	int employeeNo;
	int salary;

	Employee(int employeeNo, int salary, String companyName) {
		super(companyName);
		// global var = local var
		this.employeeNo = employeeNo;
		this.salary = salary;
	}

	void display() {
		System.out.println("Employee No:" + this.employeeNo);
		System.out.println("Employee salary:" + this.salary);
		super.display();

	}

}

public class Inheritance10 {

	public static void main(String[] args) {
		Employee employee = new Employee(1, 1000, "ABC");
		employee.display();
	}

}