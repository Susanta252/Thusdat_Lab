package susanta;
import java.util.Scanner;// importing Classes/Files
public class PalindromeNumber {
	public static void main(String[] args) // Main Driver function
	{
		int num, rem, rev = 0, temp;
        System.out.println("Enter a number to check if it is a palindrome"); 
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();//reads the limit from the user
 
        temp = num;
        while (num > 0) {
            rem = num % 10;//getting remainder 
            rev = rev * 10 + rem;//calculates the power of a number up to digit times and add the resultant to the sum variable  
            num = num / 10;//removes the last digit
        }
        if (temp == rev)
            System.out.println(temp + " is a palindrome number");//print of the funtion
        else
            System.out.println(temp + " is not a palindrome number");//print of else funtion
	}
}
