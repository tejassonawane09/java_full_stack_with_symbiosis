//ADDITION OF TWO DIMENTIONAL MATRIX 
public class addTwodMatrix{

    public static void main(String[] args) {
        int rows = 2, columns = 3;
        int[][] max1 = { {2, 3, 4}, {5, 2, 3} };
        int[][] max2 = { {-4, 5, 3}, {5, 6, 3} };

        // Adding Two matrices
        int[][] sum = new int[rows][columns];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                sum[i][j] = max1[i][j] + max2[i][j];
            }
        }

        // Displaying the result
        System.out.println("ADDITION OF TWO MATRIX IS: ");
        for(int[] row : sum) {
            for (int column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }
}