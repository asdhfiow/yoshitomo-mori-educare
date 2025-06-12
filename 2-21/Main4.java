import java.util.ArrayList;
import java.util.Collections;

public class Main4 {
    public static void main(String[] args){

        ArrayList<Integer> numbers = new ArrayList<>();

        processNumbers(numbers);
        int max = Collections.max(numbers);
        int min = Collections.min(numbers);

        System.out.println("最大値：" + max);
        System.out.println("最小値：" + min);
    }

    public static void processNumbers(ArrayList<Integer> numbers){
        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);
        numbers.add(9);

        Collections.sort(numbers);

        System.out.println("ソート後：" + numbers);
    }
}
