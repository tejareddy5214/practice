package streams;

import java.util.ArrayList;
import java.util.List;

public class NumFrequency {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,5,7,8,9,6,5,4,3,2,1));
        long resp = list.stream().filter(integer -> integer == 1).count();
        System.out.println(resp);
    }
}
