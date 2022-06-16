package OOPs.polymorphism;

// parent class
class Bank
{
public void getInterestLoan()
{
	System.out.println("6% Interest Rate...!");	
}
} // end parent class

// child class // multiple child // overriding method
class SBI extends Bank
{
public void getInterestLoan()
{
	System.out.println("Rate of Interest 15%");	
}
}
class HDFC extends Bank
{
public void getInterestLoan()
{
	System.out.println("Rate of Interest 12%");	
}
}
class Axis extends Bank
{
public void getInterestLoan()
{
	System.out.println("Rate of Interest 8%");	
}
} //child class end
public class MethodOverridding {
	public static void main(String[] args) {
		
	/*	Axis axis = new Axis();  // creating object
		axis.getInterestLoan();  // calling method
		
		HDFC hdfc = new HDFC();
		hdfc.getInterestLoan();
		
		SBI sbi = new SBI();
		sbi.getInterestLoan(); */
		
		
		
		// upcasting
		
		Bank bank;  // reference variable of parent type
		bank = new SBI();   // object creating of child type
		bank.getInterestLoan();
		
		bank=new HDFC();
		bank.getInterestLoan();
		
		bank= new Axis();
		bank.getInterestLoan();
		
	}

}






