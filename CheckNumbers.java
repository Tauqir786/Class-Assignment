package Training;
import java.util.Scanner;
public class CheckNumbers {
	//checking the numbers is negative,positive or zero
	public static void main(String [] args) 
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Enter the number :");
		a=sc.nextInt();
		
		if(a<0)
		{
			System.out.println("Number is Negative "+ a);
		}
		else if (a>0)
		{
			System.out.println("Number is Positive "+a);
		}
		else
		{
			System.out.println("Number is Zero "+a);
		}
		
		
		
	}
}
