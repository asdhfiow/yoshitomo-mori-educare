import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        ArrayAccessor accessor = new ArrayAccessor(numbers);

        int[] testIndexes = {1, 5};  // 位置1と位置5でテスト

        for (int index : testIndexes) {
            System.out.println("\n位置" + index + "の要素");
            try {
                System.out.println(accessor.getElement(index));
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("エラー：指定された位置は範囲外です");
            }
    }
}
}