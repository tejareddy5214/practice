package trails;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MultiMap {
    public Stream<Integer> repeatByValue(Stream<Integer> numbers) {
        return numbers.mapMulti((number, consumer) -> {
            IntStream.range(0, number).forEach(i -> consumer.accept(number));
        });
    }

    public static void main(String[] args) {
        MultiMap mm = new MultiMap();
        mm.repeatByValue(Stream.of(1, 2, 3))
                .forEach(System.out::println); // Output: 1 2 2 3 3 3
    }
}
