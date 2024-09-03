//check number is palindrome or not
import java.util.*;
public class palindromeNumber {
		int result,sum=0,temp,number;
		public void check() {
			Scanner sc=new Scanner(System.in);
			System.out.println("ENTER THE NUMBER:");
			number=sc.nextInt();
			temp=number;//set value to temper variable
			//using while loop
			while(number>0) {
				result=number%10;
				sum=(sum*10)+result;
				number=number/10;
			}
			if(temp==sum) 
				System.out.println("NUMBER IS PALINDROME");
			else
				System.out.println("NUMBER IS NOT PALINDROME");
		}
	public static void main(String[] args) {
		//creating contructor
		palindromeNumber sc=new palindromeNumber();
		sc.check();

	}

}
