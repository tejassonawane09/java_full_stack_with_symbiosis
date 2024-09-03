
public class reverseArray {

	public static void main(String[] args) {
		//declaring array
		int[]array=new int[] {10,20,30,40,50};
		System.out.println("BEFORE REVERSING ARRAY:");
		for(int i=0;i<array.length;i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		//after reversing array
		System.out.println("AFTER REVERSING ORDER:");
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
		}
	}

}
