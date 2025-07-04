package streams;

import javax.management.OperationsException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Searching {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1,5,7,8,9,6,5,4,3,2,1));
        Integer j =6;
        boolean resp = list.stream().anyMatch(i->i==6);
        System.out.println(resp);
    }
}
