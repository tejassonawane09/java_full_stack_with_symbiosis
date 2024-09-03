
import java.util.*;
class student1{
	int studentId,age,marks;
	String studentName;
	public student1(int studentId,String studentName,int age) {
		this.studentId=studentId;
		this.studentName=studentName;
		this.age=age;
	}//parameters constructor
}//parent class

class studchild extends student1{
	Scanner sc=new Scanner(System.in);
		int[] array=new int[4];
		float percentage;
		int total;
		
	public studchild(int studentId, String studentName, int age) {
		super(studentId, studentName,age);
//		System.out.println("ENTER THE STUDENT ID:");
//		 sid=sc.nextInt();
//		System.out.println("ENTER THE STUDENT NAME:");
//		 name=sc.next();
//		System.out.println("ENTER THE STUDENT AGE:");
//		 age=sc.nextInt()
		System.out.println("ENTER THE MARKS OF 5 SUBJECTS:");
		int marks=sc.nextInt();
		for(int i=0;i<array.length;i++) {
			System.out.println("ENTER THE MARKS OF 5 SUBJECTS:");
			int marks1=sc.nextInt();
			
			total=marks1+marks1+marks1+marks1+marks1;
			percentage=total/5;
		}
			System.out.println("TOTAL:"+total+"\t"+"PERCENTAGE:"+percentage);
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
	}//for loop
}//sub child
public class studGrades {

	public static void main(String[] args) {		
		studchild obj=new studchild(101,"TEJAS",20);
		
	}

}
