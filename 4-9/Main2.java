public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        ArrayAccessor accessor = new ArrayAccessor(numbers);

        System.out.println("\n位置1の要素");
        try {
            System.out.println(accessor.getElement(1));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー：指定された位置は範囲外です");
        }

        System.out.println("\n位置5の要素");
        try {
            System.out.println(accessor.getElement(5));
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("エラー：指定された位置は範囲外です");
        }
    }
}
