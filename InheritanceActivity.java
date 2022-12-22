//Employee.java
class Employee {
    long employeeId;
    String employeeName;
    String employeeAddress;
    long employeePhone;
    double basicSalary;
    double specialAllowance;
    double hra;

    public Employee(){
        this.specialAllowance = 250.80;
        this.hra = 1000.50;
    }
    public Employee(long employeeId,String employeeName,String employeeAddress,long employeePhone, double basicSalary) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.employeeAddress = employeeAddress;
        this.employeePhone = employeePhone;
        this.basicSalary = basicSalary;
    }
    public double calculateSalary(){
        double salary = this.basicSalary + (this.basicSalary * this.specialAllowance/100) + (this.basicSalary * this.hra/100);
        return salary;
    }
    public double calculateTransportAllowance(){
        double transportAllowance = 10/100*basicSalary;
        return transportAllowance;
    }

}

//Manager.java
class Manager extends Employee{
    public Manager(long employeeId,String employeeName,String employeeAddress,long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }
    public double calculateTransportAllowance(){
        double transportAllowance = 15*basicSalary/100;
        return transportAllowance;
    }

}

//Trainee.java
class Trainee extends Employee{
    public Trainee(long employeeId,String employeeName,String employeeAddress,long employeePhone, double basicSalary) {
        super(employeeId, employeeName, employeeAddress, employeePhone, basicSalary);
    }

}

//InheritanceActivity.java
public class InheritanceActivity {
    public static void main(String args[]){
        //Test case #1
        Manager manager = new Manager(126534,"Peter","Chennai India",237844,65000);
        System.out.println("Salary of Manager is: "+manager.calculateSalary());
        //Test case #2
        Trainee trainee = new Trainee(29846,"Jack","Mumbai India",442085,45000);
        System.out.println("Salary of Trainee is: "+trainee.calculateSalary());
        //Calculating Transport Allowance
        System.out.println("Transport Allowance of Manager is: "+manager.calculateTransportAllowance());
        System.out.println("Transport Allowance of Trainee is: "+trainee.calculateTransportAllowance());
    }
}