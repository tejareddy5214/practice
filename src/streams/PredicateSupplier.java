package streams;

import java.time.LocalDateTime;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class PredicateSupplier {
    public static void main(String[] args) {
        Predicate<Integer> predicate = (a)-> a%2==0;
        System.out.println(predicate.negate().test(10));
        Predicate<String> predicate1 = (a)-> a.startsWith("x",2);
        System.out.println(predicate1.negate().test("abxvz"));
        BiPredicate<String,String> biPredicate = (a, b)->a.equalsIgnoreCase(b);
        System.out.println(biPredicate.negate().test("FiLe","file"));
        BiPredicate<String,String> biPredicate1 = (a, b)->a.equals(b);
        System.out.println(biPredicate1.test("File","file"));
        BiPredicate<String,String> biPredicate2 = biPredicate.and(biPredicate1);
        System.out.println(biPredicate2.test("FiLe","file"));
        BiPredicate<String,String> biPredicate3 = biPredicate.or(biPredicate1);
        System.out.println(biPredicate3.test("FiLe","file"));

        Supplier<String> supplier = () -> {
            LocalDateTime dateTime = LocalDateTime.now();
            return dateTime.toString();
        };
        System.out.println(supplier.get());

    }
}
