import java.util.Arrays; 
import java.util.Scanner; 
  
public class Insert_Element 
{ 
    public static void main(String[] args) // Declare the array
    { 
        int size, index, element; 
        int[] array; 
        Scanner scan = new Scanner(System.in); 
          
        System.out.print("Enter array size: "); 
        size = scan.nextInt(); 
          
        array = new int[size+1]; 
          
        System.out.println("Enter array elements:"); // Insert the array element
        for (int i = 0; i < size; i++) // Initialize the array
        { 
            array[i] = scan.nextInt(); 
        } 
          
        System.out.print("Enter the index to insert element: "); // Get user input
        index = scan.nextInt(); 
          
        System.out.print("Enter element to be insert: "); // Insert the element
        element = scan.nextInt(); 
          
        for (int i = size; i > index; i--) 
        { 
            array[i] = array[i-1]; 
        } 
          
        array[index] = element; 
          
        System.out.print("Array after insertion: "); // Print the updated array
        for (int i = 0; i < size+1; i++) 
        { 
            System.out.print(array[i]+" "); 
        } 
    } 
}