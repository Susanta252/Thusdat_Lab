import java.util.*;

public class Add_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the matrix dimensions
        System.out.println("Enter number of rows and columns of matrix");
        int rows = sc.nextInt();
        int columns = sc.nextInt();
        int[][] firstMatrix = new int[rows][columns];
        int[][] secondMatrix = new int[rows][columns];
        int[][] sum = new int[rows][columns];
        System.out.println("Enter the elements of first matrix");
        // Get the elements of the first matrix
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                firstMatrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix");
        // Get the elements of the second matrix
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                secondMatrix[i][j] = sc.nextInt();
            }
        }
         // Add the two matrices
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                sum[i][j] = firstMatrix[i][j] + secondMatrix[i][j];
            }
        }
        // Print the result
        System.out.println("Sum of two matrices is: ");
        for(int i=0; i<rows; i++) {
            for(int j=0; j<columns; j++) {
                System.out.print(sum[i][j]+" ");
            }
            System.out.println();
        }
    }
}