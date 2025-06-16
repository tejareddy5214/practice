package trails;

class Employees {
    String name;
    int salary;
    Employees(String name,int salary){
        this.name = name;
        this.salary = salary;
    }
    public void setSalary(String name,int salary) {
        this.name = name;
        this.salary = salary;
        System.out.println("Details updated");
    }

}

class Developer extends Employees{
    public Developer(String name,int salary){
        super(name,salary);
//        return super(name,salary);
    }
}

class Manager extends Employees {
    public Manager(String name, int salary) {
//        void setSalary;
//        void getSalary(name);
        super(name,salary);

    }

    public int getSalary(String name){
        this.name = name;
        System.out.println(super.salary);
        return this.salary+100000000;
    }
}
public class Learning00008 {
    public static void main(String[] args){
        Manager manager = new Manager("teja",90000);
        manager.setSalary("teja", 100000);
        System.out.println(manager.getSalary("teja"));
    }
}

