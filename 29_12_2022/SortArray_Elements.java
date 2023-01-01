import java.util.Scanner;

public class SortArray_Elements {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Enter the length of array : ");// Get the input from the user
    int lengthOfArray = scanner.nextInt();
    int[] array = new int[lengthOfArray];  // Create an array
    
    System.out.println("Enter the elements of array : "); // Get the input from the user
    for (int i = 0; i < lengthOfArray; i++) {
      array[i] = scanner.nextInt();
    }
    // Sort the array
    for (int i = 0; i < lengthOfArray; i++) {
      for (int j = i + 1; j < lengthOfArray; j++) {
        if (array[j] < array[i]) {
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
    // Print the sorted array
    System.out.print("Sorted array : ");
    for (int i = 0; i < lengthOfArray; i++) {
      System.out.print(array[i] + " ");
    }
    scanner.close();
  }
}