public class Product {
    private String name;
    private int stock;
    
    public Product(String name ,int stock){
        this.name = name;
        this.stock = stock;
    }

    // 商品名取得のgetterメソッド（表示専用）
    public void getProduct(){
        System.out.println("商品名: " + name);
    }

    // 在庫数取得用getterメソッド（表示専用）
    public void getQuantities(){
        if(stock < 0){
            System.out.println("エラー：不適切な値が入力されました");
        } else {
            System.out.println("在庫数: " + stock + "個");
        }
    }

    // 在庫を追加するメソッド
    public void addStock(int amount){
        stock += amount;
        System.out.println(amount + "個追加しました");
    }

    // 在庫を減少するメソッド
    public void removeStock(int amount){
        if (stock < amount) {
            System.out.println("エラー: 在庫が不足しています");
        } else {
            stock -= amount;
            System.out.println(amount + "個販売しました");
        }
    }
}
