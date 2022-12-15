package susanta;
class emp{
	int empId;
    String empName;
    double basicSalary;
    String designation;
    
    public void setData(int empId,String empName,double basicSalary,String designation){
        this.empId = empId;
        this.empName = empName;
        this.basicSalary = basicSalary;
        this.designation = designation;
    }
    public void getData() {
    	System.out.println("Employee id "+empId+" Employee name "+empName+" Employee Salary "+basicSalary+" Employee Designation "+designation);
    }
    
    public double getAppraisal(){
        return (basicSalary * 0.1);
    }
    
    public double calculateTA(){
        if(designation.equals("manager"))
            return 3000;
        else
            return 1000;
    }
}
public class Employee {
	public static void main(String args[]) {
		emp Susanta = new emp();
		Susanta.setData(205, "Susanta",15000,"Manager");
		Susanta.getData();
		Susanta.getAppraisal();
		Susanta.calculateTA();
		}
	}
	 