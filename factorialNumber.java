//find factorial of given number
import java.util.*;
public class factorialNumber {
	int i,factorial=1,number;
	public void fact() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE NUMBER:");
		number=sc.nextInt();
		
		for(i=1;i<=number;i++) {
			factorial*=i;
		}
		System.out.println("FACTORIAL OF NUMBER IS:"+factorial);
	}
	
	public static void main(String[] args) {
		factorialNumber sc=new factorialNumber();
		sc.fact();

	}

}
