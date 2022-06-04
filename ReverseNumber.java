package Loop;

import java.util.Scanner;

public class ReverseNumber {
	//program to reverse number
	public static void main(String[] args) {

	int i,n; //taking variable
	Scanner sc=new Scanner(System.in);
	System.out.println("enter range to natural no:"); // taking number from user 
	n=sc.nextInt();

	for(i=n;i>=1;i--)  //condition for reverse the number
	{
		System.out.println(i);
	}
}
}
