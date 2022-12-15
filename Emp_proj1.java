package basicprogram;
import java.util.Scanner;
public class Emp_proj1 {

	public static void main(String[] args) {
		
		    float basicSalary, hra, da, grossSalary;
		    Scanner sc = new Scanner(System.in);
		    
		    System.out.print("Enter Basic Salary: ");
		    basicSalary = sc.nextFloat();
		    
		    if(basicSalary > 1500)
		    {
		      hra = 20 * basicSalary / 100;
		      da = 90 * basicSalary / 100;
		    }
		    else
		    {
		      hra = 500;
		      da = 70 * basicSalary / 100;
		    }
		    
		    grossSalary = basicSalary + hra + da;
		    
		    System.out.print("Gross Salary = "+grossSalary);
		  }


	}

