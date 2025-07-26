package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
//Assignment:
//Create an employee with 10 recors, apply filter employees having sal greater than 25000 and less than 50000 and employees
//who are working as software
public class EmployeesDBSearch {
    public static void main(String[] args) {
        List<String> randomNames = Arrays.asList ("maxx","john","dheere","fury","neil","brone","mikey","snow","vick","Rocky");
        List<String> department = Arrays.asList ("DEVELOPER","TESTER","HR","SALES");
        List<Employee> employeesDataBase = new ArrayList<> ();
        for (int i = 0; i < 100; i++) {
            Employee employee = new Employee ();
            employee.setId (employeesDataBase.size ()+1);
            employee.setName (randomNames.get ((int)(Math.random()*10)));
            employee.setDepartment (department.get (new Random ().nextInt (department.size ())));
            employee.setSalary ((int)(Math.random ()*100000));
            employeesDataBase.add (employee);
//            System.out.println (employee.toString ());
        }
//        System.out.println (employeesDataBase.toString ());
        employeesDataBase.stream ()
                .filter (employee ->employee.getSalary ()>25000 && employee.getSalary ()<50000)
                .forEach (System.out::println);
        System.out.println ("==================================================================");
        employeesDataBase.stream ()
                .filter (employee ->employee.getDepartment ().equalsIgnoreCase ("Developer"))
                .forEach (System.out::println);
    }
}


class Employee{
    private int id;
    private String name;
    private String department;
    private int salary;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
      @Override
    public String toString(){
        return "Employee[id="+this.id+",name="+this.name+",department="+this.department+",salary="+this.salary+"]";
    }
}