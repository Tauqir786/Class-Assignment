package Training;
import java.util.Scanner;

public class StudentMarks {
	public static void main(String[] args) {
		 int Percentage;
		 Scanner sc=new Scanner(System.in);
			System.out.println("Write your percentage "); //taking percentage from the student
		Percentage=sc.nextInt();
		//checking percentage condition
		if((Percentage >= 90) && (Percentage<=100))
	    {
			System.out.println("\n Grade A");
		}
		
		else if ((Percentage>=80) && (Percentage<90))
			System.out.println("\n Grade B");
		
		else if ((Percentage>=70) && (Percentage<80))
			System.out.println("\n Grade C");
		
		else if ((Percentage>=60) && (Percentage<70))
			System.out.println("\n Grade D");
		
		else if ((Percentage>=40) && (Percentage<60))
			System.out.println("\n Grade E");
		
		else if ((Percentage<40) )
			System.out.println("\n Grade F");
		
	}

}