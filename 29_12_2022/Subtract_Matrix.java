import java.util.Scanner;

public class Subtract_Matrix {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows in the matrix: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns in the matrix: ");
        int columns = sc.nextInt();
	// initialize two matrix
        int[][] matrix1 = new int[rows][columns];
        int[][] matrix2 = new int[rows][columns];
	// get user input for matrix 1
        System.out.println("Enter the elements of matrix 1: ");
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++)
                matrix1[i][j] = sc.nextInt();
	// get user input for matrix 2
        System.out.println("Enter the elements of matrix 2: ");
        for(int i = 0; i < rows; i++)
            for(int j = 0; j < columns; j++)
                matrix2[i][j] = sc.nextInt();
	// subtract matrix 1 and 2
        int[][] result = new int[rows][columns];
	// print result
        System.out.println("The subtraction of the two matrices is: ");
        for(int i = 0; i < rows; i++){
            for(int j = 0; j < columns; j++){
                result[i][j] = matrix1[i][j] - matrix2[i][j];
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
    }
}