import java.util.*;
import java.util.stream.Collectors;

public class Main3{
    public static void main(String[] args){
        List<String> words = Arrays.asList("banana" , "apple" , "data" , "cherry" , "elderberry");

        List<String> sortedWords = words.stream()
                                    .sorted() // アルファベット順にソート
                                    .filter(x -> x.length() >= 5) // ５文字以上の文字列
                                    .collect(Collectors.toList());
                                    
                                    System.out.println(sortedWords);
    }
}