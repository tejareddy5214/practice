// Abstract class
abstract class Sunstar {
    abstract void printInfo();
}

// Abstraction performed using extends
class Employee extends Sunstar {
    void printInfo()
    {
        String name = "avinash";
        int age = 21;
        float salary = 222.2F;

        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}

// Base class
class Base {
    public static void main(String[] args)
    {
        Sunstar s = new Employee();
        s.printInfo();
    }
}
//package trails;
//
//import java.util.Scanner;
//
//class Learnning00001 {
//    public static  void  main(String[] args){
//        Scanner scn = new Scanner(System.in);
//        System.out.print(scn.nextInt()*155);
//    }
//}
// Java Program to Illustrate Final Arrays
// Where Compiler Error Is Thrown

// Main class
//class GFG {
//
//    int p = 20;
//
//    // Main driver method
//    public static void main(String args[])
//    {
//
//        // Creating objects of above class
//        final GFG t1 = new GFG();
//        GFG t2 = new GFG();
//
//        // Assigning values into other objects
//        t2 = t1;
//
//        System.out.println(t2.p);
//    }
//}