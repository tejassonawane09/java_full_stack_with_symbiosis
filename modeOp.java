//write a program find remainder without using module operator

import java.util.Scanner;

public class modeOp {
	int num1=0,num2=0,rem=0;
	
	public modeOp() {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER:");
		num1=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER:");
		num2=sc.nextInt();
		
		rem=num1-(num1/num2)*num2;
	}
	
	void show()
	{
		System.out.println("Remainder:"+rem);
	}

	public static void main(String[] args) {
		modeOp sc=new modeOp();
		sc.show();
		

	}

}
