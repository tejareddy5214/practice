package trails;
abstract class parentClass{
    abstract void run();
     public void exitSys(){
        System.out.println("Parent class");
    }
}
public class AbstractionMethod extends parentClass{
    public static void main(String[] args){
        parentClass abstractionMethod = new AbstractionMethod();
        abstractionMethod.run();
        abstractionMethod.exitSys();
    }

    @Override
    void run() {
        System.out.println("Hello World");
    }
}
