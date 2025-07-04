package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicates {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,5,7,8,9,6,5,4,3,2,1));
        list = list.stream().distinct().toList();
        System.out.println(list);
    }
}
