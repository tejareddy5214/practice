package trails.truckClass;
import java.io.Console;
class ReadClass{
    public static void main(String[] args){
        Console c=System.console();
        System.out.print("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome "+n);
    }
}