import java.util.*;
public class swapThirdvariable 
{
	public static void Swapped1()//using temp variable
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER:");
		int num1 = scan.nextInt();
		System.out.println("ENTER THE SECOND NUMBER:");
		int num2 = scan.nextInt();
		System.out.println("-------------------------------");
		System.out.println("BEFORE SWAPPING:");
		System.out.println("FIRST NUMBER :" + num1);
		System.out.println("SECOND NUMBER:" + num2);
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("-------------------------------");
		System.out.println("AFTER SWAPPING :");
		System.out.println("FIRST NUMBER:" + num1);
		System.out.println("SECOND NUMBER:" + num2);
	}
	public static void Swapped2()//using without temp variable
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER:");
		int num1 = scan.nextInt();
		System.out.println("ENTER THE SECOND NUMBER:");
		int num2 = scan.nextInt();
		System.out.println("-------------------------------");
		System.out.println("BEFORE SWAPPING:");
		System.out.println("FIRST NUMBER: " + num1);
		System.out.println("SECOND NUMBER: " + num2);
		
		num1 = num1 - num2; 
		num2 = num1 + num2; 
		num1 = num2 - num1; 
		System.out.println("-------------------------------");
		System.out.println("AFTER SWAPPING:");
		System.out.println("FIRST NUMBER:" + num1);
		System.out.println("SECOND NUMBER:" + num2);
		
	}
    public static void SwapByValue(int a,int b)
    {
    	int temp = a;
		a = b;
		b = temp;
    }
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//SwappingValues.Swapped1();
		swapThirdvariable .Swapped2();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("ENTER THE FIRST NUMBER:");
		int num1 = scan.nextInt();
		System.out.println("ENTER THE SECOND NUMBER:");
		int num2 = scan.nextInt();
		System.out.println("-------------------------------");
		System.out.println("BEFORE SWAPPING:");
		System.out.println("FIRST NUMBER:" + num1);
		System.out.println("SECOND NUMBER:" + num2);
		
		//swapThirdvariable .SwapByValue(num1,num2);
		
		System.out.println("-------------------------------");
		System.out.println("AFTER SWAPPING:");
		System.out.println("FIRST NUMBER:" + num1);
		System.out.println("SECOND NUMBER:" + num2);


	}

}