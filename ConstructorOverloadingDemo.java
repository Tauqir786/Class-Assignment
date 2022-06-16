package OOPs.polymorphism;

class Employee
{
int empId;
String empName,empAdd;
long phno;
double salary;
String city,country;

//constructor to chaining
//constructor to initialize id,name,add

public Employee(int empId, String empName, String empAdd)
{
	this.empId = empId;
	this.empName = empName;
	this.empAdd = empAdd;
	
}
//constructor to initialize id,name,add,phno,salary

public Employee(int empId, String empName, String empAdd, long phno, double salary)
{
this(empId,empName,empAdd);
this.phno=phno;
this.salary=salary;
}

//constructor to initialize id,name,add,phno,salary,city,country

public Employee(int empId, String empName, String empAdd, long phno, double salary,String city,String country)
{
this(empId,empName,empAdd,phno,salary);
this.city=city;
this.country=country;
}

// getter
public int getEmpId() {
	return empId;
}

public String getEmpName() {
	return empName;
}

public String getEmpAdd() {
	return empAdd;
}

public long getPhno() {
	return phno;
}

public double getSalary() {
	return salary;
}

public String getCity() {
	return city;
}

public String getCountry() {
	return country;
}

}

public class ConstructorOverloadingDemo {

	public static void main(String[] args) {
		
		Employee emp1=new Employee(101, "AB Develliers","Pretoria", 1234567899, 500000, "Johannesburg", "South Africa");
		System.out.println("Employee Id       : "+ emp1.empId);
		System.out.println("Employee Name     : "+ emp1.empName);
		System.out.println("Employee Address  : "+ emp1.empAdd);
		System.out.println("Employee Phn No   : "+ emp1.phno);
		System.out.println("Employee Salary   : "+ emp1.salary);
		System.out.println("Employee City     : "+ emp1.city);
		System.out.println("Employee Country  : "+ emp1.country);
	}

}
