//calculate compound interest and simple interest 
import java.util.*;
public class interest {
	//variables declaration
	double principal,rate,time,numTime,calInterest;
	
	//calculating simple interest
	public void simpleInterest() {
		
		//creating object of scanner
		Scanner sc=new Scanner(System.in);
		
		//input from user
		System.out.println("ENTER THE PRINCIPAL:");
		principal=sc.nextInt();
		System.out.println("ENTER THE RATE:");
		rate=sc.nextInt();
		System.out.println("ENTER THE TIME:");
		time=sc.nextInt();
		
		//calculating 
		calInterest=(principal*rate*time)/100;
		System.out.println("SIMPLE INTEREST:"+calInterest);
		
	}
	
	//calculating compound interest
	public void compoundInterest() {
		//creating object of scanner
		Scanner sc=new Scanner(System.in);
		
		//input from user
		System.out.println("ENTER THE PRINCIPAL:");
		principal=sc.nextInt();
		System.out.println("ENTER THE RATE:");
		rate=sc.nextInt();
		System.out.println("ENTER THE TIME:");
		time=sc.nextInt();
		System.out.println("ENTER THE NUMBER OF TIME INTERST COMPOUNDED:");
		numTime=sc.nextInt();
		
		//calculating compound interest
		calInterest=principal*(Math.pow((1+rate/100),(time*numTime)))-principal;
		System.out.println("COMPOUND INTEREST:"+calInterest);
		
	}
	public static void main(String[] args) {
		//create constructor
		interest calInt=new interest();
		
		//calling both methods of calculating Simple Interest & Compound Interest
		//calInt.simpleInterest();
		calInt.compoundInterest();

	}

}
