public class ArrayAccessor {
    private int[] array;

    public ArrayAccessor(int[] array) {
        this.array = array;
    }

    // 指定位置の要素を返す。範囲外なら例外スロー
    public String getElement(int index) throws ArrayIndexOutOfBoundsException {
        return String.valueOf(array[index]);
    }
}