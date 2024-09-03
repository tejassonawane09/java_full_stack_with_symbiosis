//find the minimum and maximum number form array

public class minmaxArray {
   public int max(int [] array) {
      int max = 0;
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]>max) {
            max = array[i];
         }
      }
      return max;
   }
   public int min(int [] array) {
      int min = array[0];
     
      for(int i=0; i<array.length; i++ ) {
         if(array[i]<min) {
            min = array[i];
         }
      }
      return min;
   }
   public static void main(String args[]) {
      int[] myArray = {23, 92, 56, 39, 93};
      minmaxArray m = new minmaxArray();
      System.out.println("MAXIMUM:"+m.max(myArray));
      System.out.println("MINIMUM:"+m.min(myArray));
   }
}