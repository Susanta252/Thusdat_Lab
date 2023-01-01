import java.util.Arrays;
import java.util.Scanner;

public class Merge_Array{
	
	public static void main(String[] args) {
		
		//initialize scanner
		Scanner sc = new Scanner(System.in);
		
		//prompt user to enter the size of two arrays
		System.out.println("Enter the size of the two arrays:");
		int size1 = sc.nextInt();
		int size2 = sc.nextInt();
		
		//create two arrays
		int[] array1 = new int[size1];
		int[] array2 = new int[size2];
		
		//prompt user to enter elements of two arrays
		System.out.println("Enter elements of array1:");
		for(int i=0; i<size1; i++)
			array1[i] = sc.nextInt();
		
		System.out.println("Enter elements of array2:");
		for(int i=0; i<size2; i++)
			array2[i] = sc.nextInt();
		
		//create a new array to store merged array
		int size3 = size1 + size2;
		int[] array3 = new int[size3];
		
		//copy elements of array1 and array2 to array3
		for(int i=0; i<size1; i++)
			array3[i] = array1[i];
		for(int i=0; i<size2; i++)
			array3[size1+i] = array2[i];
		
		//sorting the merged array
		Arrays.sort(array3);
		
		//print the merged array
		System.out.println("The merged array is:");
		for(int i=0; i<size3; i++)
			System.out.print(array3[i] + " ");
		
		//close scanner
		sc.close();
	}

}