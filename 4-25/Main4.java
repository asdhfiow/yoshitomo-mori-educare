import java.util.*;

public class Main4 {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        
        int sum = numbers.stream()
                        .filter(x -> x % 2 == 0) // 偶数を選ぶ
                        .mapToInt(x -> x * 2) // x * 2をしてIntStreamに変換
                        .sum(); // 合計する
            System.out.println(sum);
    }
}
