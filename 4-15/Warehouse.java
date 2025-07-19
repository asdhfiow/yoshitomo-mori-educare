// ジェネリックな倉庫クラス
public class Warehouse<T> {
    // TODO: 商品を格納するフィールドを作成
    private T item;

    // TODO: 商品を格納するメソッド
    public void store(T item) {
        // TODO: itemを設定し、"商品追加: [商品名]" を表示
        this.item = item;
        System.out.println("商品追加: " + item);
    }

    // TODO: 商品を取り出すメソッド
    public T retrieve() {
        // 1. 現在の商品を一時変数に保存
        T temp = item;

        // 2. itemをnullに設定
        item = null;

        // 3. "取り出し: [商品名]" を表示
        System.out.println("取り出し: " + temp);

        // 4. 保存しておいた商品を返す
        return temp;
    }

    // TODO: 倉庫が空かどうかをチェックするメソッド
    public boolean isEmpty() {
        return item == null;
    }
}

