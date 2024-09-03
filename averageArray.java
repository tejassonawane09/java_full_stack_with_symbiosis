//calculate average number in given array
import java.util.*;
public class averageArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		//read total number of elements in array
		System.out.println("ENTER THE HOW MANY ELEMENTS WANTS STORE:");
		int num=sc.nextInt();
		
		//creating array
		int[] myarray=new int[num];
		
		//read the elements of array 
		System.out.println("ENTER ARRAY ELEMENTS:");
		for(int i=0;i<num;i++) {
			myarray[i]=sc.nextInt();
		}
		
		//calculating average of array
		double average=0;
		for(int i=0;i<num;i++) {
			average=average+myarray[i];
		}
		
		average/=num;
		System.out.println("AVEREAGE OF NUMBERS:"+average);
	}

}
