// Java Program to demonstrate String
import java.util.*;
public class Stringreverse {

    // Main Function
    public static void main(String args[])
    {

        // creating Java string using a new keyword
        String str = new String("Geeks for Geek");
        String[] arr = str.split(" ");
        String sv = "";
        for(String s:arr){
            sv=s.concat(sv);
        }
        System.out.println(sv);
    }
}