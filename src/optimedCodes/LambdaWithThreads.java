package optimedCodes;

import java.util.Arrays;
import java.util.List;

public class LambdaWithThreads {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Gangadhar","Sarath","Swamy","Jaswanth","Siva");
        Thread t1 = new Thread(()->sortingOfList(list));
        System.out.println("Main Thread name: \'"+Thread.currentThread().getName()+"\'");
        t1.start();

    }
    static void sortingOfList(List<String> stringList){
        CompareMethod lambdaExp = (a, b)->a.compareTo(b);
        stringList.sort(lambdaExp::comparing);
        stringList.forEach(System.out::println);
        System.out.println("Curent Running Thread: \'"+Thread.currentThread().getName()+"\'");
    }
}

@FunctionalInterface
interface CompareMethod{
    int comparing(String a,String b);
}
