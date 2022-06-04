//write a program to check profit and loss
package Training;
import java.util.Scanner;
public class ProfitandLoss {
	public static void main(String [] args) {
		  float sp,cp; //taking variable
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter Cost price : "); //taking cost price from user
		cp=sc.nextFloat();
		
		System.out.println("Enter Selling price : "); //taking selling price from user
		sp=sc.nextFloat();
		
		if(cp>sp) {   //checking cost price is greater than selling price 
			System.out.println("Loss:" + (cp-sp));
		}
		
		else if (sp>cp) { //checking selling price  is greater than cost price
			
			System.out.println("Profit:" + (sp-cp));
			
		}
		else
			System.out.println("Equal");
		
		
		
	}

}
