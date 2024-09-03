//5)find the ASCII value of given character

import java.util.*;
public class asciiValue 
{

	public static void main(String[] args) 
	{
	
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER THE CHARACTER:");
		char ch = sc.next().charAt(0);
		
		int asciivalue = (int) ch;
		
		System.out.println("ASCII VALUE OF" + ch + " is : " + asciivalue );

	}

}