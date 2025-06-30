public class Product {
    private String name;
    private int stock;

    public Product(String name, int stock) {
        this.name = name;
        this.stock = stock;
    }

    // 商品名を取得するgetter
    public String getName() {
        return name;
    }

    // 在庫数を取得するgetter
    public int getStock() {
        return stock;
    }

    // 在庫を追加する（正の値のみ許可）
    public void addStock(int amount) {
        if (amount <= 0) {
            System.out.println("エラー: 正の整数を入力してください");
            return;
        }
        stock += amount;
        System.out.println(amount + "個追加しました");
    }

    // 在庫を減らす（正の値のみ＆在庫不足のチェック）
    public void removeStock(int amount) {
        if (amount <= 0) {
            System.out.println("エラー: 正の整数を入力してください");
            return;
        }

        if (stock < amount) {
            System.out.println("エラー: 在庫が不足しています");
        } else {
            stock -= amount;
            System.out.println(amount + "個販売しました");
        }
    }

    // 商品情報を表示する
    public void displayInfo() {
        System.out.println("商品名: " + getName());
        System.out.println("在庫数: " + getStock() + "個");
    }
}
