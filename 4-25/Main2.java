import java.util.*;
import java.util.stream.Collectors;

public class Main2 {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "cherry");

        List<String> upperWords = words.stream()
                                       .map(String::toUpperCase)
                                       .collect(Collectors.toList());

        System.out.println(upperWords);  // → [APPLE, BANANA, CHERRY]
    }
}
