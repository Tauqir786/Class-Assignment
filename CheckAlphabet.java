package Training;
import java.util.Scanner;
public class CheckAlphabet {
	public static void main(String [] args) 
	{
		//checking the character is an alphabet or not
		char az;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter any character = ");
		az=scan.next().charAt(0);
		if((az >= 'a' && az <= 'z') || (az >= 'A' && az <= 'Z'))
		{
			System.out.println(az + " is an Alphabet");
		}
		else
		{
			System.out.println(az + " is Not an Alphabet");
		}
	
		
		
		
	}
}
