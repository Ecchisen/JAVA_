import java.util.Scanner;
public class class3 {
    //Program to add two matrices
    public static void main(String[] args) {
        int rows, cols;
        int[][] Matrix1;
        int[][] Matrix2;

        // Create a Scanner object
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = scan.nextInt();
        System.out.println("Enter number of columns: ");
        cols = scan.nextInt();

        // Initialize the matrices
        Matrix1 = new int[rows][cols];
        Matrix2 = new int[rows][cols];
        // Get the elements of first matrix
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.println("Enter element for 1st matrix position ["+i+"]"+"["+j+"]: ");
                Matrix1[i][j] = scan.nextInt();
            }
        }
        // Get the elements of second matrix
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.println("Enter element for 2nd matrix position ["+i+"]"+"["+j+"]: ");
                Matrix2[i][j] = scan.nextInt();
            }
        }
        scan.close();
        // Adding Two matrices
        int[][] sum = new int[rows][cols];
        for(int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }

        // Displaying the result
        System.out.println("Sum of two matrices is: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<cols; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}
