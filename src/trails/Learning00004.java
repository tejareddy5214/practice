package trails;

import javax.xml.namespace.QName;

abstract class Employee{
//    private String name;
//    private String type; //partTime/Fulltime
//    private int leaves;
//    public  Employee(){
////        this.name = name;
////        this.type = type;
////        this.leaves = leaves;
//    }
    abstract void calculateSalary();//String name,String type,int leaves
//    public int showDetails(){
//
//    }
}
class SalaryCalculation extends Employee {
    String name;
    String type;
    int leaves;
    public SalaryCalculation(String name,String type,int leaves){
        this.name = name;
        this.type = type;
        this.leaves = leaves;
    }

    @Override
    void calculateSalary(){
        if(type == "Fulltime"){
            int fulltimeSalary = (30000/30)*(30-leaves); //30000 monthly salary
            System.out.println("This Month salary :"+fulltimeSalary);
        }
        else {
            int parttimeSalary = (30*8*100)-(8*100);
            System.out.println("Your Salary @ 100rs/hr "+parttimeSalary);
        }

    }
}
public class Learning00004 {
    public static void main(String[] args){
        SalaryCalculation emp = new SalaryCalculation("Teja","Parttime",8);
//        emp.employeeDetails();
        emp.calculateSalary();
    }
}
//Design an abstract class Employee with:
//Abstract method calculateSalary()
//Concrete method showDetails() that prints "Employee details..."
//Create two subclasses:
//FullTimeEmployee: Implement calculateSalary() with a fixed monthly salary.
//PartTimeEmployee: Implement calculateSalary() based on an hourly wage.
//Now, create an interface Benefits with a method getBenefits().
//Implement this interface in FullTimeEmployee (e.g., "Health Insurance, Paid Leave")
//Implement this interface in PartTimeEmployee (e.g., "Flexible Work Hours")
//Test with objects and method calls.
