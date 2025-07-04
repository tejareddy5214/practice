package streams;

import java.util.List;
import java.util.stream.IntStream;

import static java.lang.Integer.*;
import static java.lang.System.*;

public class NumMultiples {
    public static void main(String[] args) {
        IntStream nostream = IntStream.range(1,10+1);
        List<Integer> list = nostream.boxed().toList();
        list.forEach(i -> {
            list.forEach(j -> System.out.println(i + " x " + j + " = " + (i * j)));
        });
    }
}
