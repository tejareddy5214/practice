package trails;

import java.util.ArrayList;
import java.util.List;

public class Java9update {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(List.of("hello", "START", "world", "!", "END", "how", "are", "you", "?"));
        List<String> res = words.stream()
                .dropWhile(i->!i.equals("START")).skip(1)
                .takeWhile(j->!j.equals("END"))
                .toList();
        System.out.println(res.toString());
    }
}
