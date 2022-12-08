package susanta;
import java.util.Scanner;// importing Classes/Files
public class ArmstrongNumber {

	public static void main(String[] args) // Main Driver function
	{
		 int num, number, temp, total = 0;
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.println("Enter a 3 digit number: "); //reads the limit from the user 
	        num = scanner.nextInt();
	        
	        scanner.close();
	        number = num;
	        
	        for (; number != 0; number /= 10)
	        	//loop execute until the condition becomes false
	        {
	            temp = number % 10; //determines the last digit from the number 
	            total = total + temp*temp*temp; 
	        }

	        if(total == num)
	            System.out.println(num + " is an Armstrong number"); //print of the funtion
	        else
	            System.out.println(num + " is not an Armstrong number"); //print of else funtion

	}

}
