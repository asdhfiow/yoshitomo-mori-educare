public class Main3 {
    public static void main(String[] args) {
        Product p = new Product("りんご", 100);

        // 初期在庫表示
        p.displayInfo();

        // 50個販売
        p.removeStock(50);
        p.displayInfo();

        // 10個追加
        p.addStock(10);
        p.displayInfo();

        // 在庫不足エラーを表示（100個以上販売しようとする）
        p.removeStock(100);
    }
}
