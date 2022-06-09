package OOPs;

//java bean
class Employee
{
	//achieved encapsulation
private int empId;
private String empName;
private String designation;

//initializing data member constructor
public Employee(int empId,String empName,String designation)
{
	//ehen instance variable and local variable name will be same 
	//here creating ambiguity(confusion)
this.empId=empId;
this.empName=empName;
this.designation=designation;
}



//setter and getter
public int getEmpId() {
	return empId;
}




public void setEmpId(int empId) {
	this.empId = empId;
}




public String getEmpName() {
	return empName;
}




public void setEmpName(String empName) {
	this.empName = empName;
}




public String getDesignation() {
	return designation;
}




public void setDesignation(String designation) {
	this.designation = designation;
}

void getData()
{
	System.out.println("emp id : " + empId + " emp Name :"+empName + " designation : "+designation);
	
}
}

public class ThisAndSatiDemo {
	public static void main(String[] args)
	{
		Employee tauqir=new Employee(101,"Tauqir","Software Analyst");
		System.out.println(tauqir);
		tauqir.getData();
	}

}
