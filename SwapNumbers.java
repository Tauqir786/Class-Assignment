//wap to swapping teo numbers without third variable
package Training;
import java.util.Scanner;
public class SwapNumbers {
	
	public static void main(String [] args) {
		int a,b;  //taking variable
		System.out.println("Enter the value of a and b :"); //taking input from user
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		b=sc.nextInt();
		// swapping value
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("After Swapping a=" +a+"b"+b);
		
		
		
	}

}
