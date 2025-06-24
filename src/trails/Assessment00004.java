package trails;
import java.util.*;
import java.util.stream.IntStream;

public class Assessment00004 {
    public  static void main(String[] args) {
        int i = 10;
        int x = 1;
        for (int v = 1; v <= i; v++) {
            x *= v;
        }
        System.out.println(x);
//        Arrays.stream(new int[]{x})
         IntStream.range(1,x+1).forEach(System.out::println);
    }
}
//        wap to print factorial of a number
