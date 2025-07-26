package streams;

import java.util.function.BiFunction;
import java.util.function.Consumer;

//1.Example with List and forEach using Consumer
//2.Write Example on BiFunction(create a BiFunction that takes two numbers as input and returns their sum)
public class FunctionConsumer {
    public static void main(String[] args) {
        String string = "Abbcdddddefff";
        Consumer<String> stringConsumer = (s)->{
            int mainCount =0;
            int repeatedCharacterCount =0;
            int mainCharIndex = 0;
            char ch = string.charAt (0);
            for (int i = 0; i < s.length (); i++) {
                char iteratorChar = string.charAt (i);
                if(iteratorChar==ch){
                    repeatedCharacterCount+=1;
                }
                else{
                    ch = string.charAt(i);
                    if(mainCount<repeatedCharacterCount){
                        mainCount=repeatedCharacterCount;
                        repeatedCharacterCount = 1;
                        mainCharIndex =i;
                    }

                }
            }
            System.out.println ("Index starting at "+(mainCharIndex-mainCount)+" have largest unique sequence count of: "+mainCount);
        };
        stringConsumer.accept (string);
        BiFunction<Integer,Integer,Integer> sumOfNumbers = (a, b)->a+b;
        System.out.println ("Sum is : "+
                sumOfNumbers.apply (10,5));
    }
}
