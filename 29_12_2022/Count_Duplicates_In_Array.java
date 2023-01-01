import java.util.Scanner;
public class Count_Duplicates_In_Array {
  public static void main(String[] args) {
    // Get the input from the user
    System.out.println("Please enter the size of an array: ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    System.out.println("Please enter the elements of an array: ");
    int[] array = new int[size];
    for (int i = 0; i < size; i++) {
      array[i] = input.nextInt();
    }
    // Count the duplicate elements in an array
    int count = 0;
    for (int i = 0; i < size; i++) {
      for (int j = i + 1; j < size; j++) {
        if (array[i] == array[j]) {
          count++;
        }
      }
    }
    // Print the result
    System.out.println("The number of duplicate elements in the array is: " + count);
  }
}