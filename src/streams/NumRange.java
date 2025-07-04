package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumRange {
    public static void main(String[] args){
        IntStream range = IntStream.range(1, 10+1);
        List<Integer> arr = range.boxed().toList();
        System.out.println(arr);
    }
}
