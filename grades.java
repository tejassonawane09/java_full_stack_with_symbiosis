//calculate grades of the students base on their marks
import java.util.*;
public class grades{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE MARKS OF 5 SUBJECTS:");
		
		//input form user for five subjects marks
		int subject1 = sc.nextInt();
		int subject2 = sc.nextInt();
		int subject3 = sc.nextInt();
		int subject4 = sc.nextInt();
		int subject5 = sc.nextInt();
		int totol = subject1+subject2+subject3+subject4+subject5;
		float percentage = totol/5;
		System.out.println("Total :"+totol);
		System.out.println("Percentage :"+percentage);	
		
		//using condition statement if-elseif-else
		if(percentage>=90)
			System.out.println("Grade A");
		else if(percentage>=80)
			System.out.println("Grade B");
		else if(percentage>=70)
			System.out.println("Grade C");
		else if(percentage>=60)
			System.out.println("Grade D");
		else if(percentage>=40)
			System.out.println("Grade E");
		else
			System.out.println("Grade F");
	}
}