package susanta;
import java.util.Scanner;
public class BonucOfEmp {
	public static void main(String[] args) {
		

		Scanner scan=new Scanner(System.in);

		int yearOfService;

		System.out.print("Enter employee year of service :");
		
		yearOfService=scan.nextInt();

		if(yearOfService<=0){
			System.out.print("Enter valid year of service :");
			
			yearOfService=scan.nextInt();
		}
		
		if(yearOfService>3){
			System.out.println("Your bonus amount is 2500 Rs");
		}else{
			System.out.println("Your bonus amount is 0 Rs");
			
		}
		
		scan.close();

	}
}

