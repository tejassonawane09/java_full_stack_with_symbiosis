
import java.util.Scanner;

public class sortAscending {
	public static void sbExample() {
		Scanner sc=new Scanner(System.in);
		int[] arrayName = new int[5];//declaring array with size 5
				
		for(int i=0;i<arrayName.length;i++) {
			System.out.println("ACCEPT THE DATA FORM USER:");
			arrayName[i] =sc.nextInt();
		}
		System.out.println("GETING NUMBER FROM USERS:");
		for(int i=0;i<arrayName.length;i++) {
			for(int j=i+1;j<arrayName.length;j++) {
				if(arrayName[j]<arrayName[i])
				{
					int temp=arrayName[i];
					arrayName[i]=arrayName[j];
					arrayName[j]=temp;	
				}
			}
		}
		for(int i=0;i<arrayName.length;i++) {
			System.out.println("Array"+arrayName[i]);
		}
	}
	public static void main(String[] args) {
	
		sbExample();

	}

}
