import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;


public class Main5{
    // 数値を２倍する関数
    static Function<Integer, Integer> multiplyByTwo = x -> x * 2;

    // 数値から５を引く関数
    static Function<Integer, Integer> subtractFive = x -> x - 5;

    // 正の数かどうか判定する関数
    static Predicate<Integer> isPositive = x -> x > 0;

    public static void main(String[] args){
        int num = 8;

        Stream.of(num)
                .map(multiplyByTwo)
                .map(subtractFive)
                .filter(isPositive)
                .forEach(x -> System.out.println("正の数です"));
    }
}
