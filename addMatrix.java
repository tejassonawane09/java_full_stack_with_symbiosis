//addition of two matrix to give third matrix
import java.util.*;
public class addMatrix {
	
	public static void main(String[] args) {
		int max1row,max1col,max2row,max2col;
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE ROW OF FIRST MATRIX:");
		max1row=sc.nextInt();
		System.out.println("ENTER THE COLUMN OF FIRST MATRIX:");
		max1col=sc.nextInt();
		System.out.println("ENTER THE ROW OF SECOND MATRIX:");
		max2row=sc.nextInt();
		System.out.println("ENTER THE COLUMN OF SECOND MATRIX:");
		max2col=sc.nextInt();
		if(max1row==max2row && max1col==max2col) {
			int max1[][]=new int[max1row][max1col];
			int max2[][]=new int[max2row][max2col];		
			int max3[][]=new int[max2row][max2col];	
			System.out.println("ENTER ALL THE ELEMENTS OF FIRST MATRIX:");
			for(int i=0;i<max1row;i++) {
				for(int j=0;j<max1col;j++) {
					max1[i][j]=sc.nextInt();
				}
			}
			System.out.println("ENTER ALL THE ELEMENTS OF SECOND MATRIX:");
			for(int i=0;i<max2row;i++) {
				for(int j=0;j<max2col;j++) {
					max2[i][j]=sc.nextInt();
				}
			}
			System.out.println("FIRST MATRIX:");
			for(int i=0;i<max1row;i++) {
				for(int j=0;j<max1col;j++) {
					System.out.print(max1[i][j]+" ");
				}
				System.out.println();
			}
			System.out.println("SECOND MATRIX:");
			for(int i=0;i<max2row;i++) {
				for(int j=0;j<max2col;j++) {
					System.out.print(max2[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<max1row;i++) {
				for(int j=0;j<max2col;j++) {
					for(int k=0;k<max1col;k++) {
						max3[i][j]=max1[i][j]+max2[i][j];	
					}
				}
			}
			System.out.println("AFTER ADDITION FOR BOTH MATRIX IN THIRD MATRIX:");
			for(int i=0;i<max1row;i++) {
				for(int j=0;j<max2col;j++) {
					System.out.print(max3[i][j]+" ");
				}
				System.out.println();
			}
			}//if
		else {
			System.out.println("Addition would not be possible");
		}
	}

}
