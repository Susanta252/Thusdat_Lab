package susanta;
import java.util.Scanner;// importing Classes/Files

	public class StrongNumber { 

	    public static void main(String[] args) // Main Driver function
	    { 

	        int number, temp, total = 0; 
	        int remainder, fact; 

	        System.out.println("Enter a number: "); 
	        Scanner scanner = new Scanner(System.in); 
	        number = scanner.nextInt(); //reads the limit from the user

	        temp = number; 

	        while (temp != 0)
	        { 
	            remainder = temp % 10; // Get the last digit of the number
	            fact = 1; 

	            for (int i = 1; i <= remainder; i++)// Calculating the factorial of last digit
	            { 
	                fact = fact * i; // Resetting the factorial
	            } 
	            total = total + fact; // Adding the factorial of last digit to sum
	            temp = temp / 10; // Removing the last digit of the number
	        } 

	        if (total == number) // Check if sum is equal to the given number
	            System.out.println(number + " is a strong number"); 
	        else
	            System.out.println(number + " is not a strong number"); 
	    } 
	}