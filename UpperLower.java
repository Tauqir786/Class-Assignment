package Training;
import java.util.Scanner;
public class UpperLower {
	public static void main(String args[])
	{
		//checking the character is uppercase or lowercase
		 char ch;
		 Scanner scan=new Scanner(System.in); 
		    
		System.out.println("Enter the character  "); //taking character value from user
		ch=scan.next().charAt(0);
		if(ch>='A' && ch<='Z'){
		    System.out.println(ch+" is an upper case letter ");
		}
		else if(ch>='a' && ch<='z')
		{
		    System.out.println(ch+" is a lower case letter ");
		}
		else
		{
		    System.out.println(ch+" is not a Alphabets ");
		}
		}
	
	}