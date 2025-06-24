package trails;
import java.util.*;

class Parent{
    void printx(){
        System.out.println("Parent method");
    }
}
class Child extends Parent{
    @Override
    void printx(){
        System.out.println("Child method also it's in Parent");
    }
    void printy(){
        System.out.println("Only in Child");
    }
}
public class TypeCasting {
    public static  void main(String[] args){
        Parent p=new Child(); //upcasting
        p.printx();
        Child c=(Child) new Child(); //downcasting
        c.printx();
        c.printy();
        Parent p1 = new Parent();
        p1.printx();
        List list = new ArrayList();
        list.add("String");
        System.out.println(list.get(0));
    }
}
