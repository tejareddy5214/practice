package trails;
class Calculator{
    void add(int x,int y){
        System.out.println(x+y);
    }
}
class MathOperations extends Calculator{
    @Override
    void add(int x,int y) {
        System.out.println("Performing Addition....");//super.add();
    }
}
class Polymorphism{
    static int sumofTwo(int a,int b){
        return a+b;
    }
    static  double sumofTwo(double a,double b){
        return  a+b;
    }
    static  String sumofTwo(String a,String b){
        return a.concat(b);
    }
}
public class Learning00005 {
    public  static void main(String[] args){
        MathOperations cal = new MathOperations();
        cal.add(5,9);
//        System.out.println(Polymorphism.sumofTwo(5,6));
//        System.out.println(Polymorphism.sumofTwo(5.54,6.54454));
//        System.out.println(Polymorphism.sumofTwo("teja"," Reddy"));

    }
}
//3. Polymorphism (Method Overloading & Overriding)
//Question 3:
//Create a MathOperations class that demonstrates method overloading:
//add(int a, int b) → returns sum of two integers
//
//
//add(double a, double b) → returns sum of two doubles
//
//
//add(String a, String b) → concatenates two strings
//
//
//Now, create a Calculator class that inherits from MathOperations and overrides the add() method to
// print "Performing addition..." before calling the parent method.
//Test the methods in the main() function.
